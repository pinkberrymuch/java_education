package ex03;

public class Car { //라이브러리 클래스
    //필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자 1- 즁복코드 위험
	/*Car() {
    }
	
	Car(String model) {
		this.model = model;
	}
	Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	Car(String model, String color,int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;*/
	
	//this ()
	Car() {
    }
	
	Car(String model) {
		this(model, null, 0); //호출
	}
	Car(String model, String color) {
		this(model, color, 0); //호출
	}
	Car(String model, String color, int maxSpeed) {
		this.model = model;  //공통실행코드
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
	


}