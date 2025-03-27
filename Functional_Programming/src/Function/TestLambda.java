package Function;

@FunctionalInterface
interface inter1{
	
	public abstract void testM1() ;
}

@FunctionalInterface
interface Addition{
	
	public abstract int add(int a, int b) ;
}

 public class TestLambda {
	
	public static void main(String[] args) {
		
		inter1 i = () -> System.out.println
				("Provided Implementation for Functional Interface testM1()");
		
		Addition add = (a, b) -> a + b ;
		
		i.testM1();
		
		System.out.println("Addition : "+ add.add(10, 20));
		System.out.println("Addition : "+ add.add(10342, 24493));
	}
}
