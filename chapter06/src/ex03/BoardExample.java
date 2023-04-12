package ex03;

public class BoardExample { //실행 class

	public static void main(String[] args) {
		Board board1 = new  Board("제목","내용");
		
		 System.out.println("---board1---");
		 System.out.println("title: " + board1.title);
		 System.out.println("content: " + board1.content);
		 System.out.println();
		
		Board board2 = new  Board("제목","내용","홍길동");
		
		 System.out.println("---board2---");
		 System.out.println("title: " + board2.title);
		 System.out.println("content: " + board2.content);
		 System.out.println("writer: " + board2.writer);
		 System.out.println();
		 
	    Board board3 = new  Board("제목","내용","홍길동","2025-12-31");
	    
	     System.out.println("---board3---");	
		 System.out.println("title: " + board3.title);
		 System.out.println("content: " + board3.content);
		 System.out.println("writer: " + board3.writer);	
		 System.out.println("date: " + board3.date);
		 System.out.println();
		
	    Board board4 = new  Board("제목","내용","홍길동","2025-12-31");
	    
	     System.out.println("---board4---");	
		 System.out.println("title: " + board4.title);
		 System.out.println("content: " + board4.content);
		 System.out.println("writer: " + board4.writer);	
		 System.out.println("date: " + board4.date);
		 System.out.println("hitcount: " + board4.hitcount);
		 
		
		
		
		

	}

}
