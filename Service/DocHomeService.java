package com.cjc.app.Service;

import java.util.List;

import com.cjc.app.model.Documentdetails;

public interface DocHomeService {

	

	void savedata(Documentdetails d);

	

	List<Documentdetails> getdata(int id);

}
