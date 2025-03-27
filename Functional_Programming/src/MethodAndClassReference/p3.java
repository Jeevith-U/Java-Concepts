package MethodAndClassReference;

public class p3 {
	
	public  void test() {
		for(int i = 1 ; i <= 10 ; i++)
		System.out.println("This is static Method");
	}
	
	public static void main(String[] args) {
		
		p3 obj = new p3() ;
		
		Runnable r = obj::test ;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("This is Main Method");
		}
		
		Thread t = new Thread(r) ;
		
		t.start();
		
	}

}
