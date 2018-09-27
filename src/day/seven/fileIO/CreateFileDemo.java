package day.seven.fileIO;

import java.io.File;
import java.io.IOException;

public class CreateFileDemo {

	public static void main(String[] args) {
		File file = new File("Data.txt");
		try {
			

			boolean fvar = file.createNewFile();
			if (fvar) {
				System.out.println("file has been created");
			}
			else {
				System.out.println("File not found");
			}

		}
		catch (IOException e) {
			System.out.println("Exception occured");
			e.printStackTrace();
		}
			
		file.delete();
		
		
	}

}
