package USTBatchNo3.junit5testcase;
import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import org.junit.Test;

import USTBatchNo3.junit5testcase.coin;
public class cointest {
	@Test
	public void cointest1() {
	int expected=3;
	
	
	
	LocalDate enddate = LocalDate.of(2023, 6, 20);
	
	
	int actual=coin.findcoin(enddate);
	assertEquals(expected, actual);
	}
}
