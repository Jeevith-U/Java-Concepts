package Supplier;

import java.util.Date;
import java.util.function.Supplier;

/**
 * Supplier interface return an object 
 * Supplier won't take anything as a parameter 
 * There's only one method called get() 
 */
public class TestSupplier2 {
	
	public static void main(String[] args) {
		
		Supplier<Integer> s = () -> {
			
			String otp = "" ;
			
			for (int i = 0; i < 6 ; i++) {
				
				otp += (int)(Math.random()* 10) ;
			}
			
			return Integer.parseInt(otp) ;
		} ;
		
		System.out.println(s.get());
	}
}
