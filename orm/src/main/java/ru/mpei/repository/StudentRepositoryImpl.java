/*
package ru.mpei.repository;

import jakarta.persistence.EntityGraph;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.data.annotation.Persistent;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.mpei.models.Course;
import ru.mpei.models.Evaluation;
import ru.mpei.models.Group;
import ru.mpei.models.Student;

import java.util.List;
import java.util.Optional;

@Transactional
@Repository
public class StudentRepositoryImpl implements StudentRepository {

    @PersistenceContext
    private final EntityManager em;

    public StudentRepositoryImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public Student save(Student student) {
        if (student.getId() <= 0) {
            em.persist(student);
            return student;
        } else {
            return em.merge(student);
        }
    }

    @Override
    public Optional<Student> findById(long id) {
        return Optional.ofNullable(em.find(Student.class, id));
    }

    @Override
    public List<Student> findAll() {
        TypedQuery<Student> query = em.createQuery("select course from Student", Student.class);
        return query.getResultList();
    }

    @Override
    public List<Student> findByCourse(List<Course> course) {
        TypedQuery<Student> query = em.createQuery("select s from Student s where s.course = :course", Student.class);
        query.setParameter("course", course);
        return query.getResultList();
    }


    @Override
    public List<Student> findByEvaluation(Group group, Course course) {
        TypedQuery<Student> query = em.createQuery("select e " +
                        "from Student e " +
                        "where e.group = :group and e.course = :course",
                Student.class);
        query.setParameter("group", group);
        query.setParameter("course", course);
        return query.getResultList();
    }
}

 */
