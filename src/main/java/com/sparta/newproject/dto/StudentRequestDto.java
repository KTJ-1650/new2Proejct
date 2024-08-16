package com.sparta.newproject.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@Getter
@AllArgsConstructor
public class StudentRequestDto {

    Long student_id;
    String to_do;
    String charge_name;
    String password;
    Date write_day;
    Date modified_day;

}
