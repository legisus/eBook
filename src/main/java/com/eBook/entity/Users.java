package com.eBook.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@NamedQueries({
        @NamedQuery(name = "Users.findAll", query = "SELECT u FROM Users u ORDER BY u.fullName"),
        @NamedQuery(name = "Users.countAll", query = "SELECT Count(*) FROM Users u")
})
public class Users implements Serializable {
    private Integer userId;
    private String email;
    private String fullName;
    private String password;

    public Users(){             // Пустой конструктор для Hibernate
    }

    public Users(String email, String fullName, String password) {    // Пользовательский конструктор создается,
        this.email = email;                                           // когда нам нужно создать новый экземпляр,
        this.fullName = fullName;                                     // но у нас еще нет ID.
        this.password = password;
    }

    @Column(name = "user_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Column(name = "full_name")
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullname) {
        this.fullName = fullname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
