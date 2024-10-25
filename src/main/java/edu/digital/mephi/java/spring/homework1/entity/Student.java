package edu.digital.mephi.java.spring.homework1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

import java.util.Map;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
public class Student {

    @NonNull
    private final String fullName;

    @NonNull
    private String group;

    private int course;

    @NonNull
    private Map<String, Integer> marks;

    public double getAverageMarkScore() {
        return marks.values().stream().collect(Collectors.averagingInt(value -> value));
    }

    public void transferToNextCourse() {
        this.course++;
    }
}
