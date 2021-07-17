import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Documnets } from '../relationexecutive/model/documents';

@Injectable({
  providedIn: 'root'
})
export class DocsService {

 // url="http://localhost:8083/docs/docset";
 url="http://localhost:8085/docset";
 

  constructor(private http:HttpClient) { }

  docs:Documnets={
    
    documentid:null,
    customerid:null,
    pancard:'',
    addharcard:'',
    photo:'',
    signature:'',
    postdatedcheck:'',
    thumb:'',
    bankstatement:'',
    itrfile:'',
    salaryslip:'',
    previousloanstatement:''
  }

  uploadDocs(documentupload:any){
  return this.http.post(this.url,documentupload);
  }
  
}
