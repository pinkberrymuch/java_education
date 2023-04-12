package ex02;

public class BankBook { //라이브러리
  int money, balance;
  
	//메소드
	void deposit(int money_in) {
	balance += money;	
	}
	void withdraw(int money_out) {
    balance -= money;	
	}
	void showMoney() {
	System.out.println(balance);	
	}
	
}
