package ex02;

public class While1to10Ex {

	public static void main(String[] args) {
		int i=1;
		int sum =0;
		
//		while (i<=10) {
//		  System.out.println(i);	
//		  sum+=i;
//		  i++;
//		}System.out.println("1~" + (i-1) + "гу :" +sum);

	
        do {
          System.out.println(i);	
  		  sum+=i;
  		  i++;
        }while (i<=10); 
       System.out.println("1~" + (i-1) + "гу :" +sum);
	}
}