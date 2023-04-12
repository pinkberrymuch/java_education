package ex02;

public class StarEx {

	public static void main(String[] args) {
		
		for(int i=1; i<8; i++) {
		 for(int j=0; j<i; j++) {
			System.out.print("★");
		  } 
		 System.out.println();
		 }
        for(int i=1; i<4; i++) {
		 for(int j=1; j<4-i; j++) {
			System.out.print("▥");	
		 }for(int h=1; h<=i; h++) {
			System.out.print("▥");
	     }
		 System.out.println(); 
        } System.out.println("어이없어서 만든 별나무...참 별나다 ㅎ");
	} 
 }
