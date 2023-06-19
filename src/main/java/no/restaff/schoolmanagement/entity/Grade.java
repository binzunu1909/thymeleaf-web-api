package no.restaff.schoolmanagement.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table( name = "grades")
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column( name = "name_grade", nullable = false)
    private String nameGrade;
    @ManyToMany(fetch = FetchType.LAZY)
    private Set<Teacher> teacher = new HashSet<>();

    public Grade() {
    }

    public Grade(String nameGrade) {
        this.nameGrade = nameGrade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameGrade() {
        return nameGrade;
    }

    public void setNameGrade(String nameGrade) {
        this.nameGrade = nameGrade;
    }

    public Set<Teacher> getTeacher() {
        return teacher;
    }

    public void setTeacher(Set<Teacher> teacher) {
        this.teacher = teacher;
    }

}
