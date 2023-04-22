package ru.mpei.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import ru.mpei.models.Evaluation;

import java.util.Optional;

public interface EvaluationRepository extends JpaRepository<Evaluation, Long> {

    @Query("select e from Evaluation e where e.evaluation = :evaluation")
    Optional<Evaluation> findByEvaluation(@Param("evaluation") Integer evaluation);

    @Modifying
    @Transactional
    @Query("update Evaluation e set e.evaluation = :evaluation where e.id = :id")
    void updateEvaluationById(@Param("id") long id, @Param("evaluation") Integer evaluation);

}


/*
import ru.mpei.models.Course;
import ru.mpei.models.Evaluation;

import java.util.List;

public interface EvaluationRepository {

    Evaluation save(Evaluation evaluation);

    List<Evaluation> findAll();

    List<Evaluation> findByEvaluation(int evaluation);
}

 */
