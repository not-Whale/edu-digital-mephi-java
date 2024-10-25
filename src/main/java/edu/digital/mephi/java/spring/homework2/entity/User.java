package edu.digital.mephi.java.spring.homework2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
@AllArgsConstructor
public class User {

    @NonNull
    private Integer id;

    @NonNull
    private String firstName;

    @NonNull
    private String lastName;

    private int age;

    @NonNull
    private String country;
}
