import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

const httpOptions = {
  headers: new HttpHeaders(
    {
      'Content-Type': 'application/json', 
      'Access-Control-Allow-Origin':'*',
      'Cross-origin': 'cross-site'     
    }
  )
};

@Injectable({
  providedIn: 'root'
})
export class UsersAdminService {

  constructor(private http: HttpClient) { }

  getAdminUsers(): Observable<any> {
    return this.http.get('api-users/users');
  }

}