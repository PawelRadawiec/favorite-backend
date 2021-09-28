package com.info.favorite.service;

import java.util.List;

public interface SystemEntityOperations<T, ID> {
    T create(T entity);
    T getById(ID id);
    List<T> getAll();
    void delete(ID id);
}
