package com.techrepairs.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AbstractMapService <T,ID>{

    protected Map<ID, T> map = new HashMap<>();

    Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    T findByID(ID id){
        return map.get(id);
    }

    //save, delete by id and delete

    // then you want to do a owner service map that extends this and also implements the Crud service


}
