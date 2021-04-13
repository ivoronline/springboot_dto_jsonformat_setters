package com.ivoronline.springboot_dto_jsonformat_setters.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDate;

public class PersonDTO {

  //PROPERTIES
  public LocalDate birthday;
  public String    name;

  //SETTERS
  @JsonFormat(pattern="dd.MM.yyyy")
  private void setBirthday(LocalDate birthday ) { this.birthday = birthday; }
  private void setName    (String    name     ) { this.name     = name;     }

}
