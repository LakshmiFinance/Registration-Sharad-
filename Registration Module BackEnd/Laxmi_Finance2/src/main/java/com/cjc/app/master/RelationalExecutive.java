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
public class RelationalExecutive {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int rid;
	private String rName;
	private String userName;
	private String password;
	
	@OneToOne(cascade = CascadeType.ALL)
	private OperationalExecutive operationalExecutive;
	@OneToOne(cascade = CascadeType.ALL,mappedBy ="res")
	private RelationalMasterFunctionalityModel rmfm;
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getrName() {
		return rName;
	}
	public void setrName(String rName) {
		this.rName = rName;
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
	public RelationalMasterFunctionalityModel getRmfm() {
		return rmfm;
	}
	public void setRmfm(RelationalMasterFunctionalityModel rmfm) {
		this.rmfm = rmfm;
	}

	
}
