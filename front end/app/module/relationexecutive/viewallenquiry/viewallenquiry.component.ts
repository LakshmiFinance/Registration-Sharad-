import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Enquiry } from '../../operationalexecutive/model/enquiry.model';
import { CommonserviceService } from '../../service/commonservice.service';

@Component({
  selector: 'app-viewallenquiry',
  templateUrl: './viewallenquiry.component.html',
  styleUrls: ['./viewallenquiry.component.scss']
})
export class ViewallenquiryComponent implements OnInit {

  e : Enquiry[];
  constructor(private s : CommonserviceService , private router : Router) { }

  ngOnInit() {
    this.getEnquiry();
  }

  getEnquiry(){
    this.s.getAllEnquiry().subscribe(rs => {
      this.e = rs;
      console.log(this.e);
    })
  }

  approve(){
         
          this.router.navigate(['role/relationexcutive/customer'])
          
  }

}
