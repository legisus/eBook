package com.eBook.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "order_deteil")
public class OrderDeteil implements Serializable {

    public OrderDeteil(){
    }

    public OrderDeteil(Integer quantity, Float subtotal) {
        this.quantity = quantity;
        this.subtotal = subtotal;
    }

    @Column(name = "order_deteil_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderDeteilId;

    @Column(name = "book_id")
    private Integer bookId;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "subtotal")
    private Float subtotal;

    public Integer getOrderDeteilId() {
        return this.orderDeteilId;
    }

    public void setOrderDeteilId(Integer orderDeteilId) {
        this.orderDeteilId = orderDeteilId;
    }

    public Integer getBookId() {
        return this.bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Float getSubtotal() {
        return this.subtotal;
    }

    public void setSubtotal(Float subtotal) {
        this.subtotal = subtotal;
    }
}
