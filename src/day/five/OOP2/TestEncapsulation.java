package day.five.OOP2;

public class TestEncapsulation {
	
	
	public static void main(String[] args) {
		
		int rd= 10;
		
		Encapsulate obj = new Encapsulate();
		obj.setAge(35);
		obj.setName("Java");
		obj.setRollNumber(123);
		
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
		System.out.println(obj.getRollNumber());
		
	}

}
