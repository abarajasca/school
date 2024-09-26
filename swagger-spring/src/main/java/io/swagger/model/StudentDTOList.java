package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import org.openapitools.jackson.nullable.JsonNullable;
import io.swagger.configuration.NotUndefined;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StudentDTOList
 */
@Validated
@NotUndefined
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-25T21:17:08.221487552Z[GMT]")


public class StudentDTOList   {
  @JsonProperty("name")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String name = null;

  @JsonProperty("lastName")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String lastName = null;

  @JsonProperty("email")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String email = null;


  public StudentDTOList name(String name) { 

    this.name = name;
    return this;
  }

  /**
   * first name of student
   * @return name
   **/
  
  @Schema(example = "Chris", description = "first name of student")
  
  public String getName() {  
    return name;
  }



  public void setName(String name) { 
    this.name = name;
  }

  public StudentDTOList lastName(String lastName) { 

    this.lastName = lastName;
    return this;
  }

  /**
   * Last name of student
   * @return lastName
   **/
  
  @Schema(example = "Smith", description = "Last name of student")
  
  public String getLastName() {  
    return lastName;
  }



  public void setLastName(String lastName) { 
    this.lastName = lastName;
  }

  public StudentDTOList email(String email) { 

    this.email = email;
    return this;
  }

  /**
   * Email
   * @return email
   **/
  
  @Schema(example = "chris.smith@local.com", description = "Email")
  
  public String getEmail() {  
    return email;
  }



  public void setEmail(String email) { 
    this.email = email;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StudentDTOList studentDTOList = (StudentDTOList) o;
    return Objects.equals(this.name, studentDTOList.name) &&
        Objects.equals(this.lastName, studentDTOList.lastName) &&
        Objects.equals(this.email, studentDTOList.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, lastName, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudentDTOList {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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
