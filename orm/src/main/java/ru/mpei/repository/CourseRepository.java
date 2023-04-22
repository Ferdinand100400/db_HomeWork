package ru.mpei.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import ru.mpei.models.Course;
import java.util.Optional;

public interface CourseRepository extends JpaRepository<Course, Long> {

    @Query("select c from Course c where c.course = :course")
    Optional<Course> findByCourse(@Param("course") String course);

    @Query("select c from Course c where c.id = :id")
    Optional<Course> findById(@Param("id") long id);

    @Modifying
    @Transactional
    @Query("update Course c set c.course = :course where c.id = :id")
    void updateCourseById(@Param("id") long id, @Param("course") String course);

}



/*import ru.mpei.models.Course;
import ru.mpei.models.Evaluation;

import java.util.List;

public interface CourseRepository {

    Course save(Course course);

    List<Course> findAll();

    List<Course> findByCourse(String course);


    @Query("select c from Course c where c.course = :course")
    Optional<Course> findByCourse(@Param("course") String course);

    @Modifying
    @Transactional
    @Query("update Course c set c.course = :course where c.id = :id")
    void updateCourseById(@Param("id") long id, @Param("course") String course);


}
*/
