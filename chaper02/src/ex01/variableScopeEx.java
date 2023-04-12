package ex01;

public class variableScopeEx {

	public static void main(String[] args) {
		int v1=15;
		if(v1>10) {
			int v2;
			v2 = v1 -10;
		}
       int v3= v1 + 5;
       System.out.println(v3);
	}

}
