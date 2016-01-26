package dbstructure;

import java.awt.Color;

public enum DatStructure {
	
	DB_OBJECT ("dbobjects.dat", 0, true, 0, 1, 5, -1, null,
			EntryStruct.NAME,
			EntryStruct.SEQ_NUMBER, new EntryStruct("Family ID", Type.INTEGER, 4), EntryStruct.UNKNOWN_INT4, EntryStruct.UNKNOWN_INT4,
			EntryStruct.ID, new EntryStruct("Health", Type.INTEGER, 4), EntryStruct.UNKNOWN_INT4, new EntryStruct("Min range", Type.FLOAT, 4),
			new EntryStruct("Max range", Type.FLOAT, 4), new EntryStruct("Line of sight", Type.FLOAT, 4), new EntryStruct("Attack speed", Type.FLOAT, 4), new EntryStruct("Area of effect", Type.FLOAT, 4),
			new EntryStruct("Speed", Type.FLOAT, 4), new EntryStruct("Acceleration/Deceleration", Type.FLOAT, 4), new EntryStruct("Idle turning speed", Type.FLOAT, 4), new EntryStruct("Moving turning speed", Type.FLOAT, 4),
			EntryStruct.UNKNOWN_FLOAT, new EntryStruct("<PROBABLY> Is air unit", Type.INTEGER, 4), new EntryStruct("Flight time", Type.INTEGER, 4), EntryStruct.UNKNOWN_INT4,
			new EntryStruct("Attack angle", Type.FLOAT, 4), EntryStruct.UNKNOWN_INT4, new EntryStruct("WeaponToHit ID", Type.INTEGER, 4), new EntryStruct("Attack", Type.INTEGER, 4),
			new EntryStruct("Shock armor", Type.INTEGER, 4), new EntryStruct("Arrow armor", Type.INTEGER, 4), new EntryStruct("Pierce armor", Type.INTEGER, 4), new EntryStruct("Gun armor", Type.INTEGER, 4),
			new EntryStruct("Laser armor", Type.INTEGER, 4), new EntryStruct("Missile armor", Type.INTEGER, 4), new EntryStruct("Projectile ID", Type.INTEGER, 4), new EntryStruct("Family attack multiplier index", Type.INTEGER, 4),
			EntryStruct.UNKNOWN_INT4, new EntryStruct("Graphic size", Type.FLOAT, 4), new EntryStruct("Unit type", Type.STRING, 52), EntryStruct.UNKNOWN_INT4,
			EntryStruct.UNCHANGED_INT4, new EntryStruct("Button ID", Type.INTEGER, 4), new EntryStruct("Graphic ID", Type.INTEGER, 4), new EntryStruct("Build rate", Type.FLOAT, 4),
			new EntryStruct("Iron gather rate", Type.FLOAT, 4), new EntryStruct("Farm gather rate", Type.FLOAT, 4), new EntryStruct("Gold gather rate", Type.FLOAT, 4), new EntryStruct("Stone gather rate", Type.FLOAT, 4),
			new EntryStruct("Wood gather rate", Type.FLOAT, 4), new EntryStruct("Hunt gather rate", Type.FLOAT, 4), new EntryStruct("Forage gather rate", Type.FLOAT, 4), new EntryStruct("Sound ID 1", Type.INTEGER, 4),
			new EntryStruct("Sound ID 2", Type.INTEGER, 4), new EntryStruct("Sound ID 3", Type.INTEGER, 4), new EntryStruct("Sound ID 4", Type.INTEGER, 4), new EntryStruct("Sound ID 5", Type.INTEGER, 4),
			new EntryStruct("Sound ID 6", Type.INTEGER, 4), EntryStruct.UNKNOWN_INT4, new EntryStruct("Action button 1", Type.INTEGER, 4), new EntryStruct("Action button 2", Type.INTEGER, 4),
			new EntryStruct("Action button 3", Type.INTEGER, 4), new EntryStruct("Action button 4", Type.INTEGER, 4), new EntryStruct("Action button 5", Type.INTEGER, 4), new EntryStruct("Action button 6", Type.INTEGER, 4),
			new EntryStruct("Action button 7", Type.INTEGER, 4), new EntryStruct("Action button 8", Type.INTEGER, 4), new EntryStruct("Action button 9", Type.INTEGER, 4), EntryStruct.UNCHANGED_INT4,
			new EntryStruct("Square occupied", Type.INTEGER, 4), new EntryStruct("Resource type", Type.INTEGER, 4), new EntryStruct("Resource amount", Type.INTEGER, 4), new EntryStruct("Always face camera", Type.INTEGER, 4),
			EntryStruct.UNKNOWN_INT4, new EntryStruct("Rotting time", Type.FLOAT, 4), new EntryStruct("Population count", Type.INTEGER, 4), new EntryStruct("Transport capacity", Type.INTEGER, 4),
			new EntryStruct("Show area effect stat"), new EntryStruct("Show repair stat"), new EntryStruct("Show shock armor stat"), new EntryStruct("Show pierce armor stat"),
			new EntryStruct("Show arrow armor stat"), new EntryStruct("Show laser armor stat"), new EntryStruct("Show gun armor stat"), new EntryStruct("Show missile armor stat"),
			new EntryStruct("Show range", Type.INTEGER, 4), new EntryStruct("Morale bonus", Type.INTEGER, 4),
			EntryStruct.UNKNOWN_INT4, EntryStruct.UNKNOWN_INT1, EntryStruct.UNKNOWN_INT1, EntryStruct.UNKNOWN_INT1, EntryStruct.UNUSED_INT1, EntryStruct.UNKNOWN_FLOAT, EntryStruct.UNUSED_INT4,
			new EntryStruct("Flight altitude", Type.INTEGER, 4), new EntryStruct("Language ID", Type.INTEGER, 4), EntryStruct.UNKNOWN_INT4, EntryStruct.UNKNOWN_INT4,
			new EntryStruct("Health regeneration", Type.INTEGER, 4), new EntryStruct("Can garrison in air transports"), new EntryStruct("Can garrison in land transports"), new EntryStruct("Can garrison in sea transports"), EntryStruct.UNUSED_INT1, EntryStruct.UNKNOWN_INT4, EntryStruct.UNKNOWN_INT4,
			new EntryStruct("Circle selection size", Type.FLOAT, 4), new EntryStruct("Shadow size", Type.FLOAT, 4),  EntryStruct.UNUSED_INT4, new EntryStruct("<Some kind of size>", Type.FLOAT, 4),
			new EntryStruct("Physical size", Type.FLOAT, 4), new EntryStruct("Units can walk above this"), EntryStruct.UNKNOWN_INT1, EntryStruct.UNKNOWN_INT1, new EntryStruct("Proiettile trajectory is parabolic",  Type.INTEGER, 1), EntryStruct.UNKNOWN_FLOAT, EntryStruct.UNKNOWN_FLOAT,
			new EntryStruct("Ammo amount", Type.INTEGER, 4), EntryStruct.UNKNOWN_BOOL, EntryStruct.UNKNOWN_BOOL, EntryStruct.UNKNOWN_BOOL, EntryStruct.UNKNOWN_BOOL, EntryStruct.UNKNOWN_INT4, EntryStruct.UNUSED_INT4,
			new EntryStruct("Category (Heroes use 27)", Type.INTEGER, 4), EntryStruct.UNKNOWN_INT4, EntryStruct.UNKNOWN_INT4, EntryStruct.UNKNOWN_INT4,
			EntryStruct.UNKNOWN_INT4, new EntryStruct("Upgrade ID", Type.INTEGER, 4), new EntryStruct("<Used by units/buildings who can convert>", Type.INTEGER, 4), EntryStruct.UNKNOWN_FLOAT,
			new EntryStruct("Show in scenari editor"), EntryStruct.UNKNOWN_BOOL, EntryStruct.UNKNOWN_BOOL, EntryStruct.UNKNOWN_BOOL, new EntryStruct("Can be killed with Delete"), EntryStruct.UNKNOWN_BOOL, EntryStruct.UNKNOWN_INT1, EntryStruct.UNUSED_INT1, new EntryStruct("Low health effect ID", Type.INTEGER, 4), new EntryStruct("Death effect ID", Type.INTEGER, 4),
			new EntryStruct("Start of attack ID", Type.INTEGER, 4), EntryStruct.UNKNOWN_INT4, EntryStruct.UNKNOWN_INT4, EntryStruct.UNKNOWN_INT4,
			EntryStruct.UNKNOWN_INT4, EntryStruct.UNKNOWN_INT4, EntryStruct.UNKNOWN_INT4, EntryStruct.UNKNOWN_INT4,
			new EntryStruct("Permanent effect", Type.INTEGER, 4), EntryStruct.UNUSED_INT4, new EntryStruct("Projectile effect", Type.INTEGER, 4), EntryStruct.UNUSED_INT4,
			EntryStruct.UNUSED_INT4, EntryStruct.UNUSED_INT4, EntryStruct.UNUSED_INT4, EntryStruct.UNUSED_INT4,
			new EntryStruct("<only used by capital ship/yamato>", Type.INTEGER, 4), new EntryStruct("<only used by volcano-projectile and meteor>", Type.INTEGER, 4), new EntryStruct("Attack effect ID", Type.INTEGER, 4), EntryStruct.UNKNOWN_INT4,
			EntryStruct.UNKNOWN_INT4, EntryStruct.UNKNOWN_INT4, EntryStruct.UNKNOWN_INT4, EntryStruct.UNKNOWN_INT4,
			EntryStruct.UNKNOWN_INT4, EntryStruct.UNUSED_INT4, EntryStruct.UNKNOWN_INT4, EntryStruct.UNUSED_INT4,
			EntryStruct.UNKNOWN_INT4, new EntryStruct("<only used by ships>", Type.FLOAT, 4), EntryStruct.UNUSED_INT4, EntryStruct.UNUSED_INT4,
			EntryStruct.UNUSED_INT4, EntryStruct.UNUSED_INT4, new EntryStruct("Terrain: Grass, Snow"), new EntryStruct("Elevation: Deep water"),
			new EntryStruct("Terrain: Rock, Stones and Artificial"), EntryStruct.UNKNOWN_BOOL, EntryStruct.UNKNOWN_BOOL, EntryStruct.UNKNOWN_BOOL, EntryStruct.UNKNOWN_BOOL, EntryStruct.UNKNOWN_BOOL,
			EntryStruct.UNKNOWN_BOOL, EntryStruct.UNKNOWN_BOOL, new EntryStruct("Terrain: Asphalt"), new EntryStruct("Elevation: cliffs"), new EntryStruct("Elevation: Shallow water"), EntryStruct.UNKNOWN_BOOL, new EntryStruct("Terrain: Sand"), new EntryStruct("Terrain: Space"),
			EntryStruct.UNKNOWN_BOOL, EntryStruct.UNKNOWN_BOOL, EntryStruct.UNUSED_INT1, EntryStruct.UNUSED_INT1, new EntryStruct("Area Effect ID 1", Type.INTEGER, 4),
			new EntryStruct("Area Effect ID 2", Type.INTEGER, 4), new EntryStruct("Area Effect ID 3", Type.INTEGER, 4), new EntryStruct("Area Effect ID 4", Type.INTEGER, 4), new EntryStruct("Area Effect ID 5", Type.INTEGER, 4),
			EntryStruct.UNUSED_INT4, EntryStruct.UNUSED_INT4, new EntryStruct("Carry capacity", Type.INTEGER, 4), EntryStruct.UNKNOWN_INT4,
			EntryStruct.UNUSED_INT4, EntryStruct.UNKNOWN_BOOL, EntryStruct.UNUSED_BOOL, EntryStruct.UNKNOWN_BOOL, EntryStruct.UNUSED_INT1, EntryStruct.UNKNOWN_INT4, EntryStruct.UNKNOWN_INT4,
			EntryStruct.UNKNOWN_INT4, new EntryStruct("Debris on death", Type.INTEGER, 4), EntryStruct.UNKNOWN_INT4, new EntryStruct("Min stealth radius", Type.INTEGER, 4),
			EntryStruct.UNKNOWN_INT4, new EntryStruct("Citizens garrison", Type.INTEGER, 4), EntryStruct.UNKNOWN_INT4, EntryStruct.UNKNOWN_INT4,
			new EntryStruct ("Plane build mode", Type.INTEGER, 4), EntryStruct.UNKNOWN_INT4, EntryStruct.UNKNOWN_INT4, EntryStruct.UNKNOWN_INT4,
			EntryStruct.UNKNOWN_FLOAT, EntryStruct.UNKNOWN_FLOAT, new EntryStruct("Friendly damage", Type.FLOAT, 4), EntryStruct.UNKNOWN_FLOAT,
			EntryStruct.UNKNOWN_INT4, EntryStruct.UNUSED_INT4, EntryStruct.UNKNOWN_INT4, EntryStruct.UNKNOWN_INT4,
			EntryStruct.UNKNOWN_INT4, EntryStruct.UNKNOWN_INT4, new EntryStruct("Units can walk above this"), new EntryStruct("Stealth"), EntryStruct.UNKNOWN_BOOL, new EntryStruct("<only used by units with fuel>", Type.INTEGER, 1), EntryStruct.UNKNOWN_INT4,
			new EntryStruct("Spawn on death", Type.INTEGER, 4), new EntryStruct("Power", Type.INTEGER, 4), new EntryStruct("Power recover rate", Type.INTEGER, 4), new EntryStruct("Default stance", Type.INTEGER, 4),
			EntryStruct.UNKNOWN_INT4, EntryStruct.UNKNOWN_INT4, EntryStruct.UNKNOWN_INT4, EntryStruct.UNKNOWN_INT4,
			EntryStruct.UNKNOWN_INT4, EntryStruct.UNKNOWN_INT4, EntryStruct.UNKNOWN_BOOL, EntryStruct.UNUSED_BOOL, EntryStruct.UNKNOWN_BOOL, new EntryStruct("Can attack area"), new EntryStruct("Garrison heal rate", Type.INTEGER, 4),
			EntryStruct.UNUSED_INT4, EntryStruct.UNKNOWN_FLOAT, new EntryStruct("Can walk through trees", Type.INTEGER, 4), new EntryStruct("If 1, it's a melee unit", Type.INTEGER, 4),
			EntryStruct.UNUSED_INT4, EntryStruct.UNKNOWN_FLOAT, EntryStruct.UNKNOWN_INT4, EntryStruct.UNUSED_INT4,
			EntryStruct.UNUSED_INT4, EntryStruct.UNUSED_INT4, EntryStruct.UNUSED_INT4, EntryStruct.UNUSED_INT4,
			EntryStruct.UNKNOWN_INT4, EntryStruct.UNUSED_INT4, EntryStruct.UNUSED_INT4, EntryStruct.UNUSED_INT4,
			EntryStruct.UNKNOWN_INT4, EntryStruct.UNUSED_INT4, EntryStruct.UNUSED_INT4, EntryStruct.UNUSED_INT4,
			EntryStruct.UNKNOWN_INT4, EntryStruct.UNUSED_INT4, EntryStruct.UNUSED_INT4, EntryStruct.UNUSED_INT4,
			EntryStruct.UNUSED_INT4, EntryStruct.UNUSED_INT4, new EntryStruct("<Only used by Piramid>", Type.INTEGER, 4), EntryStruct.UNKNOWN_FLOAT,
			EntryStruct.UNKNOWN_INT4, EntryStruct.UNUSED_INT4, EntryStruct.UNUSED_INT4, EntryStruct.UNKNOWN_INT4,
			EntryStruct.UNKNOWN_INT4, EntryStruct.UNUSED_INT4, EntryStruct.UNUSED_INT4, EntryStruct.UNKNOWN_INT4,
			EntryStruct.UNKNOWN_INT4, EntryStruct.UNUSED_INT4, EntryStruct.UNUSED_INT4, EntryStruct.UNKNOWN_INT4,
			EntryStruct.UNKNOWN_INT4, EntryStruct.UNUSED_INT4, EntryStruct.UNUSED_INT4, EntryStruct.UNKNOWN_INT4,
			EntryStruct.UNKNOWN_INT4, EntryStruct.UNUSED_INT4, EntryStruct.UNUSED_INT4, EntryStruct.UNKNOWN_INT4,
			EntryStruct.UNKNOWN_INT4, EntryStruct.UNUSED_INT4, EntryStruct.UNUSED_INT4, EntryStruct.UNUSED_INT4,
			EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH,	//START OF TECH IDs
			EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH,
			EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH,
			EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH,
			EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH,
			EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH,
			EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH,
			EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH,
			EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH,
			EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH,
			EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH,
			EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH,
			EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH,
			EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH,
			EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH,
			EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH,
			EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH,
			EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH,
			EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH,
			EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH,
			EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH,
			EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH,
			EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH,
			EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH,
			EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH,
			EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH,
			EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH,
			EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH,
			EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH,
			EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH,
			EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH,
			EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH,
			EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH,
			EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH,
			EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH,
			EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH,
			EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH,
			EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH,
			EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH,
			EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH,
			EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH,
			EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH,
			EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH,
			EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH,
			EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH,
			EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH,
			EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH,
			EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH,
			EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH,
			EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH, EntryStruct.OBJECT_TECH,
			EntryStruct.UNKNOWN_INT4
			),

