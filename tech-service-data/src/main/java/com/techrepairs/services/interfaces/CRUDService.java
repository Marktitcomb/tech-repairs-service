package com.techrepairs.services.interfaces;

import java.util.Set;

/**
 * Not a CRUD repo but a crud service
 *
 *
 * Basically explicitly telling a developer how it works and that it follows the CRUD repo format
 * */

public interface CRUDService<T, Long> {

    Set<T> findAll();

    T findById(Long id);

    T save(T object);

    void delete(T object);

    void deleteById(Long id);


}
