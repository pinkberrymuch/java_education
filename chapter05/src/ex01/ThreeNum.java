package ex01;

public class ThreeNum {

	public static void main(String[] args) {
		int[] arr = new int[45];
		int  i, n, tmp;
		
		for(i=0; i<arr.length; i++) { 
			arr[i] = i+1;
		}
		for(i=0; i<6; i++) {  //+1하는 이유는 0 제외 1부터 추출할려고
			n = (int)(Math.random() * 45); //1부터 45까지
			
			tmp = arr[i]; //인덱스 0번째 : 1이 들어가있음 1을 tmp에 입력
			arr[i] = arr[n];
			arr[n] = tmp; //중복제거 작업
			
	   System.out.print("로또 번호: ");
	
	
	  } System.out.println("arr[" + i +"] : " + arr[i]);
   }
}
