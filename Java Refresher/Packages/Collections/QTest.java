package com.marticus.training.Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Queue <String> bnkCustomer=new LinkedList<>();
        bnkCustomer.add("cust1");
        bnkCustomer.add("cust2");
        bnkCustomer.add("cust3");
        bnkCustomer.add("cust4");
        bnkCustomer.remove();
        bnkCustomer.remove();
        bnkCustomer.poll();
        bnkCustomer.poll();
        
        if(!bnkCustomer.isEmpty())
		{
			System.out.println(bnkCustomer.remove());
		}
		
		Iterator<String> it = bnkCustomer.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
			
		}
	}
		


}
