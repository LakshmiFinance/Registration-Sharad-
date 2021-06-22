package com.cjc.main.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.cjc.main.MasterModel.CustomerPersonalInfo;

@Entity
public class GuarantorDetails 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String address;
	private String relationship_with_customer;
	
	private long mobileno;
	private long aadharcardno;
	private String pancardno;
	private String job_details;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRelationship_with_customer() {
		return relationship_with_customer;
	}
	public void setRelationship_with_customer(String relationship_with_customer) {
		this.relationship_with_customer = relationship_with_customer;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public long getAadharcardno() {
		return aadharcardno;
	}
	public void setAadharcardno(long aadharcardno) {
		this.aadharcardno = aadharcardno;
	}
	public String getPancardno() {
		return pancardno;
	}
	public void setPancardno(String pancardno) {
		this.pancardno = pancardno;
	}
	public String getJob_details() {
		return job_details;
	}
	public void setJob_details(String job_details) {
		this.job_details = job_details;
	}


}
