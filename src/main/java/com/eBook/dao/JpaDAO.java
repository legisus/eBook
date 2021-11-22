package com.eBook.dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class JpaDAO<T> {

    protected EntityManager entityManager;

    public JpaDAO(EntityManager entityManager) {
        super();
        this.entityManager = entityManager;
    }

    public T create(T t) {
        entityManager.getTransaction().begin();

        entityManager.persist(t);
        entityManager.flush();
        entityManager.refresh(t);

        entityManager.getTransaction().commit();
        return t;
    }


    public T update (T t){
        entityManager.getTransaction().begin();
        t = entityManager.merge(t);
        entityManager.getTransaction().commit();
        return t;
    }

    public T find(Class<T> type, Object id) {
        T t = entityManager.find(type, id);

        if(t != null){
            entityManager.refresh(t);
        }

        return t;
    }

    public void delete (Class<T> type, Object id){
        entityManager.getTransaction().begin();

        Object reference = entityManager.getReference(type,id);
        entityManager.remove(reference);

        entityManager.getTransaction().commit();
    }

    public List<T> findWithNameQuery(String queryName){
        Query query = entityManager.createNamedQuery(queryName);
        return query.getResultList();
    }

    public long countWithNamedQuery(String queryName) {
        Query query = entityManager.createNamedQuery(queryName);
        return (long) query.getSingleResult();
    }
}
