package no.restaff.schoolmanagement.service;

import no.restaff.schoolmanagement.entity.Teacher;
import java.util.List;

public interface TeacherService {
    List<Teacher> getAllTeachers();
    List<Teacher> findByTeacherFirstName(String name);

    Teacher saveTeacher(Teacher teacher);
    Teacher getTeacherById(Long id);
    Teacher updateTeacher(Teacher teacher);
    void deleteTeacherById(Long id);
}
