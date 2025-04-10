package Aggregate_Functions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AggregateFunAverageInt {
	
	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<Integer>() ;
		
		l.add(1) ;
		l.add(3) ;
		l.add(8) ;
		l.add(2) ;
		l.add(5) ;
		l.add(4) ;
		l.add(10) ;
		
		  Double sumValue = l.stream().collect(Collectors.averagingInt(Integer::intValue)) ;
		
		System.out.println(sumValue);
		
	}
}
