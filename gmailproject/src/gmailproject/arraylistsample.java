package gmailproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class arraylistsample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al= new ArrayList<Integer>();
		al.add(5);
		al.add(9);
		al.add(20);
		al.add(4);
		
		Iterator<Integer> il=al.iterator();
		while(il.hasNext())
		{
			System.out.println(il.next());
		}
		
		System.out.println(al);
		Collections.sort(al);
		System.out.println("highest Sorting" +al.get(al.size()-1));
		System.out.println("After Sorting");
		for (int i=0; i < al.size(); i++)
		{
			System.out.println(al.get(i));
		}
	
	}

}
