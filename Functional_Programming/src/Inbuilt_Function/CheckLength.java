package Inbuilt_Function;

import java.util.Arrays;
import java.util.function.Predicate;

/**
 * TO check the length greater than 5 or not
 */
public class CheckLength {
	
	public static void main(String[] args) {
		
		String arr [] = {"Jeevith", "san", "meerai", "kannu", "sree", "kan"} ;
		
		Predicate<String> flag = s -> s.length() < 5;
		
		Arrays.stream(arr).forEach(i -> {
			if(flag.test(i)) System.out.println(i) ;
		});
		
	}
}
