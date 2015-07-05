package ca.hyperreal.bittydb

import java.io._


class DiskIO( f: File ) extends IO
{
	private lazy val file = new RandomAccessFile( f, "rw" )
	
	def close = file.close
	
	def force = file.getChannel.force( true )
	
	def size: Long = file.length
	
	def size_=( l: Long ) = file.setLength( l )
	
	def pos: Long = file.getFilePointer
	
	def pos_=( p: Long ) = file.seek( p )
	
	def append: Long = {
		val l = file.length
		
		file.seek( l )
		l
	}
	
	def getByte: Byte = file.readByte
	
	def putByte( b: Byte ) = file.writeByte( b )
	
	def getUnsignedByte: Int = file.readUnsignedByte
	
	def getChar: Char = file.readChar
	
	def putChar( c: Char ) = file.writeChar( c )
	
	def getShort: Short = file.readShort
	
	def putShort( s: Short ) = file.writeShort( s )
	
	def getUnsignedShort: Int = file.readUnsignedShort
	
	def getInt: Int = file.readInt
	
	def putInt( i: Int ) = file.writeInt( i )
	
	def getLong: Long = file.readLong
	
	def putLong( l: Long ) = file.writeLong( l )
	
	def getDouble: Double = file.readDouble
	
	def putDouble( d: Double ) = file.writeDouble( d )
	
	def writeChars( s: String ) = file.writeChars( s )
}