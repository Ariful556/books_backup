package com.example.main.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookController {
//    @GetMapping("/all")
//    public ResponseEntity<Object> getAllBooks(){
//        return BookService.getAllBooks();
//    }
}
