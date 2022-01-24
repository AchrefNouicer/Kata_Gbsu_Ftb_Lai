import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Result} from './model/result';

@Injectable({
  providedIn: 'root'
})
export class GbsuFtbLaiService {
  constructor(private http: HttpClient) {
  }

  convertNumber(inputNumber: number): Observable<Result> {
    return this.http.get<Result>(`http://localhost:8080/gbsu-ftb-lai/${inputNumber}`);
  }
}
