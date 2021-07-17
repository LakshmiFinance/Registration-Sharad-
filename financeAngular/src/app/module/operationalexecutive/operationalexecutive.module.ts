import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { ViewenquiryComponent } from './viewenquiry/viewenquiry.component';
import { NewenquiryComponent } from './newenquiry/newenquiry.component';
import { ShowenquiryComponent } from './showenquiry/showenquiry.component';
import { FormsModule } from '@angular/forms';
const oerouting: Routes = [
  {path: 'oelogin', component: LoginComponent},
  {path: 'view', component: ViewenquiryComponent},
  {path: 'new', component: NewenquiryComponent},
  {path:'show/:enq_id' , component:ShowenquiryComponent}
  

];
@NgModule({
  declarations: [LoginComponent, ViewenquiryComponent, NewenquiryComponent, ShowenquiryComponent],
  imports: [
    CommonModule,RouterModule.forChild(oerouting),FormsModule
  ]
})
export class OperationalexecutiveModule { }
