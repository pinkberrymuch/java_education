package ex01;

import java.util.Scanner;

public class if_else_If_Ex {

     	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in, "EUC-KR");
			System.out.print("점수: ");
			int v1 = scanner.nextInt();
		 	
		 if( v1 >=90) {
			  System.out.println("점수가 100~90 입니다.");
			  System.out.println("등급은 A 입니다.");
		}else if(v1 >=80) {
			  System.out.println("점수가 80~89 입니다.");
			  System.out.println("등급은 B 입니다.");
		}else if(v1 >=70) {
			  System.out.println("점수가 70~79 입니다.");
			  System.out.println("등급은 C 입니다.");
		}else {
			  System.out.println("점수가 70점 미만입니다.");
			  System.out.println("등급은 D 입니다.");
		} scanner.close();

	}

}
