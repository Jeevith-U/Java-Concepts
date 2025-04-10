package StreamMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreammapMethod1 {
	
	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<Integer>() ;
		
		l.add(2) ; l.add(1) ; l.add(3) ; l.add(8) ;
		l.add(3) ; l.add(2) ; l.add(1) ;
		
		List<Integer> res = l.stream()
				 .map(i -> i*2)
				 .collect(Collectors.toList()) ;
		
		System.out.println(res);
	}

}
