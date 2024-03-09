package com.example.dockerspringpostgres.controller;


import com.example.dockerspringpostgres.student.entity.Student;
import com.example.dockerspringpostgres.student.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @GetMapping("/test")
    public String apiTesting() {
        return "Hello spring boot !!!";
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody Student student) {
        try {
            studentService.saveStudent(student);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @GetMapping
    public ResponseEntity<List<Student>> findAllStudents() {
        try {
            return ResponseEntity.ok(studentService.findAllStudents());
        } catch (RuntimeException e) {
            e.printStackTrace();
            return null;
        }
    }
}
