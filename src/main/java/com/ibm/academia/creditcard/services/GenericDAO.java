package com.ibm.academia.creditcard.services;


public interface GenericDAO <T> {
    T save(T entity);
    Iterable<T> getAll();
}
