import { Injectable } from '@angular/core';
import { Player } from '../model/player';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PlayerService {

  constructor(private http:HttpClient) { }


  baseURL:string = 'http://localhost:8383/api/player/';

  getAll():Observable<Player[]>{

      return this.http.get<Player[]>(this.baseURL+"getall");


  }
  getDataByCountryName(countryName: string): Observable<any[]> {
    return this.http.get<any[]>(this.baseURL+`getbycountryname/${countryName}`);
  }
  
  insert(body: Player): Observable<Player> {
    console.log(body);
    return this.http.post<Player>(this.baseURL + 'add', body);
  }
}
