package USTBatchNo3.junit5testcase;
	import static org.junit.Assert.assertEquals;

	import org.junit.Test;

	import USTBatchNo3.junit5testcase.vowelcount;


	public class vowelstesting {
		
		@Test
		public void counttesting() {
			
			String input ="sharath";
			
			int expected=2;
			int actual=vowelcount.countvowels(input);
			assertEquals(expected,actual);
			
		}
		
		
		

	}

