package com.techtx.springbootmongodbexample;

import com.techtx.springbootmongodbexample.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, String> {
}
