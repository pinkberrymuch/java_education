package ex01;

import java.util.Scanner;

public class MoneyArray {

    public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
    
     int[] won = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
    
     while(true) {
		System.out.println("----------");
	    System.out.println("금액입력 (숫자 0 입력시 프로그램 종료) : ");
	    int money = scan.nextInt();
	    if(money == 0) { //예외처리
	    	 System.out.println("<프로그램을 종료합니다>");
	        break;
	    }
        
        for(int i = 0; i<won.length; i++) {
        	
            System.out.println(won[i] + "원 : " + (money/won[i]));
            money %= won[i];
          }
       } scan.close();
    }

 }
