package ex03;

public class castingEx {

	public static void main(String[] args) {
		int intvalue = 44032;
		char charValue = (char) intvalue;
		System.out.println(charValue);
		
		long longValue = 500;
		intvalue = (int) longValue;
		System.out.println(intvalue);
		
		double doubleValue = 3.14;
		intvalue = (int) doubleValue;
		System.out.println(intvalue);

	}

}
