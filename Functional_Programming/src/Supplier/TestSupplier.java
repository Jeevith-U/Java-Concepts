package Supplier;

import java.util.Date;
import java.util.function.Supplier;

/**
 * Supplier interface return an object 
 * Supplier won't take anything as a parameter 
 * There's only one method called get() 
 */
public class TestSupplier {
	
	public static void main(String[] args) {
		
		Supplier<Date> s = () -> new Date() ;
		
		System.out.println(s.get());
	}
}
