package ru.mpei.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "groups")
public class Groups {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "groups")
    private String groups;

    @Column(name = "YearOfAdmission")
    private String YearOfAdmission;

    /*  @ManyToMany(targetEntity = Student.class)
    @JoinTable(name = "student_course", joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id"))
    private List<Student> students;

     */

    public Groups(String groups, String yearOfAdmission) {
        this.groups = groups;
        YearOfAdmission = yearOfAdmission;
    }
}