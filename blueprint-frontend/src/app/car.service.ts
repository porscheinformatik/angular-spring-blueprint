import {Injectable} from '@angular/core';
import {Http, Response} from '@angular/http';
import {Observable} from 'rxjs/Observable';
import 'rxjs/add/operator/map';

@Injectable()
export class CarService {

  constructor(private http: Http) {
  }

  getCars(): Observable<Car[]> {
    return this.http.get('/api/cars')
      .map(this.extractData);
  }

  private extractData(res: Response): Car[] {
    const body = res.json();
    return body._embedded.cars || [];
  }
}
