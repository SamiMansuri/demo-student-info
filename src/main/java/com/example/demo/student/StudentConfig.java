package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student sami = new Student(
                    "Mohammad Sami",
                    "samimansuri303@gmail.com",
                    LocalDate.of(2003, MARCH, 30)
            );
            Student azim = new Student(
                    "Azim",
                    "azim123@gmail.com",
                    LocalDate.of(2002, MARCH, 30)
            );
            repository.saveAll(
                    List.of(sami, azim)
            );
        };
    }
}
