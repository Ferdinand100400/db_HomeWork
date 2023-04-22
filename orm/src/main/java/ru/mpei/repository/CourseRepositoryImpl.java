/*
package ru.mpei.repository;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.mpei.models.Course;
import ru.mpei.models.Evaluation;
import ru.mpei.models.Student;

import java.util.List;

@Transactional
@Repository
public class CourseRepositoryImpl implements CourseRepository {

    @PersistenceContext
    private final EntityManager em;

    public CourseRepositoryImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public Course save(Course course) {
        if (course.getId() <= 0) {
            em.persist(course);
            return course;
        } else {
           return em.merge(course);
        }
    }

    @Override
    public List<Course> findAll() {
        TypedQuery<Course> query = em.createQuery("select course from Course", Course.class);
        return query.getResultList();
    }

    @Override
    public List<Course> findByCourse(String course) {
        TypedQuery<Course> query = em.createQuery("select c " +
                        "from Course c " +
                        "where c.course = :course",
                Course.class);
        query.setParameter("course", course);
        return query.getResultList();
    }
}
*/