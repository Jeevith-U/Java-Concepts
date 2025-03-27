package Function;

import java.util.function.Function;

public class TestFunction1 {
	
	public static void main(String[] args) {
		
		Function<String, Integer> f = s -> s.length() ;
		
		System.out.println(f.apply("SanjanaCheckLength.java"));
	}
}
