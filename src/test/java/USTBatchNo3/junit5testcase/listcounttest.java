package USTBatchNo3.junit5testcase;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class listcounttest {
	
	@Test
	public void counttesting() {
		
		long expected=2;
		long actual=count();
		assertEquals(expected,actual);
		
	}
	public long count() {
		List<String> l1=Arrays.asList("as","df","as");
		long dupe=l1.stream().filter(name->name.equalsIgnoreCase("as")).count();
		return dupe;
		
	}
}
