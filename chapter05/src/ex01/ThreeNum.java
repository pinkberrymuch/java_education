package ex01;

public class ThreeNum {

	public static void main(String[] args) {
		int[] arr = new int[45];
		int  i, n, tmp;
		
		for(i=0; i<arr.length; i++) { 
			arr[i] = i+1;
		}
		for(i=0; i<6; i++) {  //+1�ϴ� ������ 0 ���� 1���� �����ҷ���
			n = (int)(Math.random() * 45); //1���� 45����
			
			tmp = arr[i]; //�ε��� 0��° : 1�� ������ 1�� tmp�� �Է�
			arr[i] = arr[n];
			arr[n] = tmp; //�ߺ����� �۾�
			
	   System.out.print("�ζ� ��ȣ: ");
	
	
	  } System.out.println("arr[" + i +"] : " + arr[i]);
   }
}
