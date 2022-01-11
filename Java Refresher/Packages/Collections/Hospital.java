package com.marticus.training.Collections;

import java.util.ArrayList;


public class Hospital {
	ArrayList<Doctors> docs;
	ArrayList<Patients> pts;
	public ArrayList<Doctors> getDocs() {
		return docs;
	}
	public void setDocs(ArrayList<Doctors> docs) {
		this.docs = docs;
	}
	public ArrayList<Patients> getPts() {
		return pts;
	}
	public void setPts(ArrayList<Patients> pts) {
		this.pts = pts;
	}

}
