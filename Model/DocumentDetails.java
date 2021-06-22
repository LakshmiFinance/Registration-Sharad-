package com.cjc.main.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

import com.cjc.main.MasterModel.CustomerPersonalInfo;

@Entity
public class DocumentDetails 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int documentId;
	
	@Lob
	private byte[] PanCard;
	@Lob
	private byte[] adharCard;
	@Lob
	private byte[] passportPhoto;
	@Lob
	private byte[] sign;
	@Lob
	private byte[] bankStatement;
	@Lob
	private byte[] salarySlip;
	@Lob
	private byte[] ItrFile;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="customer_Id")
	private CustomerPersonalInfo customerid;
	
	public CustomerPersonalInfo getCustomerid() {
		return customerid;
	}
	public void setCustomerid(CustomerPersonalInfo customerid) {
		this.customerid = customerid;
	}
	
	public int getDocumentId() {
		return documentId;
	}
	public void setDocumentId(int documentId) {
		this.documentId = documentId;
	}
	public byte[] getPanCard() {
		return PanCard;
	}
	public void setPanCard(byte[] panCard) {
		PanCard = panCard;
	}
	public byte[] getAdharCard() {
		return adharCard;
	}
	public void setAdharCard(byte[] adharCard) {
		this.adharCard = adharCard;
	}
	public byte[] getPassportPhoto() {
		return passportPhoto;
	}
	public void setPassportPhoto(byte[] passportPhoto) {
		this.passportPhoto = passportPhoto;
	}
	public byte[] getSign() {
		return sign;
	}
	public void setSign(byte[] sign) {
		this.sign = sign;
	}
	public byte[] getBankStatement() {
		return bankStatement;
	}
	public void setBankStatement(byte[] bankStatement) {
		this.bankStatement = bankStatement;
	}
	public byte[] getSalarySlip() {
		return salarySlip;
	}
	public void setSalarySlip(byte[] salarySlip) {
		this.salarySlip = salarySlip;
	}
	public byte[] getItrFile() {
		return ItrFile;
	}
	public void setItrFile(byte[] itrFile) {
		ItrFile = itrFile;
	}
	


}
