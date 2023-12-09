import { Component } from '@angular/core';
import { Player } from '../../model/player';
import { PlayerService } from '../../services/player.service';

@Component({
  selector: 'app-getallbycountryname',
  templateUrl: './getallbycountryname.component.html',
  styleUrl: './getallbycountryname.component.css'
})
export class GetallbycountrynameComponent {
  countryName: string = '';
   playerList:Player[] = [];
 
  countries=[
  'India','Pakistan','Australia'
  ];

  constructor(private playerService:PlayerService){}

    selectCountry(country: string): void {
      console.log('Selected country:', country);
      this.countryName = country;
    }
    
  

getAll(){
  
    this.playerService.getAll().subscribe( 
                              (list)=>{ this.playerList = list;  console.log(list)}
                              
                                );   
}
getByCountryName() {
  
  this.playerService.getDataByCountryName(this.countryName).subscribe(
    (data) => {
    
      console.log(data);
  
      this.playerList = data;
    },
    (error) => {
      console.error(error);
      
    }
  );
}
  
}
