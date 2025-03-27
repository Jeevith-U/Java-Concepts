package MethodAndClassReference;


/**
 * In the Below Program I am trying to demonstrate the How to use Constructor Reference
 * I have a Class Called TestClass with the Constructor in it.
 * I have a Functional Interface which has a method createObject which return the object
 * In the class p1Constructor i am creating the object of TestClass using constructor reference
 * which is referring to the Interface Interf1 createObject method
 */
class TestClass{
	
	public TestClass() {
		System.out.println("This is TestClass Cons");
	}
}

interface Interf1{
	
	public TestClass createObject() ;
}


public class p1Constructor {
	
	
	public static void main(String[] args) {
		
		
		Interf1 i = TestClass::new ;
		
		TestClass obj = i.createObject() ;
		
		
	}

}
