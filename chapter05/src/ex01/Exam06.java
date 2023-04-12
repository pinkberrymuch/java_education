package ex01;

public class Exam06 {

	public static void main(String[] args) {
		int[][] Score = { {95,80}, {92,96}, {50,78}, {73,84} };
		
		int sum=0;
		int avg=0;
		double avg_s =0.0;
		for(int i=0; i < Score.length; i++) { 
			for(int k=0; k < Score[i].length; k++) {
			  sum += Score[i][k];
			  avg +=1;
			}
			avg_s = sum/avg;
		}System.out.println("ÃÑÁ¡: " + sum );
		 System.out.println("Æò±Õ: " + avg);

	}

}
