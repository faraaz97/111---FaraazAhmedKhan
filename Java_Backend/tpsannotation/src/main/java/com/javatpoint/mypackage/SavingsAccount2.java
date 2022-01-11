package com.javatpoint.mypackage;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
//@Table(name="savingsaccount2")
@PrimaryKeyJoinColumn(name="ID") 

public class SavingsAccount2 extends Account2 {
	
	@Column(name="Interest")
	private double Interest;

	public double getInterest() {
		return Interest;
	}

	public void setInterest(double interest) {
		Interest = interest;
	}

}
