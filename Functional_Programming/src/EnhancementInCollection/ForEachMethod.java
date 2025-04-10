package EnhancementInCollection;

import java.util.ArrayList;
import java.util.List;

public class ForEachMethod {
	
	public static void main(String[] args) {
		
		List<String> names = new ArrayList() ;
		
		names.add("sanjana") ;
		names.add("Jeevith") ;
		names.add("nami") ;
		names.add("Robin") ;
		names.add("devarkonda") ;
		
		names.forEach(System.out::println);
		
		
	}
}
