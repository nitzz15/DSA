package com.Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		HashSet<Integer> set = new HashSet<>();
		
		set.add(12);
		set.add(54);
		set.add(12);
		set.add(55);
		System.out.println(set+" "+set.size());
		Iterator it = set.iterator();
		while(it.hasNext())
		System.out.println(it.next());
	   System.out.println(set.contains(12));
	   set.remove(12);
	   System.out.println(set.contains(12));
	}

}
