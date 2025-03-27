package MethodAndClassReference;

/**
 * In this program i am demonstrating Static Method reference
 * I have an interface called Interf and a add(int a, int b) method in it 
 * In the class p1 i have add method whose parameter resembles the Interf add method
 * I am calling Interf add method using a static method present in class p1
 */

interface Interf{
	
	public int add(int a, int b) ;
}


public class p1 {
	
	public static int add(int a , int b) {
		
		return a + b ;
	}
	
	public static void main(String[] args) {
		
		
		Interf i = (a, b) -> a + b ;
		
		System.out.println("The Sum is : "+i.add(25, 60));
		
		Interf i1 = p1::add ;
		
		System.out.println(i1.add(76, 68));
	}

}
