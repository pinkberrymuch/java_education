package ex01;

public class arrayCopy2Ex { //문자열 배열 복사

	public static void main(String[] args) {
		String[] oldStrArray = {"배열", "어려워", "ㅠㅠ"};
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
        
		
		//new에 old값이 이제 붙여넣기가 되었으니, 호출을 시켜야 함
		for(int i=0; i<newStrArray.length; i++) { 
			System.out.print(newStrArray[i] + ".");
		}
	}

}
