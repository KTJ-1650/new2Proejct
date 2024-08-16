package com.sparta.newproject.service;

import com.sparta.newproject.dto.StudentRequestDto;
import com.sparta.newproject.dto.StudentResponseDto;
import com.sparta.newproject.repository.Repository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final Repository repository;

    public List<StudentResponseDto> inquiryMemo(){

        return repository.inquiryMemo();
    }

    public int saveMemo(StudentRequestDto requestDto) {

        return repository.saveMemo(requestDto);
    }

    public StudentResponseDto inquiryIdMemo(StudentRequestDto requestDto) {

        return repository.inquiryIdMemo(requestDto);
    }

    public List<StudentResponseDto> modified_day(String modifieday,String name) {

        return  repository.modified_day(modifieday,name);
    }

    public List<StudentResponseDto> chargename(StudentRequestDto requestDto) {

        return  repository.chargename(requestDto);
    }

    public List<StudentResponseDto> modicharge(StudentRequestDto requestDto) {

        return  repository.modicharge(requestDto);
    }

    public int tocharge(StudentRequestDto requestDto) {

        return  repository.tocharge(requestDto);
    }

    public int deletePart(StudentRequestDto requestDto) {

        return  repository.deletePart(requestDto);
    }
}
