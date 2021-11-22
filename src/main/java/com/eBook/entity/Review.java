package com.eBook.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
public class Review implements Serializable {

    @ManyToOne
    public Review review;

    public Review(){
    }

    public Review(Integer bookId, Integer customerId, Integer rating,
                  String headline, String comment, Timestamp reviewTime) {
        this.bookId = bookId;
        this.customerId = customerId;
        this.rating = rating;
        this.headline = headline;
        this.comment = comment;
        this.reviewTime = reviewTime;
    }

    @Id
    @Column(name = "review_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer reviewId;

    @Column(name = "book_id")
    private Integer bookId;

    @Column(name = "customer_id")
    private Integer customerId;

    @Column(name = "rating")
    private Integer rating;

    @Column(name = "headline")
    private String headline;

    @Column(name = "comment")
    private String comment;

    @Column(name = "review_time")
    private java.sql.Timestamp reviewTime;

    public Integer getReviewId() {
        return this.reviewId;
    }

    public void setReviewId(Integer reviewId) {
        this.reviewId = reviewId;
    }

    public Integer getBookId() {
        return this.bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getRating() {
        return this.rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getHeadline() {
        return this.headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public java.sql.Timestamp getReviewTime() {
        return this.reviewTime;
    }

    public void setReviewTime(java.sql.Timestamp reviewTime) {
        this.reviewTime = reviewTime;
    }
}
