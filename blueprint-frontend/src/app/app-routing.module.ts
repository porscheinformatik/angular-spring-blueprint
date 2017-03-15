import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {BpCarListComponent} from './bp-car-list/bp-car-list.component';
import {BpHomeComponent} from './bp-home/bp-home.component';

const routes: Routes = [
  {
    path: '',
    component: BpHomeComponent
  },
  {
    path: 'car-list',
    component: BpCarListComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
  providers: []
})
export class AppRoutingModule { }
