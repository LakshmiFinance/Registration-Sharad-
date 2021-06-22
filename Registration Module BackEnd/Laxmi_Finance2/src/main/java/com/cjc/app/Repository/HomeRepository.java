package com.cjc.app.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.master.Customer;
import com.cjc.app.model.EnquiryDetails;





@Repository
public interface HomeRepository extends CrudRepository<Customer, Integer> {

	

	List<Customer> findByCustomerId(int customerId);
	

}
