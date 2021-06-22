package com.cjc.app.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.app.Repository.DocRepository;
import com.cjc.app.Service.DocHomeService;
import com.cjc.app.model.Documentdetails;

@Service
public class DocHomeServiceImpl implements DocHomeService{

	@Autowired
	DocRepository dr;
	@Override
	public void savedata(Documentdetails d) {
		dr.save(d);
		
	}

	@Override
	public List<Documentdetails> getdata(int id) {
	List<Documentdetails> list= (List<Documentdetails>) dr.findAll();
	return list;
	}

	
	
}
