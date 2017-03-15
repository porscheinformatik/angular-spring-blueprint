import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BpCarListComponent } from './bp-car-list.component';

describe('BpCarListComponent', () => {
  let component: BpCarListComponent;
  let fixture: ComponentFixture<BpCarListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BpCarListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BpCarListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
