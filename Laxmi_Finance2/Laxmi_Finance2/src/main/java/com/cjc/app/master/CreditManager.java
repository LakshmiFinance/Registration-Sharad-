package com.cjc.app.master;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import javax.persistence.OneToOne;



@Entity
public class CreditManager
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cmId;
	private String cmName;
	private String userName;
	private String password;
	
	@OneToOne(cascade = CascadeType.ALL)
	private OperationalExecutive operationalExecutive;
	
	
	public int getCmId() {
		return cmId;
	}

	public void setCmId(int cmId) {
		this.cmId = cmId;
	}

	public String getCmName() {
		return cmName;
	}

	public void setCmName(String cmName) {
		this.cmName = cmName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public OperationalExecutive getOperationalExecutive() {
		return operationalExecutive;
	}

	public void setOperationalExecutive(OperationalExecutive operationalExecutive) {
		this.operationalExecutive = operationalExecutive;
	}

	
	
	
	
	


}
