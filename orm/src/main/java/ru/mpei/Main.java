package ru.mpei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.mpei.Service.ServiceImpl;
import ru.mpei.models.*;
import ru.mpei.repository.CourseRepository;
import ru.mpei.repository.EvaluationRepository;
import ru.mpei.repository.GroupRepository;
import ru.mpei.repository.StudentRepository;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(Main.class);

        StudentRepository studentRepository = context.getBean(StudentRepository.class);
        CourseRepository courseRepository = context.getBean(CourseRepository.class);
        GroupRepository groupRepository = context.getBean(GroupRepository.class);
        EvaluationRepository evaluationRepository = context.getBean(EvaluationRepository.class);

        ServiceImpl service = new ServiceImpl();

        // Сохраняем в таблицу все группы
        groupRepository.save(new Groups("EL-12M-22", "2022"));
        groupRepository.save(new Groups("EL-11M-22", "2022"));
        groupRepository.save(new Groups("EL-12M-21", "2021"));

        // Сохраняем в таблицу все курсы
        courseRepository.save(new Course("Course 1"));
        courseRepository.save(new Course("Course 2"));
        courseRepository.save(new Course("Course 3"));
        courseRepository.save(new Course("Course programmer"));
        courseRepository.save(new Course("Course economy"));
        courseRepository.save(new Course("Course ecology"));

        // Сохраняем в таблицу все оценки
        evaluationRepository.save(new Evaluation(2));
        evaluationRepository.save(new Evaluation(3));
        evaluationRepository.save(new Evaluation(4));
        evaluationRepository.save(new Evaluation(5));

        // Сохраняем в таблицу всех студентов (кол-во строк одного студента соотвествует кол-ву его курсов)
        studentRepository.save(new Student("Vasa"));
        studentRepository.save(new Student("Vasa"));
        studentRepository.save(new Student("Vasa"));

        studentRepository.save(new Student("Damir"));
        studentRepository.save(new Student("Damir"));
        studentRepository.save(new Student("Damir"));

        studentRepository.save(new Student("Ivan"));
        studentRepository.save(new Student("Ivan"));

        studentRepository.save(new Student("Evgeniy"));
        studentRepository.save(new Student("Evgeniy"));
        studentRepository.save(new Student("Evgeniy"));

        studentRepository.save(new Student("Sasha"));
        studentRepository.save(new Student("Sasha"));
        studentRepository.save(new Student("Sasha"));

        studentRepository.save(new Student("Kata1"));
        studentRepository.save(new Student("Kata1"));
        studentRepository.save(new Student("Kata1"));

        studentRepository.save(new Student("Egor"));
        studentRepository.save(new Student("Egor"));

        studentRepository.save(new Student("Aleksey"));
        studentRepository.save(new Student("Aleksey"));

        studentRepository.save(new Student("Anna"));
        studentRepository.save(new Student("Anna"));
        studentRepository.save(new Student("Anna"));

        studentRepository.save(new Student("Andrey"));
        studentRepository.save(new Student("Andrey"));
        studentRepository.save(new Student("Andrey"));

        studentRepository.save(new Student("Pasha"));
        studentRepository.save(new Student("Pasha"));
        studentRepository.save(new Student("Pasha"));

        studentRepository.save(new Student("Kata2"));
        studentRepository.save(new Student("Kata2"));
        studentRepository.save(new Student("Kata2"));

        studentRepository.save(new Student("Masha"));
        studentRepository.save(new Student("Masha"));

        studentRepository.save(new Student("Anton"));
        studentRepository.save(new Student("Anton"));
        studentRepository.save(new Student("Anton"));

        studentRepository.save(new Student("Nikita"));
        studentRepository.save(new Student("Nikita"));

        studentRepository.save(new Student("Regina"));
        studentRepository.save(new Student("Regina"));
        studentRepository.save(new Student("Regina"));

        studentRepository.save(new Student("Denis"));
        studentRepository.save(new Student("Denis"));

        System.out.println("Добавление группы студенту");
        studentRepository.updateGroupsByName("Vasa", groupRepository.findById(1));
        studentRepository.updateGroupsByName("Damir", groupRepository.findById(1));
        studentRepository.updateGroupsByName("Ivan", groupRepository.findById(1));
        studentRepository.updateGroupsByName("Evgeniy", groupRepository.findById(1));
        studentRepository.updateGroupsByName("Sasha", groupRepository.findById(1));
        studentRepository.updateGroupsByName("Kata1", groupRepository.findById(1));
        studentRepository.updateGroupsByName("Egor", groupRepository.findById(1));
        studentRepository.updateGroupsByName("Aleksey", groupRepository.findById(1));
        studentRepository.updateGroupsByName("Anna", groupRepository.findById(1));
        studentRepository.updateGroupsByName("Andrey", groupRepository.findById(1));
        studentRepository.updateGroupsByName("Pasha", groupRepository.findById(2));
        studentRepository.updateGroupsByName("Kata2", groupRepository.findById(2));
        studentRepository.updateGroupsByName("Masha", groupRepository.findById(2));
        studentRepository.updateGroupsByName("Anton", groupRepository.findById(2));
        studentRepository.updateGroupsByName("Nikita", groupRepository.findById(2));
        studentRepository.updateGroupsByName("Regina", groupRepository.findById(2));
        studentRepository.updateGroupsByName("Denis", groupRepository.findById(3));

        System.out.println("Добавление курса студенту");
        studentRepository.updateCourseById(1, courseRepository.findById(1));
        studentRepository.updateCourseById(2, courseRepository.findById(2));
        studentRepository.updateCourseById(3, courseRepository.findById(4));

        studentRepository.updateCourseById(4, courseRepository.findById(1));
        studentRepository.updateCourseById(5, courseRepository.findById(2));
        studentRepository.updateCourseById(6, courseRepository.findById(5));

        studentRepository.updateCourseById(7, courseRepository.findById(1));
        studentRepository.updateCourseById(8, courseRepository.findById(2));

        studentRepository.updateCourseById(9, courseRepository.findById(1));
        studentRepository.updateCourseById(10, courseRepository.findById(2));
        studentRepository.updateCourseById(11, courseRepository.findById(6));

        studentRepository.updateCourseById(12, courseRepository.findById(1));
        studentRepository.updateCourseById(13, courseRepository.findById(2));
        studentRepository.updateCourseById(14, courseRepository.findById(5));

        studentRepository.updateCourseById(15, courseRepository.findById(1));
        studentRepository.updateCourseById(16, courseRepository.findById(2));
        studentRepository.updateCourseById(17, courseRepository.findById(5));

        studentRepository.updateCourseById(18, courseRepository.findById(1));
        studentRepository.updateCourseById(19, courseRepository.findById(2));

        studentRepository.updateCourseById(20, courseRepository.findById(1));
        studentRepository.updateCourseById(21, courseRepository.findById(2));

        studentRepository.updateCourseById(22, courseRepository.findById(1));
        studentRepository.updateCourseById(23, courseRepository.findById(2));
        studentRepository.updateCourseById(24, courseRepository.findById(4));

        studentRepository.updateCourseById(25, courseRepository.findById(1));
        studentRepository.updateCourseById(26, courseRepository.findById(2));
        studentRepository.updateCourseById(27, courseRepository.findById(4));

        studentRepository.updateCourseById(28, courseRepository.findById(2));
        studentRepository.updateCourseById(29, courseRepository.findById(3));
        studentRepository.updateCourseById(30, courseRepository.findById(5));

        studentRepository.updateCourseById(31, courseRepository.findById(2));
        studentRepository.updateCourseById(32, courseRepository.findById(3));
        studentRepository.updateCourseById(33, courseRepository.findById(6));

        studentRepository.updateCourseById(33, courseRepository.findById(2));
        studentRepository.updateCourseById(34, courseRepository.findById(3));

        studentRepository.updateCourseById(35, courseRepository.findById(2));
        studentRepository.updateCourseById(36, courseRepository.findById(3));
        studentRepository.updateCourseById(37, courseRepository.findById(6));

        studentRepository.updateCourseById(38, courseRepository.findById(2));
        studentRepository.updateCourseById(39, courseRepository.findById(3));

        studentRepository.updateCourseById(40, courseRepository.findById(2));
        studentRepository.updateCourseById(41, courseRepository.findById(3));
        studentRepository.updateCourseById(42, courseRepository.findById(5));

        System.out.println("Добавление оценки за курс");
        studentRepository.updateEvaluationByNameAndCourse("Vasa", courseRepository.findById(1),
                evaluationRepository.findByEvaluation(5));
        studentRepository.updateEvaluationByNameAndCourse("Vasa", courseRepository.findById(2),
                evaluationRepository.findByEvaluation(5));
        studentRepository.updateEvaluationByNameAndCourse("Vasa", courseRepository.findById(4),
                evaluationRepository.findByEvaluation(5));

        studentRepository.updateEvaluationByNameAndCourse("Damir", courseRepository.findById(1),
                evaluationRepository.findByEvaluation(4));
        studentRepository.updateEvaluationByNameAndCourse("Damir", courseRepository.findById(2),
                evaluationRepository.findByEvaluation(5));
        studentRepository.updateEvaluationByNameAndCourse("Damir", courseRepository.findById(5),
                evaluationRepository.findByEvaluation(4));

        studentRepository.updateEvaluationByNameAndCourse("Ivan", courseRepository.findById(1),
                evaluationRepository.findByEvaluation(2));
        studentRepository.updateEvaluationByNameAndCourse("Ivan", courseRepository.findById(2),
                evaluationRepository.findByEvaluation(3));

        studentRepository.updateEvaluationByNameAndCourse("Evgeniy", courseRepository.findById(1),
                evaluationRepository.findByEvaluation(3));
        studentRepository.updateEvaluationByNameAndCourse("Evgeniy", courseRepository.findById(2),
                evaluationRepository.findByEvaluation(4));
        studentRepository.updateEvaluationByNameAndCourse("Evgeniy", courseRepository.findById(6),
                evaluationRepository.findByEvaluation(5));

        studentRepository.updateEvaluationByNameAndCourse("Sasha", courseRepository.findById(1),
                evaluationRepository.findByEvaluation(5));
        studentRepository.updateEvaluationByNameAndCourse("Sasha", courseRepository.findById(2),
                evaluationRepository.findByEvaluation(4));
        studentRepository.updateEvaluationByNameAndCourse("Sasha", courseRepository.findById(5),
                evaluationRepository.findByEvaluation(5));

        studentRepository.updateEvaluationByNameAndCourse("Kata1", courseRepository.findById(1),
                evaluationRepository.findByEvaluation(5));
        studentRepository.updateEvaluationByNameAndCourse("Kata1", courseRepository.findById(2),
                evaluationRepository.findByEvaluation(4));
        studentRepository.updateEvaluationByNameAndCourse("Kata1", courseRepository.findById(5),
                evaluationRepository.findByEvaluation(5));

        studentRepository.updateEvaluationByNameAndCourse("Egor", courseRepository.findById(1),
                evaluationRepository.findByEvaluation(4));
        studentRepository.updateEvaluationByNameAndCourse("Egor", courseRepository.findById(2),
                evaluationRepository.findByEvaluation(3));

        studentRepository.updateEvaluationByNameAndCourse("Aleksey", courseRepository.findById(1),
                evaluationRepository.findByEvaluation(5));
        studentRepository.updateEvaluationByNameAndCourse("Aleksey", courseRepository.findById(2),
                evaluationRepository.findByEvaluation(5));

        studentRepository.updateEvaluationByNameAndCourse("Anna", courseRepository.findById(1),
                evaluationRepository.findByEvaluation(5));
        studentRepository.updateEvaluationByNameAndCourse("Anna", courseRepository.findById(2),
                evaluationRepository.findByEvaluation(5));
        studentRepository.updateEvaluationByNameAndCourse("Anna", courseRepository.findById(4),
                evaluationRepository.findByEvaluation(4));

        studentRepository.updateEvaluationByNameAndCourse("Andrey", courseRepository.findById(1),
                evaluationRepository.findByEvaluation(5));
        studentRepository.updateEvaluationByNameAndCourse("Andrey", courseRepository.findById(2),
                evaluationRepository.findByEvaluation(5));
        studentRepository.updateEvaluationByNameAndCourse("Andrey", courseRepository.findById(4),
                evaluationRepository.findByEvaluation(5));

        studentRepository.updateEvaluationByNameAndCourse("Pasha", courseRepository.findById(2),
                evaluationRepository.findByEvaluation(5));
        studentRepository.updateEvaluationByNameAndCourse("Pasha", courseRepository.findById(3),
                evaluationRepository.findByEvaluation(5));
        studentRepository.updateEvaluationByNameAndCourse("Pasha", courseRepository.findById(5),
                evaluationRepository.findByEvaluation(5));

        studentRepository.updateEvaluationByNameAndCourse("Kata2", courseRepository.findById(2),
                evaluationRepository.findByEvaluation(4));
        studentRepository.updateEvaluationByNameAndCourse("Kata2", courseRepository.findById(3),
                evaluationRepository.findByEvaluation(3));
        studentRepository.updateEvaluationByNameAndCourse("Kata2", courseRepository.findById(6),
                evaluationRepository.findByEvaluation(4));

        studentRepository.updateEvaluationByNameAndCourse("Masha", courseRepository.findById(2),
                evaluationRepository.findByEvaluation(5));
        studentRepository.updateEvaluationByNameAndCourse("Masha", courseRepository.findById(3),
                evaluationRepository.findByEvaluation(4));

        studentRepository.updateEvaluationByNameAndCourse("Anton", courseRepository.findById(2),
                evaluationRepository.findByEvaluation(5));
        studentRepository.updateEvaluationByNameAndCourse("Anton", courseRepository.findById(3),
                evaluationRepository.findByEvaluation(5));
        studentRepository.updateEvaluationByNameAndCourse("Anton", courseRepository.findById(6),
                evaluationRepository.findByEvaluation(5));

        studentRepository.updateEvaluationByNameAndCourse("Nikita", courseRepository.findById(2),
                evaluationRepository.findByEvaluation(3));
        studentRepository.updateEvaluationByNameAndCourse("Nikita", courseRepository.findById(3),
                evaluationRepository.findByEvaluation(5));

        studentRepository.updateEvaluationByNameAndCourse("Regina", courseRepository.findById(2),
                evaluationRepository.findByEvaluation(4));
        studentRepository.updateEvaluationByNameAndCourse("Regina", courseRepository.findById(3),
                evaluationRepository.findByEvaluation(3));
        studentRepository.updateEvaluationByNameAndCourse("Regina", courseRepository.findById(5),
                evaluationRepository.findByEvaluation(4));

