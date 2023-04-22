package ru.mpei.db;

import ru.mpei.db.dao.StudentsDAO;
import ru.mpei.db.domain.Students;
import org.h2.tools.Console;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) throws Exception {

        ApplicationContext context = SpringApplication.run(Main.class);

        StudentsDAO dao = context.getBean(StudentsDAO.class);

        System.out.println("All count " + dao.count());

        dao.insert(new Students(2,"Vasa", "EL-12M-22","course 1", 5));
        dao.insert(new Students(3,"Damir", "EL-12M-22","course 1", 4));
        dao.insert(new Students(4,"Ivan", "EL-12M-22","course 1", 2));
        dao.insert(new Students(5,"Evgeniy", "EL-12M-22","course 1", 3));
        dao.insert(new Students(6,"Sasha", "EL-12M-22","course 1", 5));
        dao.insert(new Students(7,"Kata1", "EL-12M-22","course 1", 5));
        dao.insert(new Students(8,"Egor", "EL-12M-22","course 1", 4));
        dao.insert(new Students(9,"Aleksey", "EL-12M-22","course 1", 5));
        dao.insert(new Students(10,"Anna", "EL-12M-22","course 1", 5));
        dao.insert(new Students(11,"Andrey", "EL-12M-22","course 1", 5));

        dao.insert(new Students(12,"Vasa", "EL-12M-22","course 2", 5));
        dao.insert(new Students(13,"Damir", "EL-12M-22","course 2", 5));
        dao.insert(new Students(14,"Ivan", "EL-12M-22","course 2", 3));
        dao.insert(new Students(15,"Evgeniy", "EL-12M-22","course 2", 4));
        dao.insert(new Students(16,"Sasha", "EL-12M-22","course 2", 4));
        dao.insert(new Students(17,"Kata1", "EL-12M-22","course 2", 4));
        dao.insert(new Students(18,"Egor", "EL-12M-22","course 2", 3));
        dao.insert(new Students(19,"Aleksey", "EL-12M-22","course 2", 5));
        dao.insert(new Students(20,"Anna", "EL-12M-22","course 2", 5));
        dao.insert(new Students(21,"Andrey", "EL-12M-22","course 2", 5));

        dao.insert(new Students(22,"Vasa", "EL-12M-22","course programmer", 5));
        dao.insert(new Students(23,"Anna", "EL-12M-22","course programmer", 4));
        dao.insert(new Students(24,"Andrey", "EL-12M-22","course programmer", 5));

        dao.insert(new Students(25,"Damir", "EL-12M-22","course economy", 4));
        dao.insert(new Students(26,"Evgeniy", "EL-12M-22","course ecology", 5));
        dao.insert(new Students(27,"Sasha", "EL-12M-22","course economy", 5));
        dao.insert(new Students(28,"Kata1", "EL-12M-22","course economy", 5));


        dao.insert(new Students(29,"Pasha", "EL-11M-22","course 1", 5));
        dao.insert(new Students(30,"Kata2", "EL-11M-22","course 1", 4));
        dao.insert(new Students(31,"Masha", "EL-11M-22","course 1", 5));
        dao.insert(new Students(32,"Anton", "EL-11M-22","course 1", 5));
        dao.insert(new Students(33,"Nikita", "EL-11M-22","course 1", 3));
        dao.insert(new Students(34,"Regina", "EL-11M-22","course 1", 4));

        dao.insert(new Students(35,"Pasha", "EL-11M-22","course 3", 5));
        dao.insert(new Students(36,"Kata2", "EL-11M-22","course 3", 3));
        dao.insert(new Students(37,"Masha", "EL-11M-22","course 3", 4));
        dao.insert(new Students(38,"Anton", "EL-11M-22","course 3", 5));
        dao.insert(new Students(39,"Nikita", "EL-11M-22","course 3", 5));
        dao.insert(new Students(40,"Regina", "EL-11M-22","course 3", 3));

        dao.insert(new Students(41,"Pasha", "EL-11M-22","course economy", 5));
        dao.insert(new Students(42,"Kata2", "EL-11M-22","course ecology", 4));
        dao.insert(new Students(43,"Anton", "EL-11M-22","course ecology", 5));
        dao.insert(new Students(44,"Regina", "EL-11M-22","course economy", 4));

        System.out.println("All count " + dao.count());

        System.out.println("EL-12M-22: 'course 1' average evaluation: "
                +dao.getByAverageEvaluation(dao.count(), "EL-12M-22", "course 1")
        );
        System.out.println("EL-12M-22: 'course 2' average evaluation: "
                +dao.getByAverageEvaluation(dao.count(), "EL-12M-22","course 2")
        );
        System.out.println("EL-11M-22: 'course 1' average evaluation: "
                +dao.getByAverageEvaluation(dao.count(), "EL-11M-22","course 1")
        );
        System.out.println("EL-11M-22: 'course 3' average evaluation: "
                +dao.getByAverageEvaluation(dao.count(), "EL-11M-22","course 3")
        );
        System.out.println("EL-12M-22: 'course programmer' average evaluation: "
                +dao.getByAverageEvaluation(dao.count(), "EL-12M-22","course programmer")
        );
        System.out.println("EL-12M-22: 'course economy' average evaluation: "
                +dao.getByAverageEvaluation(dao.count(), "EL-12M-22","course economy")
        );
        System.out.println("EL-11M-22: 'course economy' average evaluation: "
                +dao.getByAverageEvaluation(dao.count(), "EL-11M-22","course economy")
        );
        System.out.println("EL-12M-22: 'course ecology' average evaluation: "
                +dao.getByAverageEvaluation(dao.count(), "EL-12M-22","course ecology")
        );
        System.out.println("EL-11M-22: 'course ecology' average evaluation: "
                +dao.getByAverageEvaluation(dao.count(), "EL-11M-22","course ecology")
        );


        Console.main(args);
    }
}