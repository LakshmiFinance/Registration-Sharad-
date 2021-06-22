package com.cjc.app.Service;

import java.util.List;

import com.cjc.app.model.EnquiryDetails;

public interface EnquiryService {
	
public List<EnquiryDetails> getEnquiry();
	
	public List<EnquiryDetails> getStatus(String status);
	
	public EnquiryDetails getEnquiry(int id);
	
	public List<EnquiryDetails> updateEnquiry(EnquiryDetails enquiry);

	public void save(EnquiryDetails enqdetails);

}
