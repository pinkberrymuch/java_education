package ex01;

import java.util.Scanner;

public class if_else_If_Ex {

     	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in, "EUC-KR");
			System.out.print("����: ");
			int v1 = scanner.nextInt();
		 	
		 if( v1 >=90) {
			  System.out.println("������ 100~90 �Դϴ�.");
			  System.out.println("����� A �Դϴ�.");
		}else if(v1 >=80) {
			  System.out.println("������ 80~89 �Դϴ�.");
			  System.out.println("����� B �Դϴ�.");
		}else if(v1 >=70) {
			  System.out.println("������ 70~79 �Դϴ�.");
			  System.out.println("����� C �Դϴ�.");
		}else {
			  System.out.println("������ 70�� �̸��Դϴ�.");
			  System.out.println("����� D �Դϴ�.");
		} scanner.close();

	}

}
