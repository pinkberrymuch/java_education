package ex03;

public class Television { //라이브러리 Class
	//필드
	int channel; //채널번호
	int volume; //볼륨
    boolean onOff = true; //전원상태	
    
  //생성자
  	public Television(int channel, int volume,boolean onOff) {
  		this.channel = channel;
  		this.volume = volume;
  		this.onOff = onOff;
  	}
}
