package com.example.SpringTestProject;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class StudentRepo {
    private List<Student> students;

    StudentRepo() {
        this.students = new ArrayList<>();
        students.add(new Student("Igor", "A"));
        students.add(new Student("Ivan", "B"));
        students.add(new Student("Semen", "S"));
        students.add(new Student("Egor", "B"));
        students.add(new Student("123", "R"));
        students.add(new Student("De221nis", "R"));
        students.add(new Student("2122", "S"));
        students.add(new Student("33312", "L"));
        students.add(new Student("dadasd", "D"));
    }

    public List<Student> getAll() {
        return List.copyOf(students);
    }

    public Student getById(long id) {
        return students.stream().filter(it -> Objects.equals(id, it.getId())).findAny().orElse(null);
    }

    public Student getStudentByName(String name) {
        return students.stream().filter(it -> Objects.equals(name, it.getName())).findFirst().orElse(null);
    }

    public List<Student> getStudentsByName(String name) {
        return students.stream().filter(it -> Objects.equals(name, it.getName())).collect(Collectors.toList());
    }

    public List<Student> getStudentsByGroupName(String group) {
        return students.stream().filter(it -> Objects.equals(group, it.getGroup())).collect(Collectors.toList());
    }

    public void deleteStudentById(long id) {
        students.stream().filter(it -> Objects.equals(id, it.getId())).findFirst().map(it -> students.remove(it));
    }

    public void createAndAddStudent(String name, String group) {
        Student student = new Student(name, group);
        students.add(student);}

}
