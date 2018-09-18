package day.four.OOP;

public class JavaExample {
	
	String web;

	public JavaExample(String web) {
	
		this.web = web;
	}
	
	public JavaExample(JavaExample je) {
		web = je.web;
	}
	
	void disp() {
		System.out.println("Website " + web);
	}
	
	public static void main(String[] args) {
		JavaExample obj1 = new JavaExample("JavaLearingCenter");
		JavaExample obj2 = new JavaExample(obj1);
		obj1.disp();
		obj2.disp();
	}

}
