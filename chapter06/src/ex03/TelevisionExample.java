package ex03;

public class TelevisionExample {

	public static void main(String[] args) {
		//���� �ڷ�����
		Television myTv = new Television(7,9,true);
		System.out.println("���� �ڷ����� ä����" + myTv.channel +
				","+ "������" + myTv.volume + "," + "���� ���´�"
				+ myTv.onOff + "�Դϴ�.");
	
		System.out.println();
		
		//���� �ڷ�����
		Television youTv = new Television(9,12,true);
		System.out.println("���� �ڷ����� ä����" + youTv.channel +
				","+ "������" + youTv.volume + "," + "���� ���´�"
				+ youTv.onOff + "�Դϴ�.");


	}

}
