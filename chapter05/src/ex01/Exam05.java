package ex01;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in, "EUC-KR");
		int[] num =  new int[5];
		int max =0; //최대값의 변수
	
		System.out.printf("양수 5개를 입력하세요" );
		for(int i=0; i<num.length; i++) {
			num[i]= scanner.nextInt();
			
			if(max < num[i] )	{
				 max = num[i];
			    }
			}
			System.out.println( "가장 큰 수는: " + max );
			scanner.close();
		}

	}


