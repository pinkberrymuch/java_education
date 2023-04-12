package ex01;

public class charOpEx {

	public static void main(String[] args) {
		char c1 = 'A' + 1; //유니코드 기준으로 +1이 되었기 때문에 결과:B
		char c2 = 'A';
		char c3 =  (char) (c2 + 1); //유니코드 + 숫자는 Int 이기 때문에 캐스팅 필수
		
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		System.out.println("c3: " + c3);
				
				

	}

}
