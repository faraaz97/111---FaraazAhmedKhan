package com.marticus.training.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListI {
	public static void main(String[] args) {
	ArrayList<Integer> integers=new ArrayList<Integer>();
	integers.add(10);
	integers.add(20);
	integers.add(30);
	integers.add(40);
	for(Integer hero:integers) {
		System.out.println("ArrayList = "+hero);
	}
	integers.remove(3);
	System.out.println("-----------------");
	
	Iterator<Integer> it=integers.iterator();
	
	while(it.hasNext())
	{
		System.out.println("Next element is -- "+ it.next());
	}

}
}
