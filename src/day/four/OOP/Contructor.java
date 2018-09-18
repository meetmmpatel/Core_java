package day.four.OOP;

public class Contructor {
	
	int age ;
	String name;
	String address;
	
	/*
	 1. Name of the constructor as same as class name
	 2.  Can not be void or return any parameters
	 3. constructor are always public 
	 
	 */
	public   Contructor() {
		System.out.println("We are calling no-arg cont");
	}
	
	public Contructor(int num , String name) {
		System.out.println(num +" "+ name);
		
	}
	
	Contructor(String str, int age, String add){
		this.name = str;
		this.address = add;
		this.age = age;
		System.out.println( str + add + age);
	}
	
	public static void main(String[] args) {
		Contructor cont = new Contructor();
		Contructor cont1 = new Contructor(23, "Test");
		
		Contructor cont2 = new Contructor("name",25,"120 main st");
		
		
		
	}
	

}