	DB_TECH_TREE("dbtechtree.dat", 1, true, 0, 1, 2, 46, new EntryStruct("Tech builder", Type.INTEGER, 4),
			EntryStruct.NAME, EntryStruct.SEQ_NUMBER, EntryStruct.ID,
			new EntryStruct("Starting epoch", Type.INTEGER, 4), new EntryStruct("Ending epoch", Type.INTEGER, 4), EntryStruct.UNKNOWN_INT4, EntryStruct.UNKNOWN_INT4,
			new EntryStruct("Wood cost", Type.INTEGER, 4), new EntryStruct("Stone cost", Type.INTEGER, 4), new EntryStruct("<Only Impassable tile object and Invisible capital>", Type.INTEGER, 4), new EntryStruct("Gold cost", Type.INTEGER, 4),
			EntryStruct.UNUSED_INT4, new EntryStruct("Iron cost", Type.INTEGER, 4), new EntryStruct("Food cost", Type.INTEGER, 4), new EntryStruct("Build time", Type.INTEGER, 4),
			EntryStruct.UNKNOWN_INT4, EntryStruct.UNKNOWN_INT4, new EntryStruct("<-1 in Epoch Space, 0 everywhere else>", Type.INTEGER, 4), new EntryStruct("<-1 in Epoch Space, 0 everywhere else>", Type.INTEGER, 4),
			new EntryStruct("Object ID", Type.INTEGER, 4), new EntryStruct("Button ID", Type.INTEGER, 4), EntryStruct.UNKNOWN_INT4, EntryStruct.UNKNOWN_INT4,
			EntryStruct.UNKNOWN_INT4, new EntryStruct("<4 in all Epochs Space, 0 everywhere else>", Type.INTEGER, 4), EntryStruct.UNUSED_INT4, EntryStruct.UNUSED_INT4,
			EntryStruct.UNKNOWN_INT4, new EntryStruct("Hotkey ID", Type.INTEGER, 4), EntryStruct.UNKNOWN_INT4, EntryStruct.UNKNOWN_INT4,
			EntryStruct.UNKNOWN_INT4, EntryStruct.UNKNOWN_INT4, EntryStruct.UNKNOWN_FLOAT, EntryStruct.UNKNOWN_FLOAT,
			EntryStruct.UNKNOWN_FLOAT, EntryStruct.UNKNOWN_FLOAT, EntryStruct.UNKNOWN_BOOL, new EntryStruct("Only in scenario"),
			EntryStruct.UNKNOWN_BOOL, EntryStruct.UNKNOWN_BOOL, EntryStruct.UNKNOWN_INT4, EntryStruct.UNKNOWN_INT4,
			EntryStruct.UNKNOWN_INT4, EntryStruct.UNKNOWN_INT4, new EntryStruct("Tech builder", Type.INTEGER, 4, false), new EntryStruct("Num of tech builders", Type.INTEGER, 4, false)
			),
	
	
	DB_FAMILY ("dbfamily.dat", 0, true, 0, 1, 2, -1, null,
			EntryStruct.NAME, EntryStruct.SEQ_NUMBER, EntryStruct.ID,
			EntryStruct.UNKNOWN_INT4, new EntryStruct("Frigate", Type.INTEGER, 4), new EntryStruct("Machine gun", Type.INTEGER, 4), new EntryStruct("Galley", Type.INTEGER, 4),
			new EntryStruct("Tank", Type.INTEGER, 4), new EntryStruct("AT Gun", Type.INTEGER, 4), new EntryStruct("Catapult, Bombard", Type.INTEGER, 4), new EntryStruct("AA Tower, Stinger, Flat halftrack", Type.INTEGER, 4),
			EntryStruct.UNKNOWN_INT4, new EntryStruct("Sea king", Type.INTEGER, 4), new EntryStruct("Field weapon", Type.INTEGER, 4), EntryStruct.UNKNOWN_INT4,
			new EntryStruct("Fighter, Cruiser", Type.INTEGER, 4), new EntryStruct("Cavalry spear", Type.INTEGER, 4), EntryStruct.UNKNOWN_INT4, EntryStruct.UNKNOWN_INT4,
			new EntryStruct("Cavalry gun", Type.INTEGER, 4), EntryStruct.UNKNOWN_INT4, new EntryStruct("Submarine", Type.INTEGER, 4), new EntryStruct("Ram, Sampson", Type.INTEGER, 4),
			EntryStruct.UNKNOWN_INT4, new EntryStruct("Archer, Javelin", Type.INTEGER, 4), EntryStruct.UNKNOWN_INT4, EntryStruct.UNKNOWN_INT4,
			EntryStruct.UNKNOWN_INT4, EntryStruct.UNKNOWN_INT4, EntryStruct.UNKNOWN_INT4, EntryStruct.UNKNOWN_INT4,
			EntryStruct.UNKNOWN_INT4, EntryStruct.UNKNOWN_INT4, EntryStruct.UNKNOWN_INT4, EntryStruct.UNKNOWN_INT4,
			EntryStruct.UNKNOWN_INT4, new EntryStruct("AT Tank", Type.INTEGER, 4), new EntryStruct("Battleship", Type.INTEGER, 4), new EntryStruct("AT Helicopter", Type.INTEGER, 4),
			EntryStruct.UNKNOWN_INT4, EntryStruct.UNUSED_INT4, EntryStruct.UNKNOWN_INT4, new EntryStruct("Crossbow", Type.INTEGER, 4),
			new EntryStruct("Carrier fighter", Type.INTEGER, 4), new EntryStruct("Gunship Helicopter", Type.INTEGER, 4), EntryStruct.UNKNOWN_INT4, EntryStruct.UNKNOWN_INT4,
			new EntryStruct("Tower", Type.INTEGER, 4), EntryStruct.UNKNOWN_INT4, EntryStruct.UNKNOWN_INT4, EntryStruct.UNKNOWN_INT4,
			new EntryStruct("Sword", Type.INTEGER, 4), new EntryStruct("Cavalry sword", Type.INTEGER, 4), EntryStruct.UNKNOWN_INT4, EntryStruct.UNKNOWN_INT4,
			new EntryStruct("Bazooka", Type.INTEGER, 4), new EntryStruct("Spear", Type.INTEGER, 4), new EntryStruct("Cavalry archer", Type.INTEGER, 4), EntryStruct.UNKNOWN_INT4,
			EntryStruct.UNKNOWN_INT4, EntryStruct.UNKNOWN_INT4, EntryStruct.UNKNOWN_INT4, new EntryStruct("Fishing boat", Type.INTEGER, 4),
			new EntryStruct("Anti-Missile Battery", Type.INTEGER, 4), new EntryStruct("Capitol ship", Type.INTEGER, 4), new EntryStruct("Space fighter", Type.INTEGER, 4), new EntryStruct("Space corvette", Type.INTEGER, 4),
			EntryStruct.UNKNOWN_INT4, new EntryStruct("Space turret", Type.INTEGER, 4), EntryStruct.UNUSED_INT4, EntryStruct.UNUSED_INT4
			),

