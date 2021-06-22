package com.cjc.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.app.Repository.EnquiryDetailsRepo;
import com.cjc.app.Service.EnquiryService;
import com.cjc.app.model.EnquiryDetails;

@RestController
@CrossOrigin("*")
public class EnquiryController {
	
	@Autowired
	 EnquiryService s;
	

	
	@PostMapping("/addEnquiry")
	public String m1(@RequestBody EnquiryDetails enqdetails)
	{	
		s.save(enqdetails);
		System.out.println(enqdetails);
		return "Enquiry Inserted";
		
	}
	
	@GetMapping("/getAll")
	public List<EnquiryDetails> m3()
	{
		List<EnquiryDetails> req = s.getEnquiry();
		
		return req;
		
	}
	
	@GetMapping("/getStatus/{status}")
	public List<EnquiryDetails> m4(@PathVariable("status") String status){
		List<EnquiryDetails> enq = s.getStatus(status);
		
		return enq;
	}
	
	@GetMapping("/getEnquiry/{enq_id}")
	public EnquiryDetails m5(@PathVariable("enq_id")int id) {
		EnquiryDetails en = s.getEnquiry(id);
		
		return en;
	}
	
	@PutMapping("/updateEnquiry")
	public List<EnquiryDetails> enquiryUpadte(@RequestBody EnquiryDetails details){
		
		List<EnquiryDetails> enquiry = s.updateEnquiry(details);
		
		return enquiry;
	}

}
