package ex04;
import java.util.Scanner; //스캐너 사용시 필수
public class scannerEx {
	


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in, "EUC-KR");
		String inputData;

		
		while(true) { 
			inputData = scanner.nextLine();
			System.out.println("입력된 문자열: \"" + inputData + "\"" );
			if( inputData.equals("q")) {
				break; 
			}
		}
		System.out.println("종료");
		  scanner.close();
	}

}
