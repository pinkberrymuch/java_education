package ex01;

import java.util.Scanner;

public class ArryVariableEx2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] num2 = new int[100];
		int i, j = 0;

		for( i=0; i<num2.length; i++) {
			System.out.print("���� 100�� �Է� (����: 0�Է½� 0�� �����ϰ� �ٷ� �� ���): ");
			num2[i] = scan.nextInt();

			if( num2[i] == 0) {
			 break;
			} j++; //���ݱ��������� �����͸� ��� �����鼭
		   }

		for( i=j-1; i>=0; i--){ //�Ųٷ� ��� (�����ֱ� �Է��Ѱ� ���)
			System.out.print(num2[i]+" ");
		}scan.close();
	}
 

 }

