package USTBatchNo3.junit5testcase;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class dupecount {
	
	public static void main(String[] args) {
		List<String> l1=Arrays.asList("as","wa","as","wa","ka");
		Map<String, Long> c=count1(l1);
		System.out.println(c);
	}
	
	public static Map<String, Long> count1(List<String> l1) {
		
		Map<String,Long> dupe=l1.stream()
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		return dupe;
		
	}



}
