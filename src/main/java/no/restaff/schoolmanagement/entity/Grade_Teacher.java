package no.restaff.schoolmanagement.entity;

import javax.persistence.*;

@Entity
@Table(name = "grades_teachers")
public class Grade_Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @MapsId("gradeId")
    @JoinColumn(name = "grade_id")
    private Grade grade;

    @ManyToOne
    @MapsId("teacherId")
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    public Grade_Teacher() {
    }

    public Grade_Teacher(Grade grade, Teacher teacher) {
        this.grade = grade;
        this.teacher = teacher;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
