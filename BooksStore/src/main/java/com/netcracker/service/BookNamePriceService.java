package com.netcracker.service;

import com.netcracker.entity.Book;
import com.netcracker.entity.BookNamePrice;
import com.netcracker.repository.BookNamePriceRepository;
import com.netcracker.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.NamedQuery;
import java.util.List;
import java.util.Optional;

@Service
public class BookNamePriceService {

    @Autowired
    private BookNamePriceRepository bookNamePriceRepository;

    public List<BookNamePrice> findAll(){
        return bookNamePriceRepository.findBookNamePrice();
    }
    public List<BookNamePrice> findAllWindows(){
        return bookNamePriceRepository.findBookNamePriceWindows();
    }



}
