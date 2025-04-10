package StreamMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestStream_min_Method {
	
	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<Integer>() ;
		
		l.add(123) ; l.add(21) ; l.add(87) ; l.add(236) ;
		l.add(124) ; l.add(89) ; l.add(68) ;
		
		Integer min = l.stream().min((i1, i2) -> i1.compareTo(i2)).get() ;
		
		System.out.println(min);
	}

}