	DB_WEAPON_TO_HIT ("dbweapontohit.dat", 0, false, 0, 1, 2, -1, null,
			EntryStruct.NAME, EntryStruct.SEQ_NUMBER, EntryStruct.ID,
			new EntryStruct("Shock mult", Type.INTEGER, 4), new EntryStruct("Arrow mult", Type.INTEGER, 4), new EntryStruct("Pierce mult", Type.INTEGER, 4),
			new EntryStruct("Gun mult", Type.INTEGER, 4), new EntryStruct("Laser mult", Type.INTEGER, 4), new EntryStruct("Missile mult", Type.INTEGER, 4)
			),
	
	DB_UPGRADE ("dbupgrade.dat", 0, true, 0, -1, -1, -1, null,
			EntryStruct.NAME, new EntryStruct("Attack mult", Type.FLOAT, 4), new EntryStruct("Health mult", Type.FLOAT, 4), new EntryStruct("Speed mult", Type.FLOAT, 4),
			new EntryStruct("Range mult", Type.FLOAT, 4), new EntryStruct("Shock armor mult", Type.FLOAT, 4), new EntryStruct("Arrow armor mult", Type.FLOAT, 4), new EntryStruct("Pierce armor mult", Type.FLOAT, 4),
			new EntryStruct("Gun armor mult", Type.FLOAT, 4), new EntryStruct("Laser armor mult", Type.FLOAT, 4), new EntryStruct("Missile armor mult", Type.FLOAT, 4), new EntryStruct("Fuel/Power mult", Type.FLOAT, 4),
			EntryStruct.UNUSED_INT4, new EntryStruct("Area mult", Type.FLOAT, 4), EntryStruct.UNUSED_INT4, new EntryStruct("Attack cost mult", Type.FLOAT, 4),
			new EntryStruct("Health cost mult", Type.FLOAT, 4), new EntryStruct("Speed cost mult", Type.FLOAT, 4), new EntryStruct("Range cost mult", Type.FLOAT, 4), new EntryStruct("Shock armor cost mult", Type.FLOAT, 4),
			new EntryStruct("Arrow armor cost mult", Type.FLOAT, 4), new EntryStruct("Pierce armor cost mult", Type.FLOAT, 4), new EntryStruct("Gun armor cost mult", Type.FLOAT, 4), new EntryStruct("Laser armor cost mult", Type.FLOAT, 4),
			new EntryStruct("Missile armor cost mult", Type.FLOAT, 4), new EntryStruct("Fuel/Power cost mult", Type.FLOAT, 4), EntryStruct.UNUSED_INT4, EntryStruct.UNUSED_INT4,
			new EntryStruct("Area cost mult", Type.FLOAT, 4), EntryStruct.UNUSED_INT4, new EntryStruct("Max upgrades per stat", Type.INTEGER, 4), EntryStruct.SEQ_NUMBER,
			EntryStruct.ID, EntryStruct.UNKNOWN_INT4, EntryStruct.UNKNOWN_INT4, EntryStruct.UNUSED_INT4
			),

