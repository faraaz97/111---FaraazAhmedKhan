package com.marticus.training.Collections;

import java.util.Iterator;
import java.util.Stack;

public class StackEx {
	public static void main(String[] args) {
		Stack<String> books = new Stack<>(); //LIFO
		 
		 books.push("Physics");
		 books.push("Chemistry");
		 books.push("Maths");
		 
		System.out.println(books.peek());
		 
		 books.pop();
	     //System.out.println(books.peek());
		 books.push("Life Science");
		//System.out.println(books.peek());

	
	Iterator<String> it= books.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
}
}
