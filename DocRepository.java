package com.cjc.app.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.model.Documentdetails;

@Repository
public interface DocRepository extends CrudRepository<Documentdetails, Integer> {

}
