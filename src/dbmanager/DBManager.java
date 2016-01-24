package dbmanager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;

import dbstructure.DatStructure;
import dbstructure.Entry;
import dbstructure.EntryGroup;
import dbstructure.EntryStruct;
import gui.elements.FileFilterEx;

public class DBManager {

	private static final Map<String, DatStructure> allStructures = Arrays.stream(DatStructure.values()).collect(Collectors.toMap(t->t.fileName, t->t));
	private static final FileFilter fileFilter = new FileFilterEx("EE data file", allStructures.keySet());
	
	public DatStructure datStructure;
	public File file;
	
	
	
	public static DBManager selectFile(){
		JFileChooser chooseFile = new JFileChooser(new File("."));
		chooseFile.setAcceptAllFileFilterUsed(false);
		chooseFile.setFileHidingEnabled(false);
		chooseFile.addChoosableFileFilter(fileFilter);
		chooseFile.setVisible(true);
		chooseFile.setDialogType(JFileChooser.OPEN_DIALOG);
		int response = chooseFile.showDialog(null, "Select");
		
		if (response == JFileChooser.APPROVE_OPTION) {
			File choosenFile = chooseFile.getSelectedFile();
			if (choosenFile.exists()){
				DatStructure datStructure = allStructures.get(choosenFile.getName().toLowerCase());
				if (datStructure != null){
					return new DBManager(datStructure, choosenFile);
				}
			}
		}
		return null;
	}

	public DBManager(DatStructure datStructure, File file) {
		this.datStructure = datStructure;
		this.file = file;
		File backup = new File(file.getAbsolutePath() + ".orig");
		try {
			if (backup.exists()){
				Files.deleteIfExists(file.toPath());
				Files.copy(backup.toPath(), file.toPath());
			} else {
				Files.copy(file.toPath(), backup.toPath());
			}
		} catch (IOException e){
			e.printStackTrace();
		}
	}
	
	
	public List<EntryGroup> read() throws IOException {
		if (!file.exists()){
			throw new FileNotFoundException(file.toString());
		}
		List<EntryGroup> entryGroups = new ArrayList<>();
		try (Reader reader = new Reader(file)) {
			try {
				while(reader.getRemaining() > 0) {
					entryGroups.add(new EntryGroup(datStructure, readMode(reader)));
				}
			} catch (OutOfMemoryError e){
				System.out.println(e.getMessage());
			}
		}
		return entryGroups;
	}

	public List<Entry> readMode(Reader reader) throws IOException {
		int numEntries = reader.readInt(4) + datStructure.alterNumEntries;
		int numFields = datStructure.entries.length;
		System.out.println("Load entries: " + numEntries);
		try {
			List<Entry> entries = new ArrayList<Entry>(numEntries);
			Entry entry;
			EntryStruct entryStruct;
			Object read;
			//			StringBuilder sb;
			for (int i = 0; i < numEntries; i++) {	//<= because dbTechTree works differently...
				List<Object> values = new ArrayList<Object>(numFields);
				for (int j = 0; j < numFields; j++){
					entryStruct = datStructure.entries[j];
					switch(entryStruct.type){
						case STRING: read = reader.readChars(entryStruct.size); break;
						case FLOAT: read = reader.readFloat(entryStruct.size); break;
						default: read = reader.readInt(entryStruct.size); break;
					}
					values.add(read);
					//					sb = new StringBuilder().append('\t').append('\t').append('(').append(field.type).append(' ').append(field.size).append(')');
					//					sb.append(' ').append(field.name != null ? field.name : "Unknown").append(':').append(' ').append(read);
					//					System.out.println(sb);
				}
				if (datStructure.indexCountExtra >= 0 && datStructure.extraEntry != null){
					int numExtra = (int) values.get(datStructure.indexCountExtra);
					entryStruct = datStructure.extraEntry;
					for (int j = 0; j < numExtra; j++){
						read = reader.readInt(entryStruct.size);
						values.add(read);
					}
				}
				entry = new Entry(datStructure, values);
				entries.add(entry);
				System.out.println("Element: " + i + " | " + entry);
			}
			return entries;
		} catch (OutOfMemoryError e){
			System.out.println("Num = " + numFields + " " + numEntries);
			throw e;
		}
	}
	
	
	
