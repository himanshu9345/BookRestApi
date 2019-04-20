package com.codingproject.controller;

import com.codingproject.BookRepository;
import com.codingproject.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
@RequestMapping("/api/v1")
public class BookController {

    @Autowired
    BookRepository bookRespository;



    @GetMapping("/book/{barcode}")
    public Book show(@PathVariable("barcode") String barcode){
        return bookRespository.findById(barcode).orElse(null);
    }

    @PostMapping("/book")
    public Book create(@RequestBody Map<String, String> body){
        String barcode = body.get("barcode");
        String title = body.get("title");
        String author=body.get("author");
        Integer no_pages=Integer.parseInt(body.get("pages"));
        System.out.println(no_pages);
        boolean read_or_not= (body.get("read").compareTo("True")==0)?true:false;
        return bookRespository.save(new Book(barcode,title,author,no_pages,read_or_not));
    }

    @DeleteMapping("book/{barcode}")
    public boolean delete(@PathVariable("barcode") String id){
//        int blogId = Integer.parseInt(id);
        bookRespository.deleteById(id);
        return true;
    }



}