	DB_AREA_EFFECT("dbareaeffect.dat", 0, true, 0, 1, 2, -1, null,
			EntryStruct.NAME, EntryStruct.SEQ_NUMBER, EntryStruct.ID, new EntryStruct("Effect type", Type.INTEGER, 4),
			EntryStruct.UNKNOWN_INT4, EntryStruct.UNKNOWN_INT4, EntryStruct.UNKNOWN_INT4, EntryStruct.UNKNOWN_INT4,
			EntryStruct.UNUSED_INT4, EntryStruct.UNKNOWN_INT4, new EntryStruct("Morale", Type.INTEGER, 4), new EntryStruct("Heal effect", Type.INTEGER, 4),
			EntryStruct.UNUSED_INT4, EntryStruct.UNUSED_INT4, EntryStruct.UNUSED_INT4, new EntryStruct("Area size", Type.FLOAT, 4),
			EntryStruct.UNKNOWN_FLOAT, EntryStruct.UNKNOWN_FLOAT, EntryStruct.UNKNOWN_FLOAT, EntryStruct.UNKNOWN_FLOAT,
			EntryStruct.UNUSED_INT4, EntryStruct.UNUSED_INT4, EntryStruct.UNUSED_INT4
			),
	
	DB_BUTTONS ("dbbuttons.dat", 0, true, 0, 2, 3, -1, null,
			EntryStruct.NAME, new EntryStruct("Texture", Type.STRING, 100), EntryStruct.SEQ_NUMBER, EntryStruct.ID,
			new EntryStruct("<only used by espionage center>", Type.INTEGER, 4), new EntryStruct("<only used by farm and espionage center>", Type.INTEGER, 4), new EntryStruct("Position", Type.INTEGER, 4), EntryStruct.UNKNOWN_INT4
			),

