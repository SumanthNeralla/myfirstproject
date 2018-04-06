package gmailproject;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Sortmapbyvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hm= new HashMap<Integer, String>();
		hm.put(1, "Sumanth");
		hm.put(2, "Suryakala");
		hm.put(3, "Nishchith");
		hm.put(4,"Akshith");
		
		System.out.println(hm);
		System.out.println(Arrays.asList(hm));
		
		
		Set<Map.Entry<Integer, String>> s=hm.entrySet();
		for (Map.Entry<Integer,String> mp:s)
		{
			System.out.print(mp.getKey());
			System.out.println(mp.getValue());
			
		}
		
	
	}
	
		
	}

