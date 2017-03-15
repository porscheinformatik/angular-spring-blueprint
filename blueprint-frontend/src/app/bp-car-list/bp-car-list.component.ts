import {Component, OnInit, Injectable} from '@angular/core';
import { MdlDefaultTableModel } from '@angular-mdl/core';
import {CarService} from '../car.service';

@Component({
  selector: 'app-bp-car-list',
  templateUrl: './bp-car-list.component.html',
  styleUrls: ['./bp-car-list.component.css']
})
@Injectable()
export class BpCarListComponent implements OnInit {

  public tableModel = new MdlDefaultTableModel([
    { key: 'vin', name: 'VIN', sortable: false },
    { key: 'km', name: 'Mileage (km)', sortable: true },
    { key: 'initalRegistrationDate', name: 'Initial Registration', sortable: true }
  ]);

  constructor(private carService: CarService) { }

  ngOnInit() {
    this.carService.getCars().subscribe(cars => {
      this.tableModel.addAll(cars);
    });
  }

}
