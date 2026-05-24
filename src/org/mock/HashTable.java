package org.mock;

import java.util.Hashtable;
import java.util.Map;

public class HashTable {
	public static void main(String[] args) {
		Map<Integer,String> m = new Hashtable<>();
		
		m.put(30, "Java");
		m.put(90,"Selenium");
		m.put(10, "Null");
		m.put(60, "python");
		m.put(80, "Null");
		m.put(30,"Cucumber");
		m.put(20, "Junit");
		
		System.out.println(m);
	}
 
	
	
}
