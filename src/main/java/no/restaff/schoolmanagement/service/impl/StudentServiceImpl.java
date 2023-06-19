package no.restaff.schoolmanagement.service.impl;

import no.restaff.schoolmanagement.entity.Student;
import no.restaff.schoolmanagement.repository.StudentRepository;
import no.restaff.schoolmanagement.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }
    @Override
    public List<Student> searchStudentByFirstName(String firstName) {
        return studentRepository.findByFirstName(firstName);
    }
}
