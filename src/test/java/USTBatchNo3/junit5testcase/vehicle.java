package USTBatchNo3.junit5testcase;

import java.util.Arrays;

import java.util.List;

import java.util.Scanner;

public class vehicle {
	public static void main(String[] args) {
		
		System.out.println("enter");
		Scanner sc=new Scanner(System.in);
		
		String veh="KL07";
		List<String>newl=vehi(veh);
		System.out.println(newl);
	}
	public static List<String> vehi(String v) {
//		String str="KL";
		//String str2="TN";
//		String stletter=v.substring(0, 2);
		String distnum=v.substring(2, 4);
		
		List<String>keraladist=Arrays.asList("01-tvm","03-pta","05-ernklm");
		
			
			List<String> dist=keraladist.stream().filter(k->k.startsWith(distnum)).toList();
//			dist.add(str);
			return dist;
		
		
		}
	}
	
		
	

