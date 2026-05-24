package org.mock;

import java.util.Hashtable;
import java.util.Map;

public class MapConcept {

	public static void main(String[] args) {
		
		Map<Integer,String> m = new Hashtable<>(); // Hashtable Both Key & value will not allow any null(All map types will not allow duplicates)
												   // Hashtable follow Random order
		m.put(10, "Java");
		m.put(20, "Junit");
		m.put(30, "Selenium");
		m.put(40, "Testing");
		m.put(20, "python");
		m.put(50, "Selenium");
		m.put(60,"Cucumber");
		
		System.out.println(m);
	
}
}