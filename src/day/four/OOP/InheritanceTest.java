package day.four.OOP;

public class InheritanceTest extends child {
	
	public String name;
	
	    public static void main(String[] args) {
			InheritanceTest test = new InheritanceTest();
			test.sumOfall();
			
			child ch = new InheritanceTest();
			ch.sumOfall();
		
	    	
	    	
		}

}

 class child {
	 
	 int num1  = 10;
	 
	 int num2 = 10;
	 
	 public int sumOfall() {
		int sum =  num1 + num2;
		System.out.println(sum);
		return sum;
	 }
	
	
}