	DB_CIVILIZATION ("dbcivilization.dat", 0, false, 0, 1, 2, -1, null,
			EntryStruct.NAME, EntryStruct.UNUSED_INT4, EntryStruct.UNUSED_INT4, new EntryStruct("Language ID", Type.INTEGER, 4),
			EntryStruct.ID, new EntryStruct("Cost increment", Type.INTEGER, 4),
			EntryStruct.UNKNOWN_FLOAT, EntryStruct.UNKNOWN_FLOAT, EntryStruct.UNKNOWN_FLOAT, EntryStruct.UNKNOWN_FLOAT,
			EntryStruct.UNKNOWN_FLOAT, EntryStruct.UNKNOWN_FLOAT, EntryStruct.UNKNOWN_FLOAT, EntryStruct.UNKNOWN_FLOAT,
			EntryStruct.UNKNOWN_FLOAT, EntryStruct.UNKNOWN_FLOAT, EntryStruct.UNKNOWN_FLOAT, EntryStruct.UNKNOWN_FLOAT,
			EntryStruct.UNKNOWN_FLOAT, EntryStruct.UNKNOWN_FLOAT, EntryStruct.UNKNOWN_FLOAT, EntryStruct.UNKNOWN_FLOAT,
			EntryStruct.UNKNOWN_FLOAT, EntryStruct.UNKNOWN_FLOAT, EntryStruct.UNKNOWN_FLOAT, EntryStruct.UNKNOWN_FLOAT,
			EntryStruct.UNKNOWN_FLOAT, EntryStruct.UNKNOWN_FLOAT, EntryStruct.UNKNOWN_FLOAT, EntryStruct.UNKNOWN_FLOAT,
			EntryStruct.UNKNOWN_FLOAT, EntryStruct.UNKNOWN_FLOAT, EntryStruct.UNKNOWN_FLOAT, EntryStruct.UNKNOWN_FLOAT,
			EntryStruct.UNKNOWN_FLOAT, EntryStruct.UNKNOWN_FLOAT, EntryStruct.UNKNOWN_FLOAT, EntryStruct.UNKNOWN_FLOAT,
			EntryStruct.UNKNOWN_FLOAT, EntryStruct.UNKNOWN_FLOAT, EntryStruct.UNUSED_FLOAT, EntryStruct.UNUSED_FLOAT,
			EntryStruct.UNUSED_FLOAT, EntryStruct.UNUSED_FLOAT, EntryStruct.UNKNOWN_FLOAT, EntryStruct.UNKNOWN_FLOAT,
			EntryStruct.UNKNOWN_FLOAT, EntryStruct.UNKNOWN_FLOAT, EntryStruct.UNUSED_FLOAT, EntryStruct.UNUSED_FLOAT,
			EntryStruct.UNKNOWN_FLOAT, EntryStruct.UNKNOWN_FLOAT, EntryStruct.UNUSED_FLOAT, EntryStruct.UNUSED_FLOAT,
			EntryStruct.UNUSED_FLOAT, EntryStruct.UNUSED_FLOAT, EntryStruct.UNUSED_FLOAT, EntryStruct.UNUSED_FLOAT,
			EntryStruct.UNUSED_FLOAT, EntryStruct.UNUSED_FLOAT, EntryStruct.UNUSED_FLOAT, EntryStruct.UNUSED_FLOAT,
			EntryStruct.UNUSED_FLOAT, EntryStruct.UNUSED_FLOAT, EntryStruct.UNUSED_FLOAT, EntryStruct.UNUSED_FLOAT,
			EntryStruct.UNUSED_FLOAT, EntryStruct.UNUSED_FLOAT, EntryStruct.UNUSED_FLOAT, EntryStruct.UNUSED_FLOAT,
			EntryStruct.UNUSED_FLOAT, EntryStruct.UNUSED_FLOAT, EntryStruct.UNUSED_FLOAT, EntryStruct.UNUSED_FLOAT,
			EntryStruct.UNUSED_FLOAT, EntryStruct.UNUSED_FLOAT, EntryStruct.UNUSED_FLOAT, EntryStruct.UNUSED_FLOAT,
			EntryStruct.UNUSED_FLOAT, EntryStruct.UNUSED_FLOAT, EntryStruct.UNUSED_FLOAT, EntryStruct.UNUSED_FLOAT,
			EntryStruct.UNUSED_FLOAT, EntryStruct.UNUSED_FLOAT, EntryStruct.UNUSED_FLOAT, EntryStruct.UNUSED_FLOAT,
			EntryStruct.UNUSED_FLOAT, EntryStruct.UNUSED_FLOAT, EntryStruct.UNUSED_FLOAT, EntryStruct.UNUSED_FLOAT,
			EntryStruct.UNUSED_FLOAT, EntryStruct.UNUSED_FLOAT, EntryStruct.UNUSED_FLOAT, EntryStruct.UNUSED_FLOAT,
			EntryStruct.UNUSED_FLOAT, EntryStruct.UNUSED_FLOAT, EntryStruct.UNUSED_FLOAT, EntryStruct.UNUSED_FLOAT,
			EntryStruct.UNUSED_FLOAT, EntryStruct.UNUSED_FLOAT, EntryStruct.UNUSED_FLOAT, EntryStruct.UNUSED_FLOAT,
			EntryStruct.UNUSED_FLOAT, EntryStruct.UNUSED_FLOAT, EntryStruct.UNUSED_FLOAT, EntryStruct.UNUSED_FLOAT,
			EntryStruct.UNUSED_FLOAT, EntryStruct.UNUSED_FLOAT, EntryStruct.UNUSED_FLOAT, EntryStruct.UNUSED_FLOAT,
			EntryStruct.UNUSED_FLOAT, EntryStruct.UNUSED_FLOAT, EntryStruct.UNUSED_FLOAT, EntryStruct.UNUSED_FLOAT,
			EntryStruct.UNUSED_FLOAT, EntryStruct.UNUSED_FLOAT, EntryStruct.UNUSED_FLOAT, EntryStruct.UNUSED_FLOAT,
			EntryStruct.UNUSED_FLOAT, EntryStruct.UNUSED_FLOAT, EntryStruct.UNUSED_FLOAT, EntryStruct.UNUSED_FLOAT,
			EntryStruct.UNUSED_FLOAT, EntryStruct.UNUSED_FLOAT, EntryStruct.UNKNOWN_INT4, EntryStruct.UNKNOWN_INT4
			),

