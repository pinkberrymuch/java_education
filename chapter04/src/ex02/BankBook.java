package ex02;

public class BankBook { //���̺귯��
  int money, balance;
  
	//�޼ҵ�
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
