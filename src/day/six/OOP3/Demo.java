package day.six.OOP3;

public class Demo implements MyInterface, myInterface2 {

	@Override
	public void method1() {
		System.out.println("Implimentation of method 1");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("Implimentation of method 2");
	}

	public static void main(String[] args) {

		MyInterface obj = new Demo();
		obj.method1();
		obj.method2();

		myInterface2 obj1 = new Demo();
		obj1.method3();
		obj1.method1();
		obj1.method2();
		
		SampleInterface st = new SampleTestClass();
		st.methodOne();
		st.methodTwo();
		

	}

	@Override
	public void method3() {
		System.out.println("Implimentation of method 3");

	}

}

interface MyInterface {
	
	int a = 10;
// public static final 
	public void method1();

	public void method2();

}

interface myInterface2 extends MyInterface {

	public void method3();

}
