package ex04;
import java.util.Scanner; //��ĳ�� ���� �ʼ�
public class scannerEx {
	


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in, "EUC-KR");
		String inputData;

		
		while(true) { 
			inputData = scanner.nextLine();
			System.out.println("�Էµ� ���ڿ�: \"" + inputData + "\"" );
			if( inputData.equals("q")) {
				break; 
			}
		}
		System.out.println("����");
		  scanner.close();
	}

}
