package USTBatchNo3.junit5testcase;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class garment {
	public static void main(String[] args) {
	Textile item1=new Textile("shirt",400,40000);
	Textile item2=new Textile("pant",600,180000);
	Textile item3=new Textile("hoodie",200,120000);
	
	Textile item11=new Textile("shirt",300,30000);
	Textile item22=new Textile("pant",400,170000);
	Textile item33=new Textile("hoodie",600,1260000);
	
	Textile item111=new Textile("shirt",500,70000);
	Textile item222=new Textile("pant",700,150000);
	Textile item333=new Textile("hoodie",900,1820000);
	
	List<Textile> l1=Arrays.asList(item1,item2,item3);
	List<Textile> l2=Arrays.asList(item11,item22,item33);
	List<Textile> l3=Arrays.asList(item111,item222,item333);
	Map<LocalDate,List<Textile>> m=new HashMap<>();
	LocalDate d1=LocalDate.of(2020, 7, 8);
	LocalDate d2=LocalDate.of(2020, 7, 9);
	LocalDate d3=LocalDate.of(2020, 7, 10);
	m.put(d1, l1);
	m.put(d2, l2);
	m.put(d3, l3);
	
	LocalDate d11=LocalDate.of(2020, 7, 8);
	if(d11.equals(d11)) {
		System.out.println(m.get(d1));
		
	}
	
	
	
}}
