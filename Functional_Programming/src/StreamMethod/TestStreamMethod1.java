package StreamMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreamMethod1 {
	
	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<Integer>() ;
		
		l.add(123) ; l.add(21) ; l.add(87) ; l.add(236) ;
		l.add(124) ; l.add(89) ; l.add(68) ;
		
		List<Integer> res = l.stream()
				.filter(i ->  (i % 2) == 0)
				.collect(Collectors.toList()) ;
		
		System.out.println(res);
	}

}
