package gui.elements;

import java.awt.Color;

import javax.swing.JToggleButton;

import dbstructure.EntryStruct;

@SuppressWarnings ("serial")
public class JToggleButtonEx extends JToggleButton implements ValueField {

	private EntryStruct entryStruct;
	private int index;

	public JToggleButtonEx(EntryStruct entryStruct, int index){
		this.entryStruct = entryStruct;
		this.index = index;
		if (entryStruct.name != null){
			setText(index + " " + entryStruct.name);
			setToolTipText(entryStruct.name);
		} else {
			setText(index + " Unknown");
			setForeground(Color.RED);
		}

	}

	@Override
	public EntryStruct getEntryStruct () {
		return entryStruct;
	}
	
	@Override
	public int getIndex(){
		return index;
	}
	
	@Override
	public boolean isFieldCompiled(){
		return true;
	}
	
	@Override
	public Object getVal(){
		return (isSelected() ? 1 : 0);
	}
	
	@Override
	public void setVal (Object value) {
		int val = (int) value;
		if (val == 0){
			setSelected(false);
		} else if (val == 1){
			setSelected(true);
		} else {
			throw new IllegalStateException("Questo valore non � boolean: " + value);
		}
	}

}