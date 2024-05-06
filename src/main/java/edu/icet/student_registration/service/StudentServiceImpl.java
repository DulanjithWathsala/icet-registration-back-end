package edu.icet.student_registration.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.student_registration.entity.StudentEntity;
import edu.icet.student_registration.model.Student;
import edu.icet.student_registration.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository repository;

    @Autowired
    ObjectMapper mapper;

    @Override
    public void persist(Student student) {
        repository.save(mapper.convertValue(student, StudentEntity.class));
    }

    @Override
    public List<Student> retrieveAll() {
        Iterable<StudentEntity> studentEntities = repository.findAll();

        List<Student> studentList = new ArrayList<>();

        studentEntities.forEach(studentEntity -> {
            Student student = mapper.convertValue(studentEntity, Student.class);
            studentList.add(student);
        });

        return studentList;
    }

    @Override
    public Student retrieve(String email) {
        return mapper.convertValue(repository.findByEmail(email), Student.class);
    }

    @Override
    public void delete(String email) {
        repository.deleteById(repository.findByEmail(email).getStudentId());
    }

}
