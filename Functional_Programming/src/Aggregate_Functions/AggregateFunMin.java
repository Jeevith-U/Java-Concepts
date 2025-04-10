package Aggregate_Functions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AggregateFunMin {
	
	public static void main(String[] args) {
		
		List<String> l = new ArrayList<String>() ;
		
		l.add("Meerai") ;
		l.add("San") ;
		l.add("sanjee") ;
		l.add("sanjana") ;
		l.add("nami chan") ;
		l.add("Robin") ;
		l.add("Roronova Zoro") ;
		
		Optional<String> res = l.stream().min(Comparator.comparing(String::length));
		
		System.out.println(res.get());
	}
}
