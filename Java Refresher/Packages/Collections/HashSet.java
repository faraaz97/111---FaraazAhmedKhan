package com.marticus.training.Collections;

import java.util.HashMap;
import java.util.Iterator;

public class HashSet {
	public static void main(String[] args) {
		HashMap<Integer, String> student = new HashMap<>();
		student.put(101,"Faraaz");
		student.put(102,"Sadiq");
		student.put(103,"Farman");
		student.put(104,"Uvaiz");
		String st=student.get(102);
		System.out.println(st);
		
		if(student.isEmpty()) {
			System.out.println("No student present");
		}
		else {
			System.out.println("Student is present");
		}
		Iterator<String> it = student.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
