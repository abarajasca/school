import { Component } from '@angular/core';
import { Student } from 'src/app/interfaces/interfaces';
import { CoursesService } from 'src/app/services/courses.service';

@Component({
  selector: 'app-list-student',
  templateUrl: './list-student.component.html',
  styles: [
  ]
})
export class ListStudentComponent {
  constructor(private courseService: CoursesService ){
    this.courseService.getStudents(' ');
  }

  get students(): Student[] {
    return this.courseService.students;
  }
}
