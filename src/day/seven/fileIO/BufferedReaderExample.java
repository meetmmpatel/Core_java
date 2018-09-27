package day.seven.fileIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

	public static void main(String[] args) throws IOException {
		tryWithResource();
		BufferedReader bufferedReader = null;

		try {

			String currLine;

			bufferedReader = new BufferedReader(new FileReader("Demo.txt"));

			while ((currLine = bufferedReader.readLine()) != null) {
				System.out.println(currLine);
			}

		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (bufferedReader != null)
					bufferedReader.close();
			}
			catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
	
	public static void tryWithResource() throws IOException {
		try(BufferedReader bufferedReader = new BufferedReader(new FileReader("Demo.txt"))) {
			
		}
		catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		
	}
	

}
