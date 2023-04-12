package ex02;
import java.util.Scanner;
public class foronetwotenEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in, "EUC-KR");
		System.out.print("숫자를 입력해 주세요: ");
		int v1 = Integer.parseInt(scanner.nextLine());
		int sum = 0;
		
		for(int i=1; i<=v1; i++) {
		
			sum += i;
			
		}  System.out.println(" 모두 합하면 " + sum);
		
		
       
        }
		
		
		
		
	}


