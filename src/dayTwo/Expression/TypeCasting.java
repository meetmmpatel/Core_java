package dayTwo.Expression;

public class TypeCasting {
	
	public static void main(String[] args) {
		//Implicit Casting = Widening the range
		// Explicit casting = Narrowing the range
		
		int i = 100;
		
		long l = i;
		
		float f = l;
		
		char c = 'c';
		int num = 666;
		
		c = (char) num;
		
		byte b = (byte)i;
		
		double d = 110.24;
		long l1 = (long)d;
		
		System.out.println(b);
		System.out.println(l1);
		
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		
		System.out.println(c);
		
	}

}
