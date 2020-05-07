package com.netcracker.controller;

import com.netcracker.entity.Book;

import com.netcracker.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/books")
public class BookController {

    @Autowired
    private BookService bookService;



    @PostMapping ("/create")
    @ResponseStatus (code = HttpStatus.CREATED)
    public void createBook(@RequestBody Book book) {
        bookService.addBook(book);
    }

    @PutMapping("/put/{id}")
    public ResponseEntity<Book> updateBook(@RequestBody Book book,@PathVariable("id") String id){
        bookService.update(book);
        return ResponseEntity.ok(book);
    }

    @DeleteMapping ("/delete/{id}")
    @ResponseStatus (HttpStatus.NO_CONTENT)
    public void deleteBook(@PathVariable int id) {
        bookService.remove(id);
    }



    @GetMapping ("/find")
    public ResponseEntity<Book> findById (@RequestParam int id) {
        Book book = bookService.findBook(id);

        if (book != null) {
            return ResponseEntity.ok(book);
        }
        else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping ("/find/all")
    public List<Book> findAll () {
        return bookService.findAll();
    }


}
