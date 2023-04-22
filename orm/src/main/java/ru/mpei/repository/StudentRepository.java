package ru.mpei.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import ru.mpei.models.Course;
import ru.mpei.models.Evaluation;
import ru.mpei.models.Groups;
import ru.mpei.models.Student;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends CrudRepository<Student, Long> {

 //   @EntityGraph(attributePaths = "course")
    List<Student> findAll();

   @Query("select s from Student s where s.name = :name")
   Optional<Student> findByName(@Param("name") String name);
  //  Optional<Student> findByName(String s);

    @Query("select s from Student s where s.groups = :groups")
    Optional<Student> findByGroups(@Param("groups") Groups groups);
  //  Optional<Student> findByGroups(Groups groups);

    List<Student> findByCourse(Optional<Course> course);

    @Query("select s from Student s where s.groups = :groups and s.course = :course")
    List<Student> findByGroupsAndCourse(@Param("groups") Optional<Groups> groups, @Param("course") Optional<Course> course);

    @Modifying
    @Transactional
    @Query("update Student s set s.course = :course where s.id = :id")
    void updateCourseById(@Param("id") long id, @Param("course") Optional<Course> course);


    @Modifying
    @Transactional
    @Query("update Student s set s.groups = :groups where s.name = :name")
    void updateGroupsByName(@Param("name") String name, @Param("groups") Optional<Groups> groups);

    @Modifying
    @Transactional
    @Query("update Student s set s.evaluation = :evaluation where s.id = :id")
    void updateEvaluationById(@Param("id") long id, @Param("evaluation") Optional<Evaluation> evaluation);

    @Modifying
    @Transactional
    @Query("update Student s set s.evaluation = :evaluation where s.name = :name and s.course = :course")
    void updateEvaluationByNameAndCourse(@Param("name") String name, @Param("course") Optional<Course> course,
                                         @Param("evaluation") Optional<Evaluation> evaluation);
}


/*
import ru.mpei.models.Course;
import ru.mpei.models.Evaluation;
import ru.mpei.models.Group;
import ru.mpei.models.Student;

import java.util.List;
import java.util.Optional;

public interface StudentRepository {

    Student save(Student student);
    Optional<Student> findById(long id);

    List<Student> findAll();
 //   List<Student> findByName(String name);

 //   void updateNameById(long id, String name);
//    void deleteById(long id);
    List<Student> findByCourse(List<Course> course);
    List<Student> findByEvaluation(Group group, Course course);

}

 */
