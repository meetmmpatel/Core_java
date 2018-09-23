package day.six.exceptions;

import java.io.IOException;

public class ThrowsExample {
	
	public static void main(String[] args) {
		 Example ex = new Example();
		 try {
			ex.myMethod(0);
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("out side of try block");
	}

}

class Example {
	void myMethod(int num) throws IOException, ClassNotFoundException {

		if (num == 1) {
			throw new IOException("IO exceptions");
		}
		else
			throw new ClassNotFoundException("Class not found exceptions");

	}

}