	DB_STARTING_RESOURCHES ("dbstartingresources.dat", 0, true, 0, 1, 2, -1, null,
			EntryStruct.NAME, EntryStruct.SEQ_NUMBER, EntryStruct.ID,
			new EntryStruct("Language ID", Type.INTEGER, 4), new EntryStruct("Starting food", Type.INTEGER, 4), new EntryStruct("Starting wood", Type.INTEGER, 4),
			new EntryStruct("Starting stone", Type.INTEGER, 4), new EntryStruct("Starting gold", Type.INTEGER, 4), new EntryStruct("Starting iron", Type.INTEGER, 4)
			),

	DB_GAME_VARIANT ("dbgamevariant.dat", 0, true, 0, 1, 2, -1, null,
			EntryStruct.NAME, EntryStruct.SEQ_NUMBER, EntryStruct.ID,
			EntryStruct.UNKNOWN_FLOAT, EntryStruct.UNKNOWN_INT4, EntryStruct.UNKNOWN_FLOAT, EntryStruct.UNKNOWN_INT4,
			EntryStruct.UNKNOWN_FLOAT, EntryStruct.UNKNOWN_INT4, EntryStruct.UNUSED_INT4, EntryStruct.UNUSED_INT4,
			EntryStruct.UNUSED_INT4, EntryStruct.UNUSED_INT4, EntryStruct.UNUSED_INT4, EntryStruct.UNUSED_INT4,
			EntryStruct.UNUSED_INT4, EntryStruct.UNUSED_INT4, EntryStruct.UNUSED_INT4, EntryStruct.UNUSED_INT4,
			EntryStruct.UNUSED_INT4, EntryStruct.UNUSED_INT4, EntryStruct.UNUSED_INT4, EntryStruct.UNUSED_INT4,
			EntryStruct.UNCHANGED_FLOAT, EntryStruct.UNKNOWN_FLOAT, new EntryStruct("Gather rate multiplier", Type.FLOAT, 4), EntryStruct.UNKNOWN_INT4,
			new EntryStruct("Language ID", Type.INTEGER, 4), EntryStruct.UNKNOWN_FLOAT, EntryStruct.UNKNOWN_FLOAT, new EntryStruct("Wonder cost multiplier", Type.FLOAT, 4),
			EntryStruct.UNKNOWN_INT4, EntryStruct.UNKNOWN_FLOAT, EntryStruct.UNUSED_INT4, EntryStruct.UNUSED_INT4,
			EntryStruct.UNUSED_INT4, EntryStruct.UNUSED_INT4, EntryStruct.UNUSED_INT4, EntryStruct.UNUSED_INT4,
			EntryStruct.UNUSED_INT4, EntryStruct.UNUSED_INT4, EntryStruct.UNUSED_INT4, EntryStruct.UNUSED_INT4,
			new EntryStruct("Available in random maps", Type.INTEGER, 4), EntryStruct.UNUSED_INT4
			),

