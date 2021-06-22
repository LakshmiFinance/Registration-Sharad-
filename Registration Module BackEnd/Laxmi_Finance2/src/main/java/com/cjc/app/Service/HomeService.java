package com.cjc.app.Service;

import java.util.List;

import com.cjc.app.master.Customer;
import com.cjc.app.model.EnquiryDetails;

public interface HomeService {

	

	public List<Customer> getdata(int customerId);



	public void savedata(Customer customer);

	

}
