 import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddUserComponent } from './add-user/add-user.component';
import { AddlistComponent } from './addlist/addlist.component';
import { ListComponent } from './list/list.component';
import { PasswordComponent } from './password/password.component';
import { UserComponent } from './user/user.component';

const routes: Routes = [
  {
    path:'user',
    component:UserComponent
  },
  {
    path:'list',
    component:ListComponent
  },
  {
    path:'password',
    component:PasswordComponent

},
{
  path:'addlist',
  component:AddlistComponent
},
{
  path:'addUser',
  component:AddUserComponent
}


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
