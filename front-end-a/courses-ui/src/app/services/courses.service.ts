import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';


import { Course,Student } from '../interfaces/interfaces';

@Injectable({
  providedIn: 'root'
})
export class CoursesService {

  public courses: Course[] = [];

  public students: Student[] = [];

  constructor(private httpClient: HttpClient) { }

  public getCourses(filter: string): void {

    this.courses = [
      {
        id: 1,
        name: "Philosopy",
        teacher: "John Smit"
      },
      {
        id: 2,
        name: "Mathematics",
        teacher: "Chris Evans"
      },
      {
        id: 3,
        name: "Computer",
        teacher: "Jonathan Smit"
      },
      {
        id: 4,
        name: "Art",
        teacher: "Frida Chalo"
      },
    ];

    /*
    this.httpClient.get<Course[]>("http://localhost:8080/api/course/all")
      .subscribe((courses)=> {
        this.courses = [...courses];
        console.log('running..');
      });
      */
  }

  public getStudents(filter: string): void {
    this.students = [
      {
        id: 1,
        name: "John Connors",
        id_course: 2
      },
      {
        id: 2,
        name: "Carlo Mastrollani",
        id_course: 2
      },
      {
        id: 3,
        name: "Puneet Desai",
        id_course: 2
      },
      {
        id: 4,
        name: "Richard Parks",
        id_course: 3
      },
      {
        id: 5,
        name: "John Peter",
        id_course: 1
      },
    ];
  };

}
