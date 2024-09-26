package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.StudentDTOList;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import org.openapitools.jackson.nullable.JsonNullable;
import io.swagger.configuration.NotUndefined;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StudentByCourseResponse
 */
@Validated
@NotUndefined
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-25T21:17:08.221487552Z[GMT]")


public class StudentByCourseResponse   {
  @JsonProperty("courseName")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String courseName = null;

  @JsonProperty("teacher")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String teacher = null;

  @JsonProperty("studentDTOList")
  @Valid
  private List<StudentDTOList> studentDTOList = null;

  public StudentByCourseResponse courseName(String courseName) { 

    this.courseName = courseName;
    return this;
  }

  /**
   * Course name
   * @return courseName
   **/
  
  @Schema(example = "Jonh Doe", description = "Course name")
  
  public String getCourseName() {  
    return courseName;
  }



  public void setCourseName(String courseName) { 
    this.courseName = courseName;
  }

  public StudentByCourseResponse teacher(String teacher) { 

    this.teacher = teacher;
    return this;
  }

  /**
   * Name of Teacher
   * @return teacher
   **/
  
  @Schema(example = "Joe Doe", description = "Name of Teacher")
  
  public String getTeacher() {  
    return teacher;
  }



  public void setTeacher(String teacher) { 
    this.teacher = teacher;
  }

  public StudentByCourseResponse studentDTOList(List<StudentDTOList> studentDTOList) { 

    this.studentDTOList = studentDTOList;
    return this;
  }

  public StudentByCourseResponse addStudentDTOListItem(StudentDTOList studentDTOListItem) {
    if (this.studentDTOList == null) {
      this.studentDTOList = new ArrayList<StudentDTOList>();
    }
    this.studentDTOList.add(studentDTOListItem);
    return this;
  }

  /**
   * List of student in the course
   * @return studentDTOList
   **/
  
  @Schema(description = "List of student in the course")
  @Valid
  public List<StudentDTOList> getStudentDTOList() {  
    return studentDTOList;
  }



  public void setStudentDTOList(List<StudentDTOList> studentDTOList) { 
    this.studentDTOList = studentDTOList;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StudentByCourseResponse studentByCourseResponse = (StudentByCourseResponse) o;
    return Objects.equals(this.courseName, studentByCourseResponse.courseName) &&
        Objects.equals(this.teacher, studentByCourseResponse.teacher) &&
        Objects.equals(this.studentDTOList, studentByCourseResponse.studentDTOList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(courseName, teacher, studentDTOList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudentByCourseResponse {\n");
    
    sb.append("    courseName: ").append(toIndentedString(courseName)).append("\n");
    sb.append("    teacher: ").append(toIndentedString(teacher)).append("\n");
    sb.append("    studentDTOList: ").append(toIndentedString(studentDTOList)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
