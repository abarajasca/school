import { Component } from '@angular/core';
import { Course } from 'src/app/interfaces/interfaces';
import { CoursesService } from 'src/app/services/courses.service';

@Component({
  selector: 'app-list-course',
  templateUrl: './list-course.component.html',

})
export class ListCourseComponent {
  constructor(private coursesService: CoursesService){
    this.coursesService.getCourses('');
  }

  get courses(): Course[] {
    return this.coursesService.courses;
  }
}
