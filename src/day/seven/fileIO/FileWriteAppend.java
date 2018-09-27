package day.seven.fileIO;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriteAppend {

	public static void main(String[] args) throws IOException {
		usingPrinterWriter();
		usingFileOutPutStream();

	}

	public static void usingPrinterWriter() throws IOException {

		String text = " Using PrinterWriter class";
		FileWriter fileWriter = new FileWriter("Demo.txt", true);
		// this line will setup file to be in append mode.

		PrintWriter printWriter = new PrintWriter(fileWriter);
		printWriter.println(text);
		printWriter.print(text);
		printWriter.close();

	}

	public static void usingFileOutPutStream() throws IOException {
		
		String text = "\n Using File Out put Stream";
		FileOutputStream fileOutputStream = new FileOutputStream("DemoOne.txt",true);
		byte[] strTobytes = text.getBytes();
		fileOutputStream.write(strTobytes);
		fileOutputStream.close();
	}
	
	
}