	public void save(List<EntryGroup> entryGroups) throws IOException {
		File backup = new File(file.getAbsolutePath() + ".bak");
		Files.deleteIfExists(backup.toPath());
		Files.copy(file.toPath(), backup.toPath());
		
		int numBaseFields = datStructure.entries.length;
		int numEntries;
		int numFields;
		Entry entry;
		EntryStruct entryStruct;
		try (Saver saver = new Saver(file)) {
			for (EntryGroup entryGroup : entryGroups){
				numEntries = entryGroup.entries.size();
				saver.saveInt(numEntries - datStructure.alterNumEntries, 4);
				System.out.println("Save " + entryGroup + " entries: " + numEntries);
				
				//				StringBuilder sb;
				for (int i = 0; i < numEntries; i++){
					entry = entryGroup.entries.get(i);
					numFields = entry.values.size();
					for (int j = 0; j < numFields; j++){
						if (j < numBaseFields) {
							entryStruct = datStructure.entries[j];
						} else {
							entryStruct = datStructure.extraEntry;
						}
						try{
							switch (entryStruct.type){
								case STRING: saver.saveChars((String) entry.values.get(j), entryStruct.size); break;
								case FLOAT: saver.saveFloat((float) entry.values.get(j), entryStruct.size); break;
								default: saver.saveInt((int) entry.values.get(j), entryStruct.size); break;
							}
						} catch (ClassCastException e){
							System.out.println(e.getMessage());
						}
						//						sb = new StringBuilder().append('\t').append('\t').append('(').append(field.type).append(' ').append(field.size).append(')');
						//						sb.append(' ').append(field.name != null ? field.name : "Unknown").append(':').append(' ').append(entry.values.get(j));
						//						System.out.println(sb);
					}
					//					System.out.println('\n');
				}
			}
		}
	}
	
	
	
	public static class Reader implements AutoCloseable {
		private FileInputStream  reader;

		public Reader(File file) throws IOException {
			reader = new FileInputStream (file);
		}
		
		public int getRemaining() throws IOException{
			return reader.available();
		}

		public int readInt(int numBytes) throws IOException {
			byte[] buffer = new byte[numBytes];
			reader.read(buffer);
			return ByteManager.bytesToInt(buffer);
		}

		public float readFloat(int numBytes) throws IOException {
			byte[] buffer = new byte[numBytes];
			reader.read(buffer);
			return ByteManager.bytesToFloat(buffer);
		}

		public String readChars(int numBytes) throws IOException {
			byte[] buffer = new byte[numBytes];
			reader.read(buffer);
			return String.valueOf(ByteManager.bytesToChars(buffer));
		}

		@Override
		public void close() throws IOException {
			reader.close();
		}
	}
	
	public static class Saver implements AutoCloseable {
		private FileOutputStream writer;

		public Saver(File file) throws IOException {
			writer = new FileOutputStream(file);
		}

		public void saveInt(int value, int numBytes) throws IOException {
			byte[] buffer = ByteManager.intToBytes(value, numBytes);
			writer.write(buffer);
		}

		public void saveFloat(float value, int numBytes) throws IOException {
			byte[] buffer = ByteManager.floatToBytes(value, numBytes);
			writer.write(buffer);
		}
		
		public void saveChars(String chars, int numBytes) throws IOException{
			byte[] buffer = ByteManager.charsToBytes(chars.toCharArray(), numBytes);
			writer.write(buffer);
		}

		@Override
		public void close() throws IOException{
			writer.flush();
			writer.close();
		}
	}
	
}