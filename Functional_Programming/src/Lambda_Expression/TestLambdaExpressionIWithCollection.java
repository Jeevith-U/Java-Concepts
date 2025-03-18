package Lambda_Expression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestLambdaExpressionIWithCollection {
	
	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<>(List.of(50, 32, 98, 3, 78, 22, 81, 65, 12, 64));
		
		System.out.println(l);
		
		// Ascending Order 
		Comparator<Integer> c1 = (i1, i2) -> {
			
			if( i1 > i2) return 1 ;
			
			else if(i1 < i2) return -1 ;
			
			else return 0 ;
		} ;
		
		// Descending order Order 
				Comparator<Integer> c2 = (i1, i2) -> {
					
					if( i1 > i2) return -1 ;
					
					else if(i1 < i2) return 1 ;
					
					else return 0 ;
				} ;
		
		Collections.sort(l, c2);
		
		System.out.println(l);
	}

}
