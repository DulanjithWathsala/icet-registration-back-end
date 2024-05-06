package edu.icet.student_registration.service;

import edu.icet.student_registration.model.Student;

import java.util.List;

public interface StudentService {

    void persist(Student student);

    List<Student> retrieveAll();

    Student retrieve(String email);

    void delete(String email);
}
