package com.cjc.app.master;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;

import com.cjc.app.model.Documentdetails;
import com.cjc.app.model.Guaranterdetails;
import com.cjc.app.model.Previousloandetails;


@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId;
	private String customerName;
	private String customerMobileNo;
	private int customerLoanAmount;
	private int customerAge;
	private String customerdDateOfBirth;
	private String customerEmail;
	private String customerPancardNo;
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	@OneToOne(cascade = CascadeType.ALL)
	private Vehicledetails vehical;
	@OneToOne(cascade = CascadeType.ALL)
	private Bank bank;
	@OneToOne(cascade = CascadeType.ALL)
	private Guaranterdetails guaranter;
	@OneToOne(cascade = CascadeType.ALL)
	private Previousloandetails loandetails;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerMobileNo() {
		return customerMobileNo;
	}
	public void setCustomerMobileNo(String customerMobileNo) {
		this.customerMobileNo = customerMobileNo;
	}
	public int getCustomerLoanAmount() {
		return customerLoanAmount;
	}
	public void setCustomerLoanAmount(int customerLoanAmount) {
		this.customerLoanAmount = customerLoanAmount;
	}
	public int getCustomerAge() {
		return customerAge;
	}
	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}
	public String getCustomerdDateOfBirth() {
		return customerdDateOfBirth;
	}
	public void setCustomerdDateOfBirth(String customerdDateOfBirth) {
		this.customerdDateOfBirth = customerdDateOfBirth;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getCustomerPancardNo() {
		return customerPancardNo;
	}
	public void setCustomerPancardNo(String customerPancardNo) {
		this.customerPancardNo = customerPancardNo;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Vehicledetails getVehical() {
		return vehical;
	}
	public void setVehical(Vehicledetails vehical) {
		this.vehical = vehical;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	public Guaranterdetails getGuaranter() {
		return guaranter;
	}
	public void setGuaranter(Guaranterdetails guaranter) {
		this.guaranter = guaranter;
	}
	public Previousloandetails getLoandetails() {
		return loandetails;
	}
	public void setLoandetails(Previousloandetails loandetails) {
		this.loandetails = loandetails;
	}
	
	

	
	
	
	
	
	
	
	
	
}
