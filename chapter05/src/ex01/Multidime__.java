package ex01;

public class Multidime__ { //파스칼삼각형 예제

	public static void main(String[] args) {
		int[][] arr = new int [6][6];
		int i,j;
		
		arr[1][1] =1;
		  System.out.println(arr[1][1]);
		  
		
		 for (i=2; i<arr.length; i++) { // 모든 원소를 0으로 초기화
			   for (j=1; j<=i; j++) {
			    arr[i][j] = arr[i-1][j] + arr[i-1][j-1]; //[2][1] +[2][2]
			    System.out.print(arr[i][j]);
			   }
			   System.out.println();
	      }
	 }
}
