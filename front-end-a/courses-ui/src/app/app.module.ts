import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

import { AddCourseComponent } from './components/add-course/add-course.component';
import { AppComponent } from './app.component';
import { AppRotingModule } from './app-routing.module';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';  
import { ButtonModule } from 'primeng/button';
import { FormsModule } from '@angular/forms';
import { ListCourseComponent } from './components/list-course/list-course.component';
import { ListStudentComponent } from './components/list-student/list-student.component';
import { MenubarModule } from 'primeng/menubar';
import { MenuComponent } from './components/menu/menu.component';
import { PanelModule } from 'primeng/panel';
import { TableModule } from 'primeng/table';


@NgModule({
  declarations: [
    AddCourseComponent,
    AppComponent,
    ListCourseComponent,
    ListStudentComponent,
    MenuComponent
  ],
  imports: [
    AppRotingModule,
    BrowserAnimationsModule,
    BrowserModule,
    ButtonModule,
    FormsModule,
    HttpClientModule,
    MenubarModule,
    PanelModule,
    TableModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
