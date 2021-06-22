package com.cjc.app.master;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.cjc.app.Relational_Master_Functionality.RelationalMasterFunctionalityModel;

@Entity
public class OperationalExecutive
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int oEid;
	private String oEName;
	private String userName;
	private String password;
	
	@OneToOne(cascade = CascadeType.ALL)
	private RelationalExecutive relationalExecutive;
	
	@OneToOne(cascade = CascadeType.ALL)
	private AccountHandler accountHandler;
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "res")
	private RelationalMasterFunctionalityModel rmfm;
	public int getoEid() {
		return oEid;
	}
	public void setoEid(int oEid) {
		this.oEid = oEid;
	}
	public String getoEName() {
		return oEName;
	}
	public void setoEName(String oEName) {
		this.oEName = oEName;
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
	public RelationalExecutive getRelationalExecutive() {
		return relationalExecutive;
	}
	public void setRelationalExecutive(RelationalExecutive relationalExecutive) {
		this.relationalExecutive = relationalExecutive;
	}
	public AccountHandler getAccountHandler() {
		return accountHandler;
	}
	public void setAccountHandler(AccountHandler accountHandler) {
		this.accountHandler = accountHandler;
	}
	public RelationalMasterFunctionalityModel getRmfm() {
		return rmfm;
	}
	public void setRmfm(RelationalMasterFunctionalityModel rmfm) {
		this.rmfm = rmfm;
	}

	

	
}