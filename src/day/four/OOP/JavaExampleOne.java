package day.four.OOP;

class SuperClass {
	
	public SuperClass() {
		System.out.println("This is form super class Constructor ");
	}
	
	void disp() {
		System.out.println("Super Class method");
	}
}

public class JavaExampleOne extends SuperClass {
	
	public JavaExampleOne() {
		System.out.println("Child Class constuctor");
	}
	
	void disp() {
		System.out.println("child Class method");
		
		super.disp();
	}
	
	public static void main(String[] args) {
		JavaExampleOne obj = new JavaExampleOne();
		obj.disp();
		
		
	}

}
