package edu.icet.student_registration.model;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Setter
@Getter
public class Student {
    private Integer studentId;
    private String firstName;
    private String lastName;
    private Date dob;
    private String nationality;
    private String gender;
    private String email;
    private String phoneNum;
}
