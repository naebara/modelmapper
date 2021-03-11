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
public class Student {

    private int id;
    private String name;
    private int age;
    private String department;
    private String interest;
    private Address address;

    private List<Car> cars = new ArrayList<>();

}
