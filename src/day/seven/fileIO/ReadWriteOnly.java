package day.seven.fileIO;

import java.io.File;
import java.io.IOException;

public class ReadWriteOnly {

	static File file = new File("Demo.txt");
	public static void main(String[] args) throws IOException {
		readOnlyfile();
		file.setWritable(true);
		
		File newFile = new File("DemoTest.txt");
		file.renameTo(newFile);
	}

	// this is method will create file in read only file.

	private static void readOnlyfile() throws IOException {
		File file = new File("Demo.txt");

		if (file.exists()) {
			file.setReadOnly();
		}
		else {
			System.out.println("File does not exist");
		}
		// file.createNewFile();
	}

}
