package StreamMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * count() will return a long value
 */
public class TestStreammapMethod2 {
	
	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<Integer>() ;
		
		l.add(12) ; l.add(1) ; l.add(4) ; l.add(8) ;
		l.add(3) ; l.add(9) ; l.add(1) ;
		
		 long res = l.stream()
				 .map(i -> i*2)
				 .filter(i -> i > 15)
				 .count() ;
		
		System.out.println(res);
	}

}
