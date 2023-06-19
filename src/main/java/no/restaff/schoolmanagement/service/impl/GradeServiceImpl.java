package no.restaff.schoolmanagement.service.impl;

import no.restaff.schoolmanagement.entity.Grade;
import no.restaff.schoolmanagement.repository.GradeRepository;
import no.restaff.schoolmanagement.service.GradeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradeServiceImpl implements GradeService {

    private GradeRepository gradeRepository;

    public GradeServiceImpl(GradeRepository gradeRepository) {
        super();
        this.gradeRepository = gradeRepository;
    }

    @Override
    public List<Grade> getAllGrade() {
        return gradeRepository.findAll();
    }

    @Override
    public Grade saveGrade(Grade grade) {
        return gradeRepository.save(grade);
    }

    @Override
    public Grade getGradeById(Long id) {
        return gradeRepository.findById(id).get();
    }

    @Override
    public Grade updateGrade(Grade grade) {
        return gradeRepository.save(grade);
    }

    @Override
    public void deleteGradeById(Long id) {
        gradeRepository.deleteById(id);
    }
}
