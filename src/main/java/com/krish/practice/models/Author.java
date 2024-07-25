package com.krish.practice.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "AUTHOR_TBL")
public class Author {
    @Id // marks attribute as Primary Key
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "f_name", length = 30)
    private String firstName;
    private String lastName;
    @Column(unique = true, nullable = false)
    private String email;
    private int age;
    @Column(updatable = false, nullable = false)
    private LocalDateTime createdAt; 
    @Column(insertable = false)
    private LocalDateTime updatedAt;
}