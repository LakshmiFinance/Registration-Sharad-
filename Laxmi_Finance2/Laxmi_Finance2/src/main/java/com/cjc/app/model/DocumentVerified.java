package com.cjc.app.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class DocumentVerified 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int docVerId;
	private Boolean verifyDoc;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Documentdetails documentDetails;

	public int getDocVerId() {
		return docVerId;
	}

	public void setDocVerId(int docVerId) {
		this.docVerId = docVerId;
	}

	public Boolean getVerifyDoc() {
		return verifyDoc;
	}

	public void setVerifyDoc(Boolean verifyDoc) {
		this.verifyDoc = verifyDoc;
	}

	public Documentdetails getDocumentDetails() {
		return documentDetails;
	}

	public void setDocumentDetails(Documentdetails documentDetails) {
		this.documentDetails = documentDetails;
	}

	
	
}