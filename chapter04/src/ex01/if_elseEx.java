package ex01;
import java.util.Scanner;
public class if_elseEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in, "EUC-KR");
		System.out.print("����: ");
		int v1 = scanner.nextInt();
		
		if(v1 >=90) {
			System.out.println("������ 90���� Ů�ϴ�.");
			System.out.println("����� A �Դϴ�.");
          }else {
            System.out.println("������ 90���� �۽��ϴ�.");
  			System.out.println("����� B �Դϴ�.");
          }scanner.close();
	}
}
