package ru.mpei.db.dao;

import ru.mpei.db.domain.Students;

public interface StudentsDAO {

    void insert(Students student);

    int count();

    Students getById(long id);

    double getByAverageEvaluation(int count, String group, String course);

 //   List<Students> getAll();

 //   void deleteById(long id);

}
