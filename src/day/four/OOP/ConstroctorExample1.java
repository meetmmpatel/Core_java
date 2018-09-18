package day.four.OOP;

public class ConstroctorExample1 {
	
	   private int var;
	   
	   
	   public ConstroctorExample1() {
		   this.var = 10;
		   
	   }
	
	   public ConstroctorExample1 (int num) {
		   this.var = num;
	   }
	
	   public int getValue() {
		   return var;
	   }
	   
	   public static void main(String[] args) {
		   ConstroctorExample1 obj = new ConstroctorExample1();
		   ConstroctorExample1 obj2 = new ConstroctorExample1(100);
		   System.out.println(obj.getValue());
		   System.out.println(obj2.getValue());
		   
	}

}
