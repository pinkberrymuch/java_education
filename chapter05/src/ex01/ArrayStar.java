package ex01;

import java.util.Scanner;

public class ArrayStar {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		
		 int tNum[] = new int[3];
		 
		 for(int i=0; i<tNum.length; i++) {
			System.out.print("�迭�� ������ 3�� ������ �Է��ϼ���");
			tNum[i]=scan.nextInt(); 
			//for�� �ȿ��� ��ĳ�� �Է� �������� �迭����[] �ȿ� i������ ����
			//��ĵ�� �ν��� �ȴ�.
			
			
		} for(int i=0; i<tNum.length; i++) { 
			System.out.println(tNum[i] + " : ");
			for(int j=0; j<tNum[i]; j++) {  //����� 
				System.out.println("*");
			}
      }scan.close();
	}
 }
	