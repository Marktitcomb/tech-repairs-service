package com.techrepairs.services.map;

import com.techrepairs.domain.Owner;
import com.techrepairs.services.OwnerService;

import java.util.Set;


public class OwnerMappingService extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Set<Owner> findAll(){
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    public Owner findByLastName(String lastName){
        return this.findAll()
                .stream()
                .filter(owner -> owner.equals(lastName))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Owner findById(Long id){
        return super.findByID(id);
    }

    @Override
    public Owner save(Owner owner){
        return super.save(owner);
    }

    @Override
    public void delete(Owner owner){
        super.delete(owner);
    }


}
