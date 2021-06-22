package com.cjc.app.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.app.Repository.EnquiryDetailsRepo;
import com.cjc.app.Service.EnquiryService;
import com.cjc.app.model.Documentdetails;
import com.cjc.app.model.EnquiryDetails;


@Service
public class EnquiryServiceImpl implements EnquiryService {
	

	@Autowired
	EnquiryDetailsRepo er;

	
	

	@Override
	public List<EnquiryDetails> getStatus(String status) {
		List<EnquiryDetails> list = null;
		status = "pending";
		if(status.equalsIgnoreCase("Pending")) {
			list = er.findByStatus(status);
			
			System.out.println(list);
		}
		return list;
	}

	@Override
	public EnquiryDetails getEnquiry(int id) {
		
		EnquiryDetails en = er.findById(id).get();
		return en;
	}

	@Override
	public List<EnquiryDetails> updateEnquiry(EnquiryDetails enquiry) {
		
		return (List<EnquiryDetails>) er.save(enquiry);
		
			
	


	}

	@Override
	public void save(EnquiryDetails enqdetails) {
		er.save(enqdetails);
		
	}

	@Override
	public List<EnquiryDetails> getEnquiry() {
		
		  return (List<EnquiryDetails>) er.findAll();
	}
	

}
