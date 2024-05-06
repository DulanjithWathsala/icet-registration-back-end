package edu.icet.student_registration.controller;

import edu.icet.student_registration.model.Student;
import edu.icet.student_registration.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class StudentController {

    @Autowired
    StudentService service;

    @PostMapping("/student")
    void persist(@RequestBody Student student) {
        service.persist(student);
    }

    @GetMapping("/students")
    List<Student> retrieveAll() {
        return service.retrieveAll();
    }

    @GetMapping("/student")
    Student retrieve(@RequestParam String email) {
        return service.retrieve(email);
    }

    @DeleteMapping("/student")
    void delete(@RequestParam String email) {
        service.delete(email);
    }
}
