package day.four.OOP;

public class Car {

	int wheels;
	static String color;
	String Model;
	int door;
	String engineType;
	
	
	public Car(int wheels, String color, String model,int door,String engineType) {
		this.wheels = wheels;
		this.color = color;
		this.Model = model;
		this.door = door;
		this.engineType = engineType;
		
	}
	
	public static String getAll() {
		return color;
	}
	
	public static String setColor(String carColor) {
		color = carColor;
		return color;
	}
	
	public static void main(String[] args) {
		Car car1 = new Car(4,"Red","Model X",2,"V6");
		Car car2 = new Car(4,"Silver","Model 3",4,"V4");
//		Car car3 = new Car(4,"Black","Model Y",4,"V12");
		System.out.println(car1);
		
		System.out.println(getAll());
		System.out.println(setColor("blue"));
	}
  // Car class
	// 4 or 5 vairabel like wheels, color , model, door , engineType

	@Override
	public String toString() {
		return "Car [wheels=" + wheels + ", Model=" + Model + ", door=" + door + ", engineType=" + engineType + "]";
	}
	
	// three cars but they should have diffreent parameter values.
	
	
	

}
