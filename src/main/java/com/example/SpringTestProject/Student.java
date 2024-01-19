package com.example.SpringTestProject;

import lombok.Data;

@Data
public class Student {
    private static long idCounter = 1;
    private long id;
    private String name;
    private String group;

    Student(String name, String group) {
        this.id = idCounter++;
        this.name = name;
        this.group = group;
    }


}
