package day.four.OOP;

class AnimalOne {
	public void eat() {
		System.out.println("Animal is eating");
	}
}

public class OverRideTest extends AnimalOne {
	public void eat() {

		System.out.println("Dog is eating ");
		super.eat();
	}

	public static void main(String[] args) {
		OverRideTest obj = new OverRideTest();
		obj.eat();

		AnimalOne obj1 = new AnimalOne();
		obj1.eat();

	}
}
