package com.sparta.newproject.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class StudentResponseDto {
    int student_id;     //아이디
    String to_do;       //할일
    String charge_name;  //담당자
    String password;     //비번
    Date write_day;    //작성일
    Date modified_day;  //수정일

    public StudentResponseDto() {

    }


}
