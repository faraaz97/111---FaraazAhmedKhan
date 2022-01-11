package com.marticus.training.interfaceassignment;

public class HospitalTest {
	public static void main(String[] args) {
		Doctor d1=new Doctor("Latha","Surgeon");
		Hospital ad=new Hospital();
		System.out.println(ad.register("abc"));
		System.out.println(ad.bedAllocation(101));
		System.out.println(ad.doctorAssigned("xyz"));
	}

}
