package ru.mpei.db.dao;

import ru.mpei.db.domain.Students;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;
import java.util.Map;

@Repository
public class StudentsDaoJdbc implements StudentsDAO{

    private final JdbcOperations jdbc;
    private final NamedParameterJdbcOperations namedParameterJdbcOperations;

    public StudentsDaoJdbc(NamedParameterJdbcOperations namedParameterJdbcOperations)
    {
        this.jdbc = namedParameterJdbcOperations.getJdbcOperations();
        this.namedParameterJdbcOperations = namedParameterJdbcOperations;
    }

    @Override
    public void insert(Students student) {
        namedParameterJdbcOperations.update("insert into students (id, name, s_group, course, evaluation) values (:id, :name, :group, :course, :evaluation)",
                Map.of( "id", student.getId(),
                        "name", student.getName(),
                        "group", student.getGroup(),
                        "course", student.getCourse(),
                        "evaluation", student.getEvaluation()
                )
        );
    }

    @Override
    public int count() {
        Integer count = jdbc.queryForObject("select count(*) from students", Integer.class);
        return count == null? 0: count;
    }

    @Override
    public Students getById(long id) {
        Map<String, Object> params = Collections.singletonMap("id", id);

        return namedParameterJdbcOperations.queryForObject(
                "select id, name, s_group, course, evaluation from students where id = :id", params, new StudentMapper()
        );
    }

    @Override
    public double getByAverageEvaluation(int count, String group,String course) {
        double averageEvaluation = 0.0;
        int k = 0;
        for (int i = 1; i <= count; i++) {
            Students student = getById(i);
            if ((student.getCourse() == course) && (student.getGroup() == group)) {
            //    System.out.println(student.getName()+ " group: " +group+ " course: " +course+ " evaluation: " +student.getEvaluation());
                averageEvaluation += student.getEvaluation();
                k++;
            }
        }
        averageEvaluation /= k;
        return averageEvaluation;
    }

    /*   @Override
        public List<Students> getAll() {
            return jdbc.query("select id, name from persons", new StudentMapper());
        }
    */
/*    @Override
    public void deleteById(long id) {
        Map<String, Object> params = Collections.singletonMap("id", id);
        namedParameterJdbcOperations.update(
                "delete from persons where id = :id", params
        );
    }
*/
    private static class StudentMapper implements RowMapper<Students> {

        @Override
        public Students mapRow(ResultSet resultSet, int i) throws SQLException {
            long id = resultSet.getLong("id");
            String name = resultSet.getString("name");
            String group = resultSet.getString("s_group");
            String course = resultSet.getString("course");
            int evaluation = resultSet.getInt("evaluation");
            return new Students(id, name, group, course, evaluation);
        }
    }

}
