package no.restaff.schoolmanagement;

import no.restaff.schoolmanagement.repository.StudentRepository;
import no.restaff.schoolmanagement.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"no.restaff.schoolmanagement.controller", "no.restaff.schoolmanagement.service",
		"no.restaff.schoolmanagement.config"})
public class SchoolManagementApplication implements CommandLineRunner {
	@Autowired
	private StudentRepository studentRepository;
	private TeacherRepository teacherRepository;

	public static void main(String[] args) {
		SpringApplication.run(SchoolManagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}
}
