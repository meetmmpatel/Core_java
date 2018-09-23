package day.five.OOP2;

public class StaticBinding extends Human {

	// Static binding also know as early binding ..
	//Dinamic or late binding 

	public static void walk() {
		System.out.println("Boy walks");
	}

	public void eat() {
		System.out.println("Boy eats");
	}

	public static void main(String[] args) {

		Human obj = new StaticBinding();

		Human obj1 = new Human();
		obj.walk();
		obj1.walk();
		obj.eat();
		obj1.eat();

	}

}

class Human {

	public static void walk() {
		System.out.println("Human walks");
	}

	public void eat() {
		System.out.println("Human eats");
	}

}