// Ищем среднюю оценку за определенный курс определенной группы (в качестве параметра лист из студентов одной группы и курса)
        System.out.println("Средняя оценка группы ЭЛ-12М-22 за курс 1: "
                +service.getByAverageEvaluation(studentRepository.
                findByGroupsAndCourse(groupRepository.findById(1), courseRepository.findById(1))));
        System.out.println("Средняя оценка группы ЭЛ-12М-22 за курс 2: "
                +service.getByAverageEvaluation(studentRepository.
                findByGroupsAndCourse(groupRepository.findById(1), courseRepository.findById(2))));
        System.out.println("Средняя оценка группы ЭЛ-12М-22 за курс 3: "
                +service.getByAverageEvaluation(studentRepository.
                findByGroupsAndCourse(groupRepository.findById(1), courseRepository.findById(3))));
        System.out.println("Средняя оценка группы ЭЛ-12М-22 за курс программирования: "
                +service.getByAverageEvaluation(studentRepository.
                findByGroupsAndCourse(groupRepository.findById(1), courseRepository.findById(4))));
        System.out.println("Средняя оценка группы ЭЛ-12М-22 за курс экономики: "
                +service.getByAverageEvaluation(studentRepository.
                findByGroupsAndCourse(groupRepository.findById(1), courseRepository.findById(5))));
        System.out.println("Средняя оценка группы ЭЛ-12М-22 за курс экологии: "
                +service.getByAverageEvaluation(studentRepository.
                findByGroupsAndCourse(groupRepository.findById(1), courseRepository.findById(6))));

        System.out.println("Средняя оценка группы ЭЛ-11М-22 за курс 1: "
                +service.getByAverageEvaluation(studentRepository.
                findByGroupsAndCourse(groupRepository.findById(2), courseRepository.findById(1))));
        System.out.println("Средняя оценка группы ЭЛ-11М-22 за курс 2: "
                +service.getByAverageEvaluation(studentRepository.
                findByGroupsAndCourse(groupRepository.findById(2), courseRepository.findById(2))));
        System.out.println("Средняя оценка группы ЭЛ-11М-22 за курс 3: "
                +service.getByAverageEvaluation(studentRepository.
                findByGroupsAndCourse(groupRepository.findById(2), courseRepository.findById(3))));
        System.out.println("Средняя оценка группы ЭЛ-11М-22 за курс программирования: "
                +service.getByAverageEvaluation(studentRepository.
                findByGroupsAndCourse(groupRepository.findById(2), courseRepository.findById(3))));
        System.out.println("Средняя оценка группы ЭЛ-11М-22 за курс экономики: "
                +service.getByAverageEvaluation(studentRepository.
                findByGroupsAndCourse(groupRepository.findById(2), courseRepository.findById(4))));
        System.out.println("Средняя оценка группы ЭЛ-11М-22 за курс экологии: "
                +service.getByAverageEvaluation(studentRepository.
                findByGroupsAndCourse(groupRepository.findById(2), courseRepository.findById(5))));




/*
        System.out.println("\n\nИщем все курсы");
        System.out.println(courseRepository.findAll());
        System.out.println("\n\nИщем курс 1");
        System.out.println(courseRepository.findByCourse("Course 1"));
        System.out.println("\n\nВсе студенты");
        System.out.println(studentRepository.findAll());
      //  System.out.println(studentRepository.findByName("Vasa"));
        System.out.println("Список студенов определенной группы и курса: " +students);
        System.out.println("Список оценок определенной группы за определенный курс: " +evaluation);
        System.out.println("Средняя оценка определенной группы за определенный курс: " +average);

 */

    }

}