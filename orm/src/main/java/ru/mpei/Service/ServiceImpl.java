package ru.mpei.Service;

import org.springframework.stereotype.Service;
import ru.mpei.models.Student;
import java.util.List;
import java.util.stream.Collectors;

@Service

public class ServiceImpl {

    public double getByAverageEvaluation(List<Student> students) {
        double averageEvaluation = 0.0;
        List<Integer> evaluation = students.stream().map(s -> s.getEvaluation()).collect(Collectors.toList()).
                stream().map(e -> e.getEvaluation()).collect(Collectors.toList());
        int sum = 0;
        for (int i = 0; i < evaluation.size(); i++) {
            sum += evaluation.get(i);
        }
        averageEvaluation = (double) sum / evaluation.size();
        return averageEvaluation;
    }
}
