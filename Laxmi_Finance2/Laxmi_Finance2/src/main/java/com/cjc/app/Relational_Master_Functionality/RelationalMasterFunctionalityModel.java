package com.cjc.app.Relational_Master_Functionality;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.cjc.app.master.AccountHandler;
import com.cjc.app.master.CreditManager;
import com.cjc.app.master.OperationalExecutive;
import com.cjc.app.master.RelationalExecutive;

@Entity
public class RelationalMasterFunctionalityModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@OneToOne
	private RelationalExecutive res;
	@OneToOne
	private OperationalExecutive oe;
	@OneToOne
	private CreditManager cm;
	@OneToOne
	private AccountHandler ah;
	


}
