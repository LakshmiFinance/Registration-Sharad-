package com.cjc.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Guaranterdetails 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int guarantorId;
	private String guarantorName;
	
	private String guarantorDob;
	private String relationshipwithcustomer;
	private long guarantorMobileNo;
	public int getGuarantorId() {
		return guarantorId;
	}
	public void setGuarantorId(int guarantorId) {
		this.guarantorId = guarantorId;
	}
	public String getGuarantorName() {
		return guarantorName;
	}
	public void setGuarantorName(String guarantorName) {
		this.guarantorName = guarantorName;
	}
	public String getGuarantorDob() {
		return guarantorDob;
	}
	public void setGuarantorDob(String guarantorDob) {
		this.guarantorDob = guarantorDob;
	}
	public String getRelationshipwithcustomer() {
		return relationshipwithcustomer;
	}
	public void setRelationshipwithcustomer(String relationshipwithcustomer) {
		this.relationshipwithcustomer = relationshipwithcustomer;
	}
	public long getGuarantorMobileNo() {
		return guarantorMobileNo;
	}
	public void setGuarantorMobileNo(long guarantorMobileNo) {
		this.guarantorMobileNo = guarantorMobileNo;
	}

}
