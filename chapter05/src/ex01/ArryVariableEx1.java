package ex01;

import java.util.Scanner;

public class ArryVariableEx1 {

	public static void main(String[] args) {
		//정수 10개 입력을 받는다.
		Scanner scan = new Scanner(System.in);

		int[] arr = new int[10];
		int i;

		for( i=0; i<10; i++)
		{
			System.out.print("정수 10개 입력: ");
			arr[i] = scan.nextInt();
		}

		System.out.print(arr[2]+" "+arr[4]+" "+arr[arr.length-1]);
		scan.close();
  }
}
