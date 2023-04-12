package ex04;

public class keyCodeEx {

	public static void main(String[] args) throws Exception {
		int keycode;
		
		while(true) { 
			keycode = System.in.read();
		    System.out.println("keycode: " + keycode);
			if(keycode ==113) {
				break; //키코드과 113과 동일 할 경우 실행
			}
		}
		  System.out.println("종료");
		//keycode = System.in.read();
		//System.out.println("keycode: " + keycode); //a 입력
		
		//keycode = System.in.read();
		//System.out.println("keycode: " + keycode); //엔터키 입력 CR
		
		//keycode = System.in.read();
		//System.out.println("keycode: " + keycode); //엔터키 입력 LF

	}

}
