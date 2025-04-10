package Aggregate_Functions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AggregateFunCount {
	
	public static void main(String[] args) {
		
		List<String> l = new ArrayList<String>() ;
		
		l.add("Meerai") ;
		l.add("San") ;
		l.add("sanjee") ;
		l.add("sanjana") ;
		l.add("nami chan") ;
		l.add("Robin") ;
		l.add("Roronova Zoro") ;
		
		Long res = l.stream().collect(Collectors.counting()) ;
		
		System.out.println(res);
	}
}
