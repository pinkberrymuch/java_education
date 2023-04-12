package ex01;

public class arithmetOpEX {

	public static void main(String[] args) {
		int int1 = 10;
		int int2 = 4;
		
		int result1 = int1 / int2;
		System.out.println("result1= " + result1);
		double result2 = (double) int1 / int2; // 실수의 결과치를 위한 캐스팅
		System.out.println("result2= " + result2);
		
		int v1 =5;
		int v2 =2;
		
		int result3 = v1 * v2;
		System.out.println("result3= " + result3);
		
		int result4 = v1 / v2;
		System.out.println("result4= " + result4);
		
		int result5 = v1 % v2;
		System.out.println("result5= " + result5);
		
		double result6 =  (double) v1 / v2;
		System.out.println("result6= " + result6);
		
	}

}
