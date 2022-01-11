package com.marticus.training.Collections;

import java.util.ArrayList;

public class HospitalTest {
	public static void main(String[] args) {
		//Hospital hp=new Hospital();
		ArrayList<Doctors> docs = new ArrayList<>();
		Doctors d1=new Doctors();
		d1.setDoctorId("111");
		d1.setDoctorName("Faraaz");
		Doctors d2=new Doctors();
		d2.setDoctorId("121");
		d2.setDoctorId("Farman");
		Doctors d3=new Doctors();
		d3.setDoctorId("131");
		d3.setDoctorName("Sadiq");
		
		docs.add(d1);
		docs.add(d2);
		docs.add(d3);
		for(Doctors dc:docs) {
		System.out.println("Doctors: "+dc);
		}
		
		ArrayList<Patients> pts = new ArrayList<>();
		Patients p1=new Patients();
		p1.setPatientName("raju");
		p1.setPatientId("101");
		p1.setPatientAddress("abc");
		Patients p2=new Patients();
		p2.setPatientName("ravi");
		p2.setPatientId("102");
		p2.setPatientAddress("def");
		Patients p3=new Patients();
		p3.setPatientName("teja");
		p3.setPatientId("103");
		p3.setPatientAddress("xyz");
		
		pts.add(p1);
		pts.add(p2);
		pts.add(p3);
		for(Patients pt:pts) {
			System.out.println("Patients: "+pt);
		}
		Iterator<Doctors>=
		
	}

}
