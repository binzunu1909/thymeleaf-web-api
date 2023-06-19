package no.restaff.schoolmanagement;

import no.restaff.schoolmanagement.entity.Teacher;
import no.restaff.schoolmanagement.repository.TeacherRepository;
import no.restaff.schoolmanagement.service.TeacherService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
class SchoolManagementApplicationTests {

	@Autowired
	private TeacherService teacherService;

	@MockBean
	private TeacherRepository teacherRepository;

	@Test
	void contextLoads() {
		Teacher teacher = new Teacher();
		teacher.setFirstName("John");
		teacher.setLastName("Wick");
		teacher.setEmail("john@example.com");

		// When
		when(teacherRepository.save(teacher)).thenReturn(teacher);
		Teacher savedStudent = teacherService.saveTeacher(teacher);

		// Then
//		assertEquals(teacher.getFirstName(), savedStudent.getFirstName());
//		assertEquals(teacher.getFirstName(), savedStudent.getFirstName());
//		assertEquals(teacher.getEmail(), savedStudent.getEmail());
	}

}
