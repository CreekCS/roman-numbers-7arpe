//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Karen A.

import java.util.*;

public class Romans
{
	private Map<String, Integer> m;
	
	public Romans()
	{
		m = new TreeMap<String, Integer>();
		
		m.put("I", 1);
		m.put("V", 5);
		m.put("X", 10);
		m.put("L", 50);
		m.put("C", 100);
		m.put("D", 500);
		m.put("M", 1000);				
	}
	
	public int getNumber( String s )
	{
		return m.get(s);
	}

}