	DB_MUSIC ("dbmusic.dat", 0, true, 2, 0, 1, -1, null,
			EntryStruct.SEQ_NUMBER, EntryStruct.ID, EntryStruct.NAME,
			new EntryStruct("Another name", Type.STRING, 56), EntryStruct.UNKNOWN_FLOAT, EntryStruct.UNKNOWN_FLOAT, EntryStruct.UNKNOWN_FLOAT,
			EntryStruct.UNCHANGED_INT4, EntryStruct.UNCHANGED_BOOL, EntryStruct.UNCHANGED_BOOL, EntryStruct.UNCHANGED_BOOL,
			EntryStruct.UNCHANGED_BOOL, EntryStruct.UNCHANGED_BOOL, EntryStruct.UNCHANGED_BOOL, EntryStruct.UNCHANGED_BOOL,
			EntryStruct.UNCHANGED_BOOL, EntryStruct.UNCHANGED_BOOL, EntryStruct.UNCHANGED_BOOL, EntryStruct.UNCHANGED_BOOL,
			EntryStruct.UNCHANGED_BOOL, EntryStruct.UNCHANGED_BOOL, EntryStruct.UNCHANGED_BOOL, EntryStruct.UNCHANGED_BOOL, new EntryStruct("Never used", Type.INTEGER, 1, Knowledge.NEVER_USED, Color.GRAY)
			),
	
