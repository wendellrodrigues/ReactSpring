package com.example.demo.student;

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
            Student wendell = new Student(1L, "Wendell", "wendell@wendell.com", LocalDate.of(1997, Month.JANUARY, 22));
            Student noemi = new Student("Noemi", "noemi@noemi.com", LocalDate.of(2000, Month.APRIL, 12));
            repository.saveAll(List.of(wendell, noemi));
        };


    }
}
