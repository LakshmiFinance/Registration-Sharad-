package com.cjc.main.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class DocumentVerified 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int docVerId;
	 private boolean verifyDoc;
	@OneToOne(cascade = CascadeType.ALL)
	private DocumentDetails  documentDetails;
	public int getDocVerId() {
		return docVerId;
	}
	public void setDocVerId(int docVerId) {
		this.docVerId = docVerId;
	}
	public boolean isVerifyDoc() {
		return verifyDoc;
	}
	public void setVerifyDoc(boolean verifyDoc) {
		this.verifyDoc = verifyDoc;
	}
	public DocumentDetails getDocumentDetails() {
		return documentDetails;
	}
	public void setDocumentDetails(DocumentDetails documentDetails) {
		this.documentDetails = documentDetails;
	}


}
