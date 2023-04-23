package ru.mpei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.mpei.clickHouse.MeasurementRepository;
import ru.mpei.util.Measurement;

import java.time.Instant;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        ConfigurableApplicationContext run =
                SpringApplication.run(Main.class, args);

        /*
         * Перед выполнением запустите файл init.sql в консоли ClickHouse чтобы создать таблицу
         * */
        var bean = run.getBean(MeasurementRepository.class);
        bean.save(new Measurement(Instant.now(), "IED_3", 1.0));

        System.out.println(bean.findAll());

    }

}
