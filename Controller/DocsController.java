package com.cjc.app.Controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cjc.app.Service.DocHomeService;
import com.cjc.app.model.Documentdetails;

@RestController
@CrossOrigin("*")
public class DocsController {
	@Autowired
	DocHomeService dhs;
	
	 @RequestMapping(value ="/docset",method = RequestMethod.POST,consumes =
			  MediaType.MULTIPART_FORM_DATA_VALUE) 
	 
	
	 public String  documentupload( @RequestPart(required = true,value = "photo")MultipartFile
			  photo,
			  
			
			  
			  @RequestPart(required = true,value = "thumb")MultipartFile thumb,
			  
			  @RequestPart(required = true,value = "addharcard")MultipartFile addharcard,
			  
			  @RequestPart(required = true,value = "pancard")MultipartFile pancard,
			  
			  @RequestPart(required = true,value = "signature")MultipartFile signature,
			  
			  @RequestPart(required = true,value = "postdatedcheck")MultipartFile
			  postdatedcheck,
			  
			  @RequestPart(required = true,value = "bankstatement")MultipartFile
			  bankstatement,
			  
			  @RequestPart(required = true,value = "itrfile")MultipartFile itrfile,
			  
			  @RequestPart(required = true,value = "salaryslip")MultipartFile salaryslip,
			  
			  @RequestPart(required = true,value = "previousloanstatement")MultipartFile
			  previousloanstatement) throws IOException{ 
			  
			
			  
			 // @RequestPart("doc") String doc) throws IOException {
		  Documentdetails d=new Documentdetails();
		  d.setAddharcard(addharcard.getBytes());
	  d.setBankstatement(bankstatement.getBytes());
	  d.setItrfile(itrfile.getBytes());
	  d.setPancard(pancard.getBytes());
	  d.setPhoto(photo.getBytes()); 
	  d.setPostdatedcheck(postdatedcheck.getBytes());
	  d.setPreviousloanstatement(previousloanstatement.getBytes());
	  d.setSalaryslip(salaryslip.getBytes());
	  d.setSignature(signature.getBytes());
	  d.setThumb(thumb.getBytes());
			  
			  
			  dhs.savedata(d);
			 
			  
			 
			  
			  return "success"; 
			  }
			  
			  @RequestMapping(value = "/docget/{id}",method = RequestMethod.GET) public
			  List<Documentdetails> getdocumentdetails(@PathVariable("id")int id) {
			  List<Documentdetails> list=dhs.getdata(id); return list; }
			 }



