package Function;

import java.util.function.Function;

public class TestFunction2 {
	
	public static void main(String[] args) {
		
		// This is adding +2 to given number
		Function<Integer, Integer> fun1 = n -> n + 2 ;
		
		// This will square the Number
		Function<Integer, Integer> fun2 = n -> n * n ;
		
		System.out.println(fun1.andThen(fun2).apply(3)); // 3 +2 = 5 => 5 * 5 = 25
		
		System.out.println(fun1.compose(fun2).apply(3)); // 3*3 = 9 => 9+2 = 11
		
		System.out.println(fun2.andThen(f -> f / 2).apply(10)); // 10 * 10 = 100 => 100 / 2 = 50
		
		
		
	}
}
