package no.restaff.schoolmanagement.repository;

import no.restaff.schoolmanagement.entity.Grade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GradeRepository extends JpaRepository<Grade, Long> {

}
