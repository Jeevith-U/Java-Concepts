package MethodAndClassReference;

public class p2 {
	
	public static void test() {
		for(int i = 1 ; i <= 10 ; i++)
		System.out.println("This is static Method");
	}
	
	public static void main(String[] args) {
		
		Runnable r = p2::test ;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("This is Main Method");
		}
		
		Thread t = new Thread(r) ;
		
		t.start();
		
	}

}
