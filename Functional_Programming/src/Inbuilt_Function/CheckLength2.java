package Inbuilt_Function;

import java.util.Arrays;
import java.util.function.Predicate;

/**
 * TO check the length greater than 5 or not
 */
public class CheckLength2 {
	
	public static void main(String[] args) {
		
		String arr [] = {"Jeevith", "san", "meerai", "kannu", "sree", "kan"} ;
		
		Predicate<String> flag1 = s -> s.length() > 5;
		
		Predicate<String> flag2 = s -> s.startsWith("J") ;
		
		Arrays.stream(arr).forEach(i -> {
			if(flag1.and(flag2).test(i)) System.out.println(i) ;
		});
		
	}
}
