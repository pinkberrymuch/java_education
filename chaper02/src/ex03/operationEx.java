package ex03;

public class operationEx {

	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		double result = (double) x / (double) y;
		System.out.println(result);
        
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		//byte byteValue3 = byteValue1 + byteValue2;
		int intvalue1 = byteValue1 + byteValue2;
		System.out.println(intvalue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		//char charValue3 = charValue1 + charValue2;
		int intvalue2 = charValue1 + charValue2;
		System.out.println("유니코드=" + intvalue2);
		System.out.println("출력문자=" + (char) intvalue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);
		
		int intValue5 = 10;
		//int intValue6 = 10 / 4.0;
		double doubleValue = intValue5 /4.0;
		System.out.println(doubleValue);
	}

}
