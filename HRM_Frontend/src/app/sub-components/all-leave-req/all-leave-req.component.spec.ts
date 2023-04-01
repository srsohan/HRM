import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AllLeaveReqComponent } from './all-leave-req.component';

describe('AllLeaveReqComponent', () => {
  let component: AllLeaveReqComponent;
  let fixture: ComponentFixture<AllLeaveReqComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AllLeaveReqComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AllLeaveReqComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
