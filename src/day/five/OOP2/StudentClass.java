package day.five.OOP2;

public class StudentClass {

	int rollnum;
	String stuName;
	Address stuAddress;

	public StudentClass(int rollnum, String stuName, Address stuAddress) {
		super();
		this.rollnum = rollnum;
		this.stuName = stuName;
		this.stuAddress = stuAddress;
	}

	public static void main(String[] args) {

		Address ad = new Address(120, "Falls Church", "VA", "USA");
		StudentClass obj = new StudentClass(123, "Mike", ad);
		System.out.println(obj.rollnum);
		System.out.println(obj.stuName);
		System.out.println(obj.stuAddress.streetName + " " + obj.stuAddress.city);

	}

	@Override
	public String toString() {
		return "StudentClass [rollnum=" + rollnum + ", stuName=" + stuName + ", stuAddress=" + stuAddress + "]";
	}

	
}
