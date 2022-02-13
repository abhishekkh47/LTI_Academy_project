import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ItemUpdateComponent } from './components/item-update/item-update.component';
import { ItemsAddComponent } from './components/items-add/items-add.component';
import { ItemsListComponent } from './components/items-list/items-list.component';
import { LoginComponent } from './components/login/login.component';
import { RegistrationComponent } from './components/registration/registration.component';
import { UserloggedinComponent } from './components/userloggedin/userloggedin.component';

const routes: Routes = [
  {path:'',component:LoginComponent},
  {path:'userloggedin',component:UserloggedinComponent},
  {path:'registeruser',component:RegistrationComponent},
  {path:'login',component:LoginComponent},
  {path:'item-list',component:ItemsListComponent},
  {path:'item-add',component:ItemsAddComponent},
  {path:'item-update',component:ItemUpdateComponent},
  // {path:'items',component:}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
