package ex03;

public class Board { //���̺귯�� Class
	//�ʵ�
	String title;
	String content;
	String writer;
	String date;
	int hitcount =0;
	
	
	
	//this ()
	  Board () {
	    }
		
		Board (String title,String content) {
			this(title, content, null, null, 0); //ȣ��
		}
		Board (String title,String content,String writer) {
			this(title, content, writer, null, 0); //ȣ��
		}
		Board (String title,String content,String writer,String date) {
			this(title, content, writer, date, 0); //ȣ��
		}
		//��������ڵ�
		Board (String title,String content,String writer,String date ,int hitcount) {
			this.title = title; 
			this.content = content;
			this.writer = writer;
			this.date = date;
			this.hitcount = hitcount;
		}	
		

}
