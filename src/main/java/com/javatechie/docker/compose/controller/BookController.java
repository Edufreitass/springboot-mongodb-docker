package com.javatechie.docker.compose.controller;

import com.javatechie.docker.compose.model.Book;
import com.javatechie.docker.compose.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookRepository repository;

    @PostMapping
    public Book saveBook(@RequestBody Book book) {
        return repository.save(book);
    }

    @GetMapping
    public List<Book> getBooks() {
        return repository.findAll();
    }

}
