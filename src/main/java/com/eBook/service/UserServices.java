package com.eBook.service;

import com.eBook.dao.UserDAO;
import com.eBook.entity.Users;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class UserServices {
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;
    private UserDAO userDAO;

    public UserServices() {
        entityManagerFactory = Persistence.createEntityManagerFactory("bookShop");
        entityManager = entityManagerFactory.createEntityManager();
        userDAO = new UserDAO(entityManager);
    }

    public List<Users> listUser() {
        return userDAO.listAll();


    }

}
