package Aggregate_Functions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AggregateFunMax {
	
	public static void main(String[] args) {
		
		List<String> l = new ArrayList<String>() ;
		
		l.add("Meerai") ;
		l.add("San") ;
		l.add("sanjee") ;
		l.add("sanjana") ;
		l.add("nami chan") ;
		l.add("Robin") ;
		l.add("Roronova Zoro") ;
		
		Optional<String> maxStr = l.stream().max(Comparator.comparing(String::length)) ;
		
		System.out.println(maxStr.get());
	}
}