	DB_UIHOTKEY ("dbuihotkey.dat", 0, true, 2, 0, 1, -1, null,
			EntryStruct.SEQ_NUMBER, EntryStruct.ID, EntryStruct.NAME,
			EntryStruct.UNCHANGED_INT4, EntryStruct.UNCHANGED_INT4, EntryStruct.UNCHANGED_INT4, EntryStruct.UNKNOWN_INT4
			),
	
	;
	
	
	public String fileName;
	public int alterNumEntries;		//dbtechtree declare 1 less entry, because Epochs are not counted...
	public boolean supportNumAlteration;	//if true, you can add/remove entries. If false, the file expect the given entries (no more, no less).
	public int indexName;			//index of the entry in the array, which define the Name
	public int indexSequence;		//index of the entry in the array, which define the Sequence number
	public int indexID;				//index of the entry in the array, which define the ID
	public int indexCountExtra;		//index of the entry in the array, which define the number of extra entries
	public EntryStruct extraEntry;	//if not null, the entry can have extra fields of this type
	public EntryStruct[] entries;	//array of fields

	DatStructure(String fileName, int alterNumEntries, boolean supportNumAlteration, int indexName, int indexSequence, int indexID, int indexCountExtra, EntryStruct extraEntry, EntryStruct...entries){
		this.fileName = fileName;
		this.alterNumEntries = alterNumEntries;
		this.supportNumAlteration = supportNumAlteration;
		this.entries = entries;
		this.extraEntry = extraEntry;
		this.indexName = indexName;
		this.indexSequence = indexSequence;
		this.indexID = indexID;
		this.indexCountExtra = indexCountExtra;
	}
	
	
	

	
}
