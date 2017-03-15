import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { MdlModule, MdlLayoutModule} from '@angular-mdl/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BpCarListComponent } from './bp-car-list/bp-car-list.component';
import { BpHomeComponent } from './bp-home/bp-home.component';
import {CarService} from './car.service';

@NgModule({
  declarations: [
    AppComponent,
    BpCarListComponent,
    BpHomeComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    AppRoutingModule,
    MdlModule,
    MdlLayoutModule
  ],
  providers: [CarService],
  bootstrap: [AppComponent]
})
export class AppModule { }
