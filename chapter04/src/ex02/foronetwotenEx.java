package ex02;
import java.util.Scanner;
public class foronetwotenEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in, "EUC-KR");
		System.out.print("���ڸ� �Է��� �ּ���: ");
		int v1 = Integer.parseInt(scanner.nextLine());
		int sum = 0;
		
		for(int i=1; i<=v1; i++) {
		
			sum += i;
			
		}  System.out.println(" ��� ���ϸ� " + sum);
		
		
       
        }
		
		
		
		
	}


