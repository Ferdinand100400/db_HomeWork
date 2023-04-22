/*
package ru.mpei.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.mpei.models.Course;
import ru.mpei.models.Evaluation;

import java.util.List;

@Transactional
@Repository
public class EvaluationRepositoryImpl implements EvaluationRepository {

    @PersistenceContext
    private final EntityManager em;

    public EvaluationRepositoryImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public Evaluation save(Evaluation evaluation) {
        if (evaluation.getId() <= 0) {
            em.persist(evaluation);
            return evaluation;
        } else {
            return em.merge(evaluation);
        }
    }

    @Override
    public List<Evaluation> findAll() {
        TypedQuery<Evaluation> query = em.createQuery("select evaluation from Evaluation" , Evaluation.class);
        return query.getResultList();
    }
    @Override
    public List<Evaluation> findByEvaluation(int evaluation) {
        TypedQuery<Evaluation> query = em.createQuery("select e " +
                        "from Evaluation e " +
                        "where e.evaluation = :evaluation",
                Evaluation.class);
        query.setParameter("evaluation", evaluation);
        return query.getResultList();
    }
}


 */