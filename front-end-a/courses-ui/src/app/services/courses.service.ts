import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';


import { Course } from '../interfaces/interfaces';

@Injectable({
  providedIn: 'root'
})
export class CoursesService {

  public courses: Course[] = [];

  constructor(private httpClient: HttpClient) { }

  public getCourses(filter: string): void {
    this.httpClient.get<Course[]>("http://localhost:8080/api/course/all")
      .subscribe((courses)=> {
        this.courses = [...courses];
        console.log('running..');
      });
  }

}
