
import { Enquiry } from './../operationalexecutive/model/enquiry.model';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Customer } from './model/customer';


@Injectable({
  providedIn: 'root'
})
export class ReService {

  customer:Customer = {

    customerId:null,
    customerName:"",
    customerMobileNo:"",
    customerLoanAmount:null,
    customerAge : "",
    customerdDateOfBirth: "",
    customerEmail: "",
    customerPancardNo:"",
    address:{
      addressId:null,
      loaclHouseNo:"",
      localArea:"",
      localLandmark:"",
      localCity:{
        cityId:null,
    cityname:"",
    citypincode:null,
    state:{
      stateId:null,
      stateName:"",
    }
      },
      permanantHouseNo:"",
      permanantArea:"",
      permanantLandmark:"",
      permanantcity:{
        cityId:null,
    cityname:"",
    citypincode:null,
    state:{
      stateId:null,
      stateName:"",
      
    }
      },
      country:{
        countryId:null,
        countryName:""
      }
    },
    vehical:{
      vehicalId:null,
      modelNo:"",
      dealer:"",
      price:"",
      onRoadPrice:""
    },
    bank:{
      bankId:null,
      bankName:"",
      accountNumber:null,
      accountHolderName:"",
      bankIfsc:"",
      bankMicr:"",
      bankAddress:""
    },
    guaranter:{
      guaranterId:null,
    guaranterNmae:"",
    guaranterAddress:"",
    guaranterRelationWithcustomer:"",
    guranterMobileNo:null,
    addharCardNo:null,
    jobdetails:""
    },
    loandetails:{
      previousloanId:null,
    previousLoanamount:null,
    previousLoanStatus:"",
    tenure:null,
    paidAmount:null,
    reaminingAmount:null,
    bank:{
      bankId:null,
      bankName:"",
      accountNumber:null,
      accountHolderName:"",
      bankIfsc:"",
      bankMicr:"",
      bankAddress:""
      
    }
    }
  }



   //enqInsert="http://localhost:8085/oe/addEnquiry";
   enqInsert="http://localhost:8085/addEnquiry";
  
   getEnq = "http://localhost:8085/getAll";
   //AddCustomerUrl="http://localhost:8085/re/set";
   AddCustomerUrl="http://localhost:8085/set";


  constructor(private http:HttpClient) { }

  addEnquiry(enquiry:Enquiry){
    return this.http.post(this.enqInsert,enquiry);
  }
  
 getAllEnquiry(){
  return this.http.get<Enquiry[]>(`${this.getEnq}`);
}
addCustomer(temp:Customer){
   return this.http.post(this.AddCustomerUrl,temp);
}
}
