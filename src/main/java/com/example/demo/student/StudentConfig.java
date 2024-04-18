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
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student mariadi = new Student(
                    "Mariadi",
                    "mariadi@gmail.com",
                    LocalDate.of(2024, Month.JANUARY, 11));
            Student sultan = new Student(
                    "Sultan",
                    "sultan@gmail.com",
                    LocalDate.of(2024, Month.MARCH, 11));

            repository.saveAll(
                    List.of(mariadi, sultan)
            );
        };
    }
}
