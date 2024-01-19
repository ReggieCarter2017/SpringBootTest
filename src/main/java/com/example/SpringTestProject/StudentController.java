package com.example.SpringTestProject;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {
    private final StudentRepo studentRepo;

    @GetMapping("/all")
    public List<Student> getUsers() {
        return studentRepo.getAll();
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable long id) {
        return studentRepo.getById(id);
    }

    @GetMapping
    public Student getStudentByName(@RequestParam String name) {
        return studentRepo.getStudentByName(name);
    }

    @GetMapping("/search")
    public List<Student> getStudentsByName(@RequestParam String name) {
        return studentRepo.getStudentsByName(name);
    }

    @GetMapping("/group/{group}")
    public List<Student> getStudentsByGroupName(@PathVariable String group) {
        return studentRepo.getStudentsByGroupName(group);
    }

    @PostMapping
    public String addNewStudent(@RequestBody Student student) {
        studentRepo.createAndAddStudent(student.getName(), student.getGroup());
        return "The student created";
    }



    @DeleteMapping("/{id}")
    public String updateStudent(@PathVariable long id) {
        studentRepo.deleteStudentById(id);
        return "Student deleted";
    }
}
