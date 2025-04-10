package EnhancementInCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachMethodOnMap {
	
	public static void main(String[] args) {
		
		Map<Integer, String> names = new HashMap<Integer, String>() ;
		
		names.put(1, "sanjana") ;
		names.put(2, "Jeevith") ;
		names.put(3, "nami") ;
		names.put(4, "Robin") ;
		names.put(5, "devarkonda") ;
		
		names.forEach((k, v) ->System.out.println(k+" "+v));
		
		
	}
}
