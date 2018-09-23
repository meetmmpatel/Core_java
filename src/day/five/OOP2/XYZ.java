package day.five.OOP2;

public class XYZ {
	
	public static void main(String[] args) {
		
		ABC obj = new ABC();
		obj.myMethod();
		
		XYZ obj1 = new XYZ();
		obj1.myMethod();
		

		
	}
	
	public void myMethod() {
		System.out.println("this the child class");
	}

}

class ABC{
	
	public void myMethod() {
		System.out.println("From super class");
	}
	
	
}