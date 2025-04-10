package StreamMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * sorted() will return a stream in the sorted format 
 */
public class TestStream_sorted_Method2 {
	
	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<Integer>() ;
		
		l.add(12) ; l.add(1) ; l.add(4) ; l.add(8) ;
		l.add(3) ; l.add(9) ; l.add(1) ;
		
		  List<Integer> res = l.stream()
				  			  .sorted()
				  			  .collect(Collectors.toList()) ;
		
		System.out.println(res);
	}

}
