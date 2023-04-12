package ex03;

public class TelevisionExample {

	public static void main(String[] args) {
		//나의 텔레비전
		Television myTv = new Television(7,9,true);
		System.out.println("나의 텔레비전 채널은" + myTv.channel +
				","+ "볼륨은" + myTv.volume + "," + "현재 상태는"
				+ myTv.onOff + "입니다.");
	
		System.out.println();
		
		//너의 텔레비전
		Television youTv = new Television(9,12,true);
		System.out.println("너의 텔레비전 채널은" + youTv.channel +
				","+ "볼륨은" + youTv.volume + "," + "현재 상태는"
				+ youTv.onOff + "입니다.");


	}

}
