package day.four.OOP;

public class Animal {
	
	String color;
	int age;
	
	void eat() {
		
	}
	void run() {
		
	}

	public static void main(String[] args) {
		Animal dog = new Animal();
		dog.run();
		dog.eat();
		dog.age = 10;
		
		Animal cat = new Animal();
		cat.run();
		cat.eat();
		
	}
	
}
