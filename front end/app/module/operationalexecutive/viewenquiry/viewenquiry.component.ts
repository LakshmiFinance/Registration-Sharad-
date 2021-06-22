import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Params, Router } from '@angular/router';
import { CommonserviceService } from '../../service/commonservice.service';
import { Enquiry } from '../model/enquiry.model';

@Component({
  selector: 'app-viewenquiry',
  templateUrl: './viewenquiry.component.html',
  styleUrls: ['./viewenquiry.component.scss']
})
export class ViewenquiryComponent implements OnInit {

  e : Enquiry[];
  
  constructor(private insertEnquiry : CommonserviceService , private router : Router, private activate : ActivatedRoute) { }

  id : any;
  result : any;
  status = false;
  ngOnInit() {
   
   
    this.getEnquiry();
  }

  getEnquiry(){
    this.insertEnquiry.getAllEnquiry().subscribe(rs => {
      this.e = rs;
      console.log(this.e);
    })
  }

  

}
