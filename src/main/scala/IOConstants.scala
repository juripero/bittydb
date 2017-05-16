package xyz.hyperreal.bittydb


trait IOConstants {
	val NULL =				0x00	// JVM null
	val NSTRING =			0X01	// empty (null) string
	val BOOLEAN =			0x10
	val FALSE =				BOOLEAN|0
	val TRUE =				BOOLEAN|1
	val INTEGER =			0x20
	val BYTE =				INTEGER|0
	val SHORT =				INTEGER|1
	val INT =					INTEGER|2
	val LONG =				INTEGER|3
	val BIGINT =			0x30
	val DOUBLE =			0x40
	val DECIMAL =			0x50
	val SSTRING =			0x60	// with length - 1 in low nibble
	val STRING =			0x70	// with encoding included and length size in low nibble
	val UUID =				0x80
	val OBJECT =			0x90
	val EMPTY =				OBJECT|0
	val MEMBERS =			OBJECT|1
	val ARRAY =				0xA0
	val EMPTY_ARRAY =	ARRAY|0
	val ARRAY_ELEMS =	ARRAY|1
	val ARRAY_MEMS =	ARRAY|2
	val LIST =				0xB0
	val NIL =					LIST|0
	val LIST_ELEMS =	LIST|1
	val POINTER =			0xC0
	val TIMESTAMP =		0xD0
	val DATETIME =		0xE0
	val TYPE =				0xF0
	val DELETED =			0xFF
	
	val UBYTE_LENGTH = 0
	val USHORT_LENGTH = 1
	val INT_LENGTH = 2
	val ENCODING_INCLUDED = 4

	val DATETIME_WIDTH = 16

	val NUL = 0					// null pointer value

	val USED = 0xFF
	val UNUSED = 0xEE
}