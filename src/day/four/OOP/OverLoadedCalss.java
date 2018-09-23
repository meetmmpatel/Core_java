package day.four.OOP;

public class OverLoadedCalss {

	int num1;
	int num2;
	String str;

	public OverLoadedCalss() {}

	public OverLoadedCalss(int num1, int num2, String str) {
		
		this.num1 = num1;
		this.num2 = num2;
		this.str = str;
	}

	void add() {

	}

	protected void add(int num1, int num2) {
		System.out.println(num1 + num2);
	}

}


class OverRide extends OverLoadedCalss {

	void add(double num1, double num2) {

	}

	@Override
	public void add(int num1, int num2) {
		System.out.println(num1 + num2);
	}

}
