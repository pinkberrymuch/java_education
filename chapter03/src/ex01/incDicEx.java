package ex01;

public class incDicEx {

	public static void main(String[] args) {
		int x =10;
		int y =10;
		int z;
		
		System.out.println("------------------");
		x++; //11
		++x; // x++ 이후 또 증가했으므로 12
		System.out.println("x= " + x);
        
		System.out.println("------------------");
		y--; //9
		--y; // y-- 이후 또 감소했으므로 8
		System.out.println("y= " + y);
		
		System.out.println("------------------");
		z= x++; 
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		
		System.out.println("------------------");
		z= ++x;
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		
		System.out.println("------------------");
		z= ++x + y++;
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		System.out.println("y= " + y);
	}

}
