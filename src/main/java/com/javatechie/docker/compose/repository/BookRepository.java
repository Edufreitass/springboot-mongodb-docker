package com.javatechie.docker.compose.repository;

import com.javatechie.docker.compose.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, Integer> {
}
