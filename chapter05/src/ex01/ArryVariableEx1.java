package ex01;

import java.util.Scanner;

public class ArryVariableEx1 {

	public static void main(String[] args) {
		//���� 10�� �Է��� �޴´�.
		Scanner scan = new Scanner(System.in);

		int[] arr = new int[10];
		int i;

		for( i=0; i<10; i++)
		{
			System.out.print("���� 10�� �Է�: ");
			arr[i] = scan.nextInt();
		}

		System.out.print(arr[2]+" "+arr[4]+" "+arr[arr.length-1]);
		scan.close();
  }
}
