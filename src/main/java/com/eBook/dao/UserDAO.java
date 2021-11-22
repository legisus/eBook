package com.eBook.dao;

import com.eBook.entity.Users;
import org.apache.poi.ss.formula.functions.T;

import javax.persistence.EntityManager;
import java.util.List;

public class UserDAO extends JpaDAO<Users> implements GenericDAO<Users>{

    public UserDAO(EntityManager entityManager){
        super(entityManager);
    }

    @Override
    public Users create(Users t) {      //Users user на видео
        return super.create(t);
    }

    @Override
    public Users update(Users t) {
        return super.update(t);
    }

    @Override
    public Users get(Object userId) {
        return super.find(Users.class, userId);
    }

    @Override
    public void delete(Object userId) {
    super.delete(Users.class, userId);
    }

    @Override
    public List<Users> listAll() {
        return super.findWithNameQuery("Users.findAll");
    }

    @Override
    public long count() {
        return super.countWithNamedQuery("Users.countAll");
    }
}
