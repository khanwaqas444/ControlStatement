package operator;

public class Operator { 
	
	public static void main(String[] args) {
		
		int value = +1;
		
		// result is now 1 
		System.out.println(value);
		
		value--;
		// result is now 0 
		System.out.println(value);
		
		value++;
		// result is now 1
		System.out.println(value);
		
		value = -value;
		//result is now -1
		System.out.println(value);
		
		boolean success = false;
		// false
		System.out.println(success);
		// true
		System.out.println(!success);
		
	}

}
