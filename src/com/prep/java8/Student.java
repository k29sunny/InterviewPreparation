package com.prep.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;


public class Student {
	
	public static void main(String [] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
		
		Map<Integer,String> student = new HashMap<Integer,String>();
		student.put(1, "ABCD");
		student.put(2, "EFGH");
		student.put(3, "IJKL");
		student.put(4, "ABCD");
		
		/*for(Entry<Integer, String> stu:student.entrySet()) {
			
			System.out.println("Key :"+stu.getKey()+"Value :"+stu.getValue());
			
		}*/
		
		
		//student.entrySet().stream().forEach(e ->  System.out.println(e.getKey()+" and "+e.getValue()));
		
		// student.entrySet().stream().filter(e -> e.getKey() > 2).forEach(e-> System.out.println(e.getKey()+" and "+ e.getValue()));
		
		//filteList.entrySet().stream().forEach(e-> System.out.println(e.getKey()+" and "+ e.getValue()));
		 
		 
		 Integer num = numbers.stream().filter(n-> n%2 !=0).mapToInt(Integer::intValue).sum();
		
		 System.out.println("Numbers "+num);
		
	}

}
