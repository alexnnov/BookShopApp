package com.netcracker.service;

import com.netcracker.entity.Book;
import com.netcracker.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.NamedQuery;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public void addBook(Book book){
        bookRepository.save(book);
    }

    public void update(Book book){
        bookRepository.save(book);
    }

    public void remove(int id) {
        bookRepository.deleteById(id);
    }

    public Book findBook(int id){
        Optional<Book> optional = bookRepository.findById(id);
        return optional.orElse(null);
    }

    public List<Book> findAll(){
        return bookRepository.findAll();
    }



}
