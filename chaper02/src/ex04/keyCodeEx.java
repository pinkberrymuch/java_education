package ex04;

public class keyCodeEx {

	public static void main(String[] args) throws Exception {
		int keycode;
		
		while(true) { 
			keycode = System.in.read();
		    System.out.println("keycode: " + keycode);
			if(keycode ==113) {
				break; //Ű�ڵ�� 113�� ���� �� ��� ����
			}
		}
		  System.out.println("����");
		//keycode = System.in.read();
		//System.out.println("keycode: " + keycode); //a �Է�
		
		//keycode = System.in.read();
		//System.out.println("keycode: " + keycode); //����Ű �Է� CR
		
		//keycode = System.in.read();
		//System.out.println("keycode: " + keycode); //����Ű �Է� LF

	}

}
