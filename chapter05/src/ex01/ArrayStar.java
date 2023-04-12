package ex01;

import java.util.Scanner;

public class ArrayStar {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		
		 int tNum[] = new int[3];
		 
		 for(int i=0; i<tNum.length; i++) {
			System.out.print("배열에 저장할 3개 정수를 입력하세요");
			tNum[i]=scan.nextInt(); 
			//for문 안에서 스캐너 입력 받을때는 배열변수[] 안에 i변수가 들어가야
			//스캔이 인식이 된다.
			
			
		} for(int i=0; i<tNum.length; i++) { 
			System.out.println(tNum[i] + " : ");
			for(int j=0; j<tNum[i]; j++) {  //별찍기 
				System.out.println("*");
			}
      }scan.close();
	}
 }
	