package Function;

import java.util.function.Function;

public class TestFunctional {
	
	public static void main(String[] args) {
		
		/**
		 * Function<Integer, Integer>
		 * 			input	 output
		 */
		Function<Integer, Integer> fun = i -> i * i ;
		
		System.out.println("The Square of 10 is : "+ fun.apply(10));
	}
}
