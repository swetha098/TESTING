package USTBatchNo3.junit5testcase;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class coin {
	public static int findcoin(LocalDate date) {
		int coins = 0;
		long days;
	LocalDate startdate=LocalDate.of(2023, 1, 1);
	days= ChronoUnit.DAYS.between(startdate,date);
	if(days<=80) 
		coins=5;
	else if(days>80 && days<172)
	coins=3;
	else if(coins>172)
		coins=0;
	return coins;}
	
public static void main(String[] args) {
	
	
	LocalDate enddate = LocalDate.of(2023, 6, 20);
	
	int gold=findcoin(enddate);
	System.out.println(gold);
	}
	
}
