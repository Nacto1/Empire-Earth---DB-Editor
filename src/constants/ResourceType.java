package constants;


/**
 * Resource codes used in an Object entry.
 * They defines the resource the resource contains/the building can receive.
 * @author MarcoForlini
 */
public enum ResourceType implements EnumValue {

	/** No resource */
	C0_None ("None", 0),
	/** (Only buildings) Can receive all resources */
	C1_All ("All", 1),
	/** Can have/receive food */
	C2_Food ("Food", 2),
	/** Can have/receive wood */
	C3_Wood ("Wood", 3),
	/** Can have/receive stone */
	C4_Stone ("Stone", 4),
	/** Can have/receive gold */
	C5_Gold ("Gold", 5),
	/** Can have/receive iron */
	C6_Iron ("Iron", 6),
	;
	
	
	/** Name to be shown in the UI */
	public final String name;
	
	/** Code used in the dat files */
	public final int code;

	
	ResourceType(String name, int code){
		this.name = name;
		this.code = code;
	}
	
	@Override
	public String getName(){
		return name;
	}
	
	@Override
	public int getCode () {
		return code;
	}

	/**
	 * Parse the code and return the relative enum.
	 * @param code	The code
	 * @return		The relative enum
	 */
	public static ResourceType parseValue(int code){
		for (ResourceType effectCode : values()){
			if (effectCode.code == code){
				return effectCode;
			}
		}
		return null;
	}
	
	@Override
	public String toString(){
		return buildUIName();
	}

}
