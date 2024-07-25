package com.krish.practice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.krish.practice.models.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
    
}