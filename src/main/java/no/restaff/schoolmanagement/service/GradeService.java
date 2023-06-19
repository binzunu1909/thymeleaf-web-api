package no.restaff.schoolmanagement.service;

import no.restaff.schoolmanagement.entity.Grade;

import java.util.List;

public interface GradeService {
    List<Grade> getAllGrade();

    Grade saveGrade(Grade grade);
    Grade getGradeById(Long id);
    Grade updateGrade(Grade grade);
    void deleteGradeById(Long id);
}
