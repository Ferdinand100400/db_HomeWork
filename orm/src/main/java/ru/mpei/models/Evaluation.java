package ru.mpei.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "evaluation")
public class Evaluation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "evaluation")
    private Integer evaluation;

  /*  @ManyToMany(targetEntity = Student.class)
    @JoinTable(name = "student_evaluation", joinColumns = @JoinColumn(name = "evaluation_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id"))
    private List<Student> students;

   */

    public Evaluation(Integer evaluation) {
        this.evaluation = evaluation;
    }
}