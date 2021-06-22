package com.cjc.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.app.Service.HomeService;
import com.cjc.app.master.Customer;
import com.cjc.app.model.EnquiryDetails;





@RestController
@CrossOrigin("*")
public class HomeController {
	@Autowired
	  HomeService hs;
	
	@RequestMapping(value = "/set",method = RequestMethod.POST)
	private String setdata(@RequestBody Customer customer )
	{
		hs.savedata(customer);
		return "success";
	}
	
	@RequestMapping("/get/{customerId}")
	private List<Customer> getdata(@PathVariable("customerId")int customerId)
	{
		List<Customer> list=hs.getdata(customerId);
		return list;
	}
	 
}
