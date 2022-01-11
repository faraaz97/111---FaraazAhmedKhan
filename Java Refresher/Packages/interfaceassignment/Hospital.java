package com.marticus.training.interfaceassignment;

public class Hospital implements Admission {
	
	patient[] pt;
	doctor[] dr;
	String name;

	public void setName(String name) {
		this.name = name;
	}
	public hospital() {
		dr= new Doctor[10];
		pt= new Patient[100];
	}
	public Doctor[] getDr() {
		return dr;
	}
	public void setDr(Doctor[] dr) {
		this.dr = dr;
	}
	public Patient[] getPt() {
		return pt;
	}
	public void setPt(Patient[] pt) {
		this.pt = pt;
	}
	
	public void  addDoctor(Doctor d, int i)
	{
		dr[i]=d;
		
	}
	
	public void  addPatient(Patient p, int i)
	{
		pt[i]=p;
		
	}


	@Override
	public String register(String patient) {
		// TODO Auto-generated method stub
		return patient;
	}
	

	@Override
	public int bedAllocation(int allocate) {
		// TODO Auto-generated method stub
		return allocate;
	}

	@Override
	public String doctorAssigned(String doctor) {
		// TODO Auto-generated method stub
		return doctor;
	}

}
