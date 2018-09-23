package day.five.OOP2;

public class Staff {
	
	Address empAdd;
	StudentClass stuInfo;
	public Staff(Address empAdd, StudentClass stuInfo) {
		super();
		this.empAdd = empAdd;
		this.stuInfo = stuInfo;
	}
	
	
	public static void main(String[] args) {
		
		Address ad = new Address(120, "Main", "VA", "USA");
		StudentClass stu = new StudentClass(123, "Jack", ad);
		Staff st = new Staff(ad, stu);
		System.out.println(st.empAdd);
		System.out.println(st.stuInfo);
	}
	

}
