package com.example.main.repository;


import com.example.main.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookEntity,Long> {
    public BookEntity findByEmail(String email);
}
