package no.restaff.schoolmanagement.config;

import no.restaff.schoolmanagement.repository.StudentRepository;
import no.restaff.schoolmanagement.service.StudentService;
import no.restaff.schoolmanagement.service.impl.StudentServiceImpl;
import no.restaff.schoolmanagement.repository.TeacherRepository;
import no.restaff.schoolmanagement.service.impl.TeacherServiceImpl;
import no.restaff.schoolmanagement.service.TeacherService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    private TeacherRepository teacherRepository;
    @Bean
    public TeacherService teacherService() {
        return new TeacherServiceImpl(teacherRepository);
    }
}
