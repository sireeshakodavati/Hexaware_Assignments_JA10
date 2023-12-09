import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GetallbycountrynameComponent } from './getallbycountryname.component';

describe('GetallbycountrynameComponent', () => {
  let component: GetallbycountrynameComponent;
  let fixture: ComponentFixture<GetallbycountrynameComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [GetallbycountrynameComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(GetallbycountrynameComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
