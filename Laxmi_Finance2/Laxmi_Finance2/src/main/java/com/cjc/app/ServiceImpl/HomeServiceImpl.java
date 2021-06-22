package com.cjc.app.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.app.Repository.HomeRepository;
import com.cjc.app.Service.HomeService;
import com.cjc.app.master.Customer;
import com.cjc.app.model.EnquiryDetails;


@Service
public class HomeServiceImpl implements HomeService {
	@Autowired
   HomeRepository hr;

	@Override
	public List<Customer> getdata(int customerId) {
		
List< Customer> list=hr.findByCustomerId(customerId);
		
		return  list;
	}

	@Override
	public void savedata(Customer customer) {
		hr.save(customer);
		
	}


}
