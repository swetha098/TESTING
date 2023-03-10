package USTBatchNo3.junit5testcase;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.LinkedHashMap;
import java.util.Map;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import USTBatchNo3.junit5testcase.dupecount;
public class dupecounttest {
	@Test
	public void dupec() {
	Map<String,Long>m=new LinkedHashMap<>();
	m.put("as",(long) 2);
	m.put("ka",(long) 1);
	m.put("wa",(long) 2);
	List<String> l1=Arrays.asList("as","wa","as","wa","ka");
	Map<String,Long>actual=dupecount.count1(l1);
	assertEquals(m,actual);
	
	
	
}
}

