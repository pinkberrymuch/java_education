package ex01;

public class variableEx {

	public static void main(String[] args) {
		int value = 20;
		int result = value + 10;
		System.out.println(result);
		
     //변수선언
		int hour= 3;
		int minute = 5;
		System.out.println(hour + "시간" + minute + "분");
		
		int totalMinute = (hour*60) + minute;
		System.out.println("시간" + totalMinute + "분");
	
	//변수의 복사
		int x=3;
		int y=5;
		System.out.println("x :" + x + ",y :" + y);
		
		int temp =x;
		x = y;
		y = temp;
		System.out.println("x :" + x + ",y :" + y);
	
	}
	

}
