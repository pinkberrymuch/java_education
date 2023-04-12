package ex01;
import java.util.Scanner;
public class if_elseEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in, "EUC-KR");
		System.out.print("점수: ");
		int v1 = scanner.nextInt();
		
		if(v1 >=90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
          }else {
            System.out.println("점수가 90보다 작습니다.");
  			System.out.println("등급은 B 입니다.");
          }scanner.close();
	}
}
