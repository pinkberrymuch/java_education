package ex01;

public class ArrayEx {

	public static void main(String[] args) {
		int[] scores; //배열 변수선언
		scores =new int[] {83, 90, 87}; //배열생성
		
		System.out.println("scores[0]: " + scores[0] );
		System.out.println("scores[1]: " + scores[1] );
		System.out.println("scores[2]: " + scores[2] );
		
		int sum=0;
		for(int i=0; i<scores.length; i++) { //변수.length = 길이값
			sum += scores[i];
		}
		System.out.println("총합: " + sum );
        
		double avg= (double) sum / 3;
		System.out.println("평균: " + avg );
			
		}
	

  
}