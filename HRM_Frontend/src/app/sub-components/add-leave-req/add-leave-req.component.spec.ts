import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddLeaveReqComponent } from './add-leave-req.component';

describe('AddLeaveReqComponent', () => {
  let component: AddLeaveReqComponent;
  let fixture: ComponentFixture<AddLeaveReqComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddLeaveReqComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AddLeaveReqComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
