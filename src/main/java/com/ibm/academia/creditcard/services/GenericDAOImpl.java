package com.ibm.academia.creditcard.services;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;


public class GenericDAOImpl <T, R extends CrudRepository<T, Long>> implements GenericDAO<T> {

    protected final R repository;

    public GenericDAOImpl(R repository) {
        this.repository = repository;
    }

    @Override
    public T save(T entity) {
        return repository.save(entity);
    }

    @Override
    @Transactional(readOnly = true)
    public Iterable<T> getAll() {
        return repository.findAll();
    }

}
