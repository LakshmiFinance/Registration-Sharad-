import { FormsModule } from '@angular/forms';
import { Routes, RouterModule } from '@angular/router';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { LoginComponent } from './login/login.component';
import { EnquiryComponent } from './enquiry/enquiry.component';
import { CustomerDetailsComponent } from './customer-details/customer-details.component';
import { CustomerDocumentsComponent } from './customer-documents/customer-documents.component';

import { ViewenquiryComponent } from '../operationalexecutive/viewenquiry/viewenquiry.component';
import { ViewallenquiryComponent } from './viewallenquiry/viewallenquiry.component';
const rerouting: Routes = [
  {path: 'relogin', component: LoginComponent},
  {path:'view', component: ViewallenquiryComponent},
  {path:'new', component: EnquiryComponent},
  {path:'customer', component:CustomerDetailsComponent},
  {path:'docs/:id', component:CustomerDocumentsComponent},
];

@NgModule({
  declarations: [LoginComponent, EnquiryComponent, CustomerDetailsComponent, CustomerDocumentsComponent,ViewenquiryComponent, ViewallenquiryComponent],
  imports: [
    CommonModule,RouterModule.forChild(rerouting),FormsModule
  ]
})
export class RelationexecutiveModule { }
