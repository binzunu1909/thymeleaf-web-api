package no.restaff.schoolmanagement.controller;

import no.restaff.schoolmanagement.entity.Grade;
import no.restaff.schoolmanagement.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GradeController {
    private GradeService gradeService;

    @Autowired
    public GradeController(GradeService gradeService) {
        super();
        this.gradeService = gradeService;
    }

    @GetMapping("/grades")
    public String listClasss(Model model) {
        model.addAttribute("grades", gradeService.getAllGrade());
        return "grades";
    }

    @GetMapping("/grades/new")
    public String createClassForm(Model model) {
        Grade grades = new Grade();
        model.addAttribute("grade", grades);
        return "create_grade";

    }

    @PostMapping("/grades")
    public String saveClass(@ModelAttribute("grade") Grade grade) {
        gradeService.saveGrade(grade);
        return "redirect:/grades";
    }

    @GetMapping("/grades/edit/{id}")
    public String editClassForm(@PathVariable Long id, Model model) {
        model.addAttribute("grade", gradeService.getGradeById(id));
        return "edit_grade";
    }

    @PostMapping("/grades/{id}")
    public String updateClass(@PathVariable Long id,
            @ModelAttribute("grade") Grade grade,
            Model model) {

        Grade existingClass = gradeService.getGradeById(id);
        existingClass.setId(id);
        existingClass.setNameGrade(grade.getNameGrade());


        gradeService.updateGrade((existingClass));
        return "redirect:/grades";
    }
    @GetMapping("/grades/{id}")
    public String deleteGrade(@PathVariable Long id) {
        gradeService.deleteGradeById(id);
        return "redirect:/grades";
    }

}
