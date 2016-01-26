package dbstructure;

import java.awt.Color;

public class EntryStruct{
	
	public static final Color ID_COLOR = Color.BLUE;
	
	public static final char NOCHAR = 65484;
	public static final char b00 = 0x00;
	public static final char bCC = 65484;
	public static final char bFF = 0xFF;
	public static final String STRING_UNDEFINED = new String(new char[]{
			b00, bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC,
			bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC,
			bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC,
			bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC,
			bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC, bCC,
	});
	public static final String STRING_NONAME = "<No name>";
	
	public static final EntryStruct NAME = new EntryStruct("Name", Type.STRING, 100, Knowledge.KNOWN, EntryStruct.ID_COLOR);
	public static final EntryStruct SEQ_NUMBER = new EntryStruct("Sequence number", Type.INTEGER, 4, Knowledge.KNOWN, EntryStruct.ID_COLOR, false);
	public static final EntryStruct ID = new EntryStruct("ID", Type.INTEGER, 4, Knowledge.KNOWN, EntryStruct.ID_COLOR, false);
	public static final EntryStruct OBJECT_TECH = new EntryStruct ("Can build tech", Type.INTEGER, 4, Knowledge.KNOWN);
	
	public static final EntryStruct UNCHANGED_BOOL = new EntryStruct("Never changes", Type.BOOLEAN, 1, Knowledge.NEVER_CHANGE, Color.GRAY);
	public static final EntryStruct UNCHANGED_INT1 = new EntryStruct("Never changes", Type.INTEGER, 1, Knowledge.NEVER_CHANGE, Color.GRAY);
	public static final EntryStruct UNCHANGED_INT4 = new EntryStruct("Never changes", Type.INTEGER, 4, Knowledge.NEVER_CHANGE, Color.GRAY);
	public static final EntryStruct UNCHANGED_FLOAT = new EntryStruct("Never changes", Type.FLOAT, 4, Knowledge.NEVER_CHANGE, Color.GRAY);
	public static final EntryStruct UNUSED_BOOL = new EntryStruct("Never used", Type.BOOLEAN, 1, Knowledge.NEVER_USED, Color.GRAY);
	public static final EntryStruct UNUSED_INT1 = new EntryStruct("Never used", Type.INTEGER, 1, Knowledge.NEVER_USED, Color.GRAY);
	public static final EntryStruct UNUSED_INT4 = new EntryStruct("Never used", Type.INTEGER, 4, Knowledge.NEVER_USED, Color.GRAY);
	public static final EntryStruct UNUSED_FLOAT = new EntryStruct("Never used", Type.FLOAT, 4, Knowledge.NEVER_USED, Color.GRAY);
	public static final EntryStruct UNKNOWN_BOOL = new EntryStruct("Unknown", Type.BOOLEAN, 1, Knowledge.UNKNOWN, Color.RED);
	public static final EntryStruct UNKNOWN_INT1 = new EntryStruct("Unknown", Type.INTEGER, 1,  Knowledge.UNKNOWN, Color.RED);
	public static final EntryStruct UNKNOWN_INT4 = new EntryStruct("Unknown", Type.INTEGER, 4,  Knowledge.UNKNOWN, Color.RED);
	public static final EntryStruct UNKNOWN_FLOAT = new EntryStruct("Unknown", Type.FLOAT, 4,  Knowledge.UNKNOWN, Color.RED);
	


	public final String name;
	public final Type type;
	public final int size;
	public final Knowledge knowledge;
	public final boolean editable;
	public final Color color;
	


	public EntryStruct (String name){
		this.name = name;
		type = Type.BOOLEAN;
		size = 1;
		knowledge = Knowledge.KNOWN;
		color = Color.BLACK;
		editable = true;
	}

	public EntryStruct (String name, Type type, int size) {
		this.name = name;
		this.type = type;
		this.size = size;
		knowledge = Knowledge.KNOWN;
		editable = true;
		color = Color.BLACK;
	}

	public EntryStruct (String name, Type type, int size, boolean editable) {
		this.name = name;
		this.type = type;
		this.size = size;
		knowledge = Knowledge.KNOWN;
		color = Color.BLACK;
		this.editable = editable;
	}

	public EntryStruct (String name, Type type, int size, Knowledge knowledge) {
		this.name = name;
		this.type = type;
		this.size = size;
		this.knowledge = knowledge;
		color = Color.BLACK;
		editable = true;
	}

	public EntryStruct (String name, Type type, int size, Knowledge knowledge, Color color) {
		this.name = name;
		this.type = type;
		this.size = size;
		this.knowledge = knowledge;
		this.color = color;
		editable = true;
	}
	
	public EntryStruct (String name, Type type, int size, Knowledge knowledge, Color color, boolean editable) {
		this.name = name;
		this.type = type;
		this.size = size;
		this.knowledge = knowledge;
		this.color = color;
		this.editable = editable;
	}


	
	@Override
	public String toString(){
		return name + ' ' + '(' + type + ' ' + size + ')';
	}
	
}
