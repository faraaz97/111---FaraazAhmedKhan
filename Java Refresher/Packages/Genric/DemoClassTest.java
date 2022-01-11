package com.marticus.training.Genric;

public class DemoClassTest {
	public static void main(String[] args) {
		DemoClass<String> d1=new DemoClass<String>();
		d1.set("Faraaz");
		System.out.println("My name is "+d1.get());
		DemoClass2<String,Integer> d2=new DemoClass2<String, Integer>();
		d2.setU1("Mysore");
		System.out.println(d2.getU1());
		d2.setV1(20);
		System.out.println(d2.getV1());
		
	}

}
