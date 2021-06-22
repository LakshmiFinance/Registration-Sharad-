import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CommonserviceService } from '../../service/commonservice.service';
import { Enquiry } from '../model/enquiry.model';

@Component({
  selector: 'app-newenquiry',
  templateUrl: './newenquiry.component.html',
  styleUrls: ['./newenquiry.component.scss']
})
export class NewenquiryComponent implements OnInit {

  e : any = [];
  status = '';
  constructor(private statusservice : CommonserviceService , private routes : Router) { }

  ngOnInit() {
    this.getEnquiryStatus();
  }

  getEnquiryStatus(){
    this.statusservice.getStatus(this.status).subscribe(rs => {
      this.e = rs;
      console.log(this.e);
    })
  }

  verifyEnquiry(enq_id){
    console.log('from tables : '+enq_id);
      this.routes.navigate(['role/operationalexecutive/show',enq_id]);
  }

}
