package ex01;

import java.util.Scanner;

public class ArryVariableEx2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] num2 = new int[100];
		int i, j = 0;

		for( i=0; i<num2.length; i++) {
			System.out.print("정수 100개 입력 (주의: 0입력시 0을 제외하고 바로 값 출력): ");
			num2[i] = scan.nextInt();

			if( num2[i] == 0) {
			 break;
			} j++; //지금까지수집한 데이터를 계속 돌리면서
		   }

		for( i=j-1; i>=0; i--){ //거꾸로 출력 (가장최근 입력한거 출력)
			System.out.print(num2[i]+" ");
		}scan.close();
	}
 

 }

