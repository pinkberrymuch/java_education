package ex01;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in, "EUC-KR");
		int[] num =  new int[5];
		int max =0; //�ִ밪�� ����
	
		System.out.printf("��� 5���� �Է��ϼ���" );
		for(int i=0; i<num.length; i++) {
			num[i]= scanner.nextInt();
			
			if(max < num[i] )	{
				 max = num[i];
			    }
			}
			System.out.println( "���� ū ����: " + max );
			scanner.close();
		}

	}


