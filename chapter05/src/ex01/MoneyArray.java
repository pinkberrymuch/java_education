package ex01;

import java.util.Scanner;

public class MoneyArray {

    public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
    
     int[] won = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
    
     while(true) {
		System.out.println("----------");
	    System.out.println("�ݾ��Է� (���� 0 �Է½� ���α׷� ����) : ");
	    int money = scan.nextInt();
	    if(money == 0) { //����ó��
	    	 System.out.println("<���α׷��� �����մϴ�>");
	        break;
	    }
        
        for(int i = 0; i<won.length; i++) {
        	
            System.out.println(won[i] + "�� : " + (money/won[i]));
            money %= won[i];
          }
       } scan.close();
    }

 }
