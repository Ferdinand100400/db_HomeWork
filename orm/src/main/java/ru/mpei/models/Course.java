package ru.mpei.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "course")
    private String course;

 /*     @ManyToMany(targetEntity = .Studentclass)
    @JoinTable(name = "student_course", joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id"))
    private List<String> course;

  */


    public Course(String course) {
        this.course = course;
    }
}

//   @ManyToMany(targetEntity = Evaluation.class, fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    // Задает таблицу связей между таблицами для хранения родительской и связанной сущностью
//    @JoinTable(name = "course_evaluation", joinColumns = @JoinColumn(name = "course_id"),
//            inverseJoinColumns = @JoinColumn(name = "evaluation_id"))
//    private List<Evaluation> evaluation;
