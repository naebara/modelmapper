package com.mapping.mapping;

import lombok.Getter;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@RestController
@RequestMapping("/map")
public class Controller {

    ModelMapper mapper = new ModelMapper();

    @GetMapping("/toDto")
    public StudentDto studentDto(@RequestBody Student s){

        mapper.typeMap(Student.class,StudentDto.class)
                .addMapping(Student::getInterest, StudentDto::setHobby)
                .addMapping(Student::getDepartment, StudentDto::setDep);

        return mapper.map(s, StudentDto.class);
    }

    @GetMapping("/toEntity")
    public Student studentEn(@RequestBody StudentDto s){

        return mapper.map(s, Student.class);
    }

}
