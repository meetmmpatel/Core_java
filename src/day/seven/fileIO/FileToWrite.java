package day.seven.fileIO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileToWrite {
	
	public static void main(String[] args) {
		tryWithResource();
		
		try {
			
			String content = "Hello Java Student!! ";
			File file = new File("JavaStudent.txt");
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write(content);
			bw.close();
			
		}
		catch (Exception e) {
			e.getMessage();
		}
		
	}
	
	public static void tryWithResource() {
		
		try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Demo.txt"))) {
			
			String str = "This is demo file";
			bufferedWriter.write(str);
			bufferedWriter.newLine();
			bufferedWriter.write(str);
			
			
		}
		catch (IOException e) {
			System.out.println("An IO exceptions");
			e.getMessage();
		}
		
		
	}
	

}
