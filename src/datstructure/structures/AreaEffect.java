package datstructure.structures;

import constants.AreaEffectType;
import datstructure.DatStructure;
import datstructure.DatStructureParse;
import datstructure.DatStructureParse.ParseState;
import datstructure.FieldStruct;
import datstructure.Type;

/**
 * Represents the file dbdbareaeffect.dat
 * @author MarcoForlini
 */
@DatStructureParse(Vanilla = ParseState.MISSING_UNKNOWN, AOC = ParseState.MISSING_UNKNOWN)
public class AreaEffect extends DatStructure {

	/**
	 * Unique instance of this structure
	 */
	public static final AreaEffect instance = new AreaEffect();

	/**
	 * Creates a new {@link AreaEffect}
	 */
	private AreaEffect () {
		super("Area effects", "dbareaeffect.dat", true, 0, 1, 0, 0, 1, 2, 4, 125, 175);
	}

	@Override
	public void init () {
		fieldStructs = new FieldStruct[]{
				FieldStruct.NAME, FieldStruct.SEQ_NUMBER, FieldStruct.ID, new FieldStruct("Effect type", AreaEffectType.values()),
				FieldStruct.UNKNOWN_INT4, new FieldStruct("Effect on units", GFXEffects.instance, 0), new FieldStruct("Apply on unit set", UnitSet.instance, 0), FieldStruct.UNKNOWN_INT4,
				FieldStruct.UNUSED_INT4, ID_GRAPHIC, new FieldStruct("Max morale", Type.INTEGER), new FieldStruct("Heal effect", Type.INTEGER),
				FieldStruct.UNUSED_INT4, FieldStruct.UNUSED_INT4, FieldStruct.UNUSED_INT4, new FieldStruct("Area size", Type.FLOAT),
				FieldStruct.UNKNOWN_FLOAT, FieldStruct.UNKNOWN_FLOAT, FieldStruct.UNKNOWN_FLOAT, FieldStruct.UNKNOWN_FLOAT,
				FieldStruct.UNUSED_INT4, FieldStruct.UNUSED_INT4, FieldStruct.UNUSED_INT4
		};
		newEntryValues = new Object[]{
				"<New area effect>", 0, -1, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0, 0, 0f,
				0f, 0f, 0f, 0f, 0, 0, 0
		};
	}

	@Override
	public int indexExtraFields () {
		return -1;
	}

}
