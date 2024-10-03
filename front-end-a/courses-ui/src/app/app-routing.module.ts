import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { ListCourseComponent } from './components/list-course/list-course.component';
import { NgModule } from '@angular/core';
import { ListStudentComponent } from './components/list-student/list-student.component';

export const routes: Routes = [
    {
        path: '',
        component: ListCourseComponent
    },
    {
        path: 'courses',
        component: ListCourseComponent
    },
    {
        path: 'students',
        component: ListStudentComponent
    },
    {
        path: '**',
        redirectTo: ''
    },
]

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRotingModule {
    
}


