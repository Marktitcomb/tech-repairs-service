package com.techrepairs.services.map;

import com.techrepairs.domain.BaseEntity;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AbstractMapService <T extends BaseEntity,ID extends Long>{

    protected Map<ID, T> map = new HashMap<>();

    Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    T findByID(ID id){
        return map.get(id);
    }

    T save(T object){
        if(object != null){
            if(object.getId() == null){
                object.setId(getNewId());
            }
            else{
                map.put((ID) object.getId(), object);
            }
        }
        else{
            throw new RuntimeException("Null object provided to save function");
        }
        return object;
    }

    void deleteById(ID id){
        map.remove(id);
    }

    void delete(T object){
        if(object != null){
            if(object.getId() != null){
                deleteById((ID) object.getId());
            }
        }else{
            throw new RuntimeException("Object to delete is null");
        }
        //this is a better way of doing it
        map.entrySet().removeIf(obj -> obj.getValue().equals(object));
    }


    private Long getNewId(){
        //get the map
        //get the largest key -> by finding the size
        //add one to this and return
        if(null == map){
            return 0L;
        }
        int mapSize = map.size();
        Long newId = Long.valueOf(++mapSize);
        return newId;
    }

}
