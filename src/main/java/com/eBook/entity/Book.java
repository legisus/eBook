package com.eBook.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
public class Book implements Serializable {

    @ManyToOne
    private Book book;

    public Book(){
    }

    public Book(String title, String author,
                String description, String isbn, byte[] image, Float price,
                Date published, Timestamp lastUpdateTime) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.isbn = isbn;
        this.image = image;
        this.price = price;
        this.published = published;
        this.lastUpdateTime = lastUpdateTime;
    }

    @Id
    @Column(name = "book_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookId;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "description")
    private String description;

    @Column(name = "ISBN")
    private String isbn;

    @Column(name = "image")
    private byte[] image;

    @Column(name = "price")
    private Float price;

    @Column(name = "published")
    private java.sql.Date published;

    @Column(name = "last_update_time")
    private java.sql.Timestamp lastUpdateTime;

    @Column(name = "category_id")
    private Integer categoryId;

    public Integer getBookId() {
        return this.bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public byte[] getImage() {
        return this.image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public Float getPrice() {
        return this.price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public java.sql.Date getPublished() {
        return this.published;
    }

    public void setPublished(java.sql.Date published) {
        this.published = published;
    }

    public java.sql.Timestamp getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    public void setLastUpdateTime(java.sql.Timestamp lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public Integer getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }
}
