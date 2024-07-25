package com.krish.practice;

import java.time.LocalDateTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.krish.practice.models.Author;
import com.krish.practice.repositories.AuthorRepository;

@SpringBootApplication
public class PracticeApplication {
	public static void main(String[] args) {
		SpringApplication.run(PracticeApplication.class, args);
	}

    @Bean
    public CommandLineRunner commandLineRunner(
        AuthorRepository authorRepository
    ) {
        return args -> {
            var author = Author.builder()
                                .firstName("Karan")
                                .lastName("Sharma")
                                .email("karan@mail.com")
                                .age(30)
                                .createdAt(LocalDateTime.now())
                                .build();
            authorRepository.save(author);
        };
    }
}
