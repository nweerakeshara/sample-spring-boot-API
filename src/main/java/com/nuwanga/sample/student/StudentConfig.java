package com.nuwanga.sample.student;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mariam = new Student(

                    "Mariam",
                    "m@gmail.com",
                    LocalDate.of(2000, Month.APRIL,5)

            );

            Student alex = new Student(

                    "Alex",
                    "a@gmail.com",
                    LocalDate.of(2005, Month.APRIL,22)

            );

            repository.saveAll(List.of(mariam,alex));
        };
    }
}
