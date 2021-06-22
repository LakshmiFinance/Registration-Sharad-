package com.cjc.app.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.cjc.app.master.Bank;

@Entity
public class Previousloandetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int previousloanId;
	private int previousLoanamount;
	private String previousLoanStatus;
	private int tenure;
	private int paidAmount;
	private int reaminingAmount;
	@OneToOne(cascade = CascadeType.ALL)
	private Bank bank;
	public int getPreviousloanId() {
		return previousloanId;
	}
	public void setPreviousloanId(int previousloanId) {
		this.previousloanId = previousloanId;
	}
	public double getPreviousLoanamount() {
		return previousLoanamount;
	}
	public void setPreviousLoanamount(int previousLoanamount) {
		this.previousLoanamount = previousLoanamount;
	}
	public String getPreviousLoanStatus() {
		return previousLoanStatus;
	}
	public void setPreviousLoanStatus(String previousLoanStatus) {
		this.previousLoanStatus = previousLoanStatus;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public int getPaidAmount() {
		return paidAmount;
	}
	public void setPaidAmount(int paidAmount) {
		this.paidAmount = paidAmount;
	}
	public int getReaminingAmount() {
		return reaminingAmount;
	}
	public void setReaminingAmount(int reaminingAmount) {
		this.reaminingAmount = reaminingAmount;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	
	
	
	
}
