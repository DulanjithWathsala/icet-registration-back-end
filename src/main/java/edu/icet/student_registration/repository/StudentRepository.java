package edu.icet.student_registration.repository;

import edu.icet.student_registration.entity.StudentEntity;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<StudentEntity, Integer> {

    StudentEntity findByEmail(String email);
}
