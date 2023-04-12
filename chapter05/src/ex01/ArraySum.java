package ex01;

public class ArraySum {

	public static void main(String[] args) {
		int[][] arr = {
				{5, 5, 5, 5, 5} ,
				{10, 10, 10, 10, 10},
				{20, 20, 20, 20, 20},
				{30, 30, 30, 30, 30} };
		
		int sum = 0;
		int count = 0;
		
		for(int i=0; i < arr.length; i++) {
			for(int j=0; j < arr[i].length; j++) {
				sum += arr[i][j];
				count++; //개수를 세는 변수
			}
		}
		System.out.println("총점: " + sum);
		System.out.println("평균: " + sum/count);
	
	}

}
