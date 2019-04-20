package com.codingproject.models;

import javax.persistence.*;

@Entity
@Table(name="books")
public class Book {
    @Id
    private String barcode;


    private String title;
    private String author;
    private  Integer no_pages;
    private boolean read_or_not;

    public Book(){}

    public Book(String title, String author,Integer no_pages,boolean read_or_not) {
        this.setTitle(title);
        this.setAuthor(author);
        this.setNo_pages(no_pages);
        this.setRead_or_not(read_or_not);


    }
    public Book(String id,String title,String author,Integer no_pages,boolean read_or_not){

        this.setTitle(title);
        this.setAuthor(author);
        this.setNo_pages(no_pages);
        this.setRead_or_not(read_or_not);
        this.setBarcode(id);

    }
    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getNo_pages() {
        return no_pages;
    }

    public void setNo_pages(Integer no_pages) {
        this.no_pages = no_pages;
    }

    public boolean isRead_or_not() {
        return read_or_not;
    }

    public void setRead_or_not(boolean read_or_not) {
        this.read_or_not = read_or_not;
    }

    @Override
    public String toString(){
        return "Books{"+"id="+barcode+", title='"+title+"\'"+", author='"+author+"\'"+", no_pages='"+no_pages+'\''+", read_or_not='"+read_or_not+'\''+"}";
    }

}
