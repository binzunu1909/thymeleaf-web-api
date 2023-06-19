//this is according to video tutorial

package no.restaff.schoolmanagement.service;

import no.restaff.schoolmanagement.entity.Student;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentById(Long id);
    Student updateStudent(Student student);
    void deleteStudentById(Long id);
    List<Student> searchStudentByFirstName(String firstName);
}
