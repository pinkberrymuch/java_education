package ex01;

public class arrayCopy2Ex { //���ڿ� �迭 ����

	public static void main(String[] args) {
		String[] oldStrArray = {"�迭", "�����", "�Ф�"};
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
        
		
		//new�� old���� ���� �ٿ��ֱⰡ �Ǿ�����, ȣ���� ���Ѿ� ��
		for(int i=0; i<newStrArray.length; i++) { 
			System.out.print(newStrArray[i] + ".");
		}
	}

}
