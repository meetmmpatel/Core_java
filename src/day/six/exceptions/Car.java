package day.six.exceptions;

public class Car {

	public static void main(String[] args) {
		Car obj1 = new Car();
		try {
			obj1.CarWheelDoor(3, 4);
		}
		catch (CarExceptions e) {

			System.out.println(e.getMessage());

		}

	}

	void CarWheelDoor(int Door, int Wheel) throws CarExceptions {
		if (Door < 4 || Wheel < 4) {
			throw new CarExceptions("Car door or wheels less than 4");
		}
		else {
			System.out.println("Car is valid");
		}
	}

}

class CarExceptions extends Exception {
	public CarExceptions(String s) {
		super(s);
	}
}
