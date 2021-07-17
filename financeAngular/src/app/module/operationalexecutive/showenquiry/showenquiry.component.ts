import { Score } from './../model/score';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { CommonserviceService } from '../../service/commonservice.service';
import { Enquiry } from '../model/enquiry.model';

@Component({
  selector: 'app-showenquiry',
  templateUrl: './showenquiry.component.html',
  styleUrls: ['./showenquiry.component.scss']
})
export class ShowenquiryComponent implements OnInit {

  constructor(private router : ActivatedRoute , private showservice : CommonserviceService) { }

  id : any;
  enquiry = new Enquiry();
  enquiryDetails : any = [];
  score:Score;
  ngOnInit() {
    this.router.params.subscribe(params => {
      console.log(params);
    this.id = params['enq_id'];
    console.log(this.id);
    this.showservice.getEnquiry(this.id).subscribe(rs => {
      this.enquiry = rs;
      console.log(this.enquiry);
    })

    })
  }

  updateEnquiry(){
    console.log(this.enquiry);
    this.showservice.updateEnquiry(this.enquiry).subscribe(rs => {
        this.enquiryDetails = rs;
        console.log(this.enquiryDetails);
    })
  }
  getCibil(pan:string){
    this.showservice.checkCibil(pan).subscribe(data=> {
      this.score=data;
      console.log(this.score);
    });
    
  }

}
