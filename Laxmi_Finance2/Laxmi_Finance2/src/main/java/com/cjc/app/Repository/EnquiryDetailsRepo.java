package com.cjc.app.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.model.Documentdetails;
import com.cjc.app.model.EnquiryDetails;

@Repository
public interface EnquiryDetailsRepo extends CrudRepository<EnquiryDetails, Integer> {
	
	List<EnquiryDetails>findIdByEnqpancardno(String enqpancardno);

	List<EnquiryDetails> findByStatus(String st);
	

	

}
