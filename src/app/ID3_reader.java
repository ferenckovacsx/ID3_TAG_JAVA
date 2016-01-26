package app;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ID3_reader 
	{
	public static void main(String[] args) 
		{
		File mp3_file = new File("C:\\Java\\Workspace\\ID3_handler\\01. Adjust the Future.mp3");
		try {
			RandomAccessFile raf = new RandomAccessFile(mp3_file, "rw");
			byte[] tagData = new byte[128];
	        raf.seek(raf.length() - 128);
	        raf.read(tagData);
	        String bytesAsString = new String(tagData);
	        raf.close();
	        System.out.println(bytesAsString);
		} catch (IOException ex) {
			
		}
	}
}
