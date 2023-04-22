package ru.mpei.models;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.grammars.hql.HqlParser;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", nullable = false, unique = false)
    private String name;

    @ManyToOne(targetEntity = Groups.class, /*optional = false,*/ cascade = CascadeType.ALL)
    @JoinColumn(name = "groups_id")
    private Groups groups;

    @ManyToOne(targetEntity = Course.class, /*optional = false,*/ cascade = CascadeType.ALL)
    @JoinColumn(name = "course_id")
    private Course course;

    @ManyToOne(targetEntity = Evaluation.class, /*optional = false,*/ cascade = CascadeType.ALL)
    @JoinColumn(name = "evaluation_id")
    private Evaluation evaluation;
/*
    @ManyToMany(targetEntity = Course.class)
    @JoinTable(name = "student_course", joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id"))
    private List<Course> course;

    @ManyToMany(targetEntity = Evaluation.class)
    @JoinTable(name = "student_evaluation", joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "evaluation_id"))
    private List<Evaluation> evaluation;

   */



    public Student(String name) {
        this.name = name;
     //   this.group = group;
    //    this.course = course;
   //     this.evaluation = evaluation;
    }

}
