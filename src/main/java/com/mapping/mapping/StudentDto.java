package com.mapping.mapping;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {

    private int id;
    private String name;
    private int age;
    private String dep;
    private String hobby;
    private String countryAddress;
    private String addressCity;

    List<CarDto> cars = new ArrayList<>(); // oneTomany, many to many

}
