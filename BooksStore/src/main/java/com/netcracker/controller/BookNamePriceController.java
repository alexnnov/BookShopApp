package com.netcracker.controller;

import com.netcracker.entity.BookNamePrice;
import com.netcracker.service.BookNamePriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/booksname&price")
public class BookNamePriceController {

    @Autowired
    private BookNamePriceService bookNamePriceService;

    @GetMapping ("/find/all")
    public List<BookNamePrice> findAll () {
        return bookNamePriceService.findAll();
    }

    @GetMapping ("/find/allWindows")
    public List<BookNamePrice> findAllWindows () {
        return bookNamePriceService.findAllWindows();
    }


}
