package com.techrepairs.services.jpaservices;

import com.techrepairs.domain.Owner;
import com.techrepairs.repositories.OwnerRepository;
import com.techrepairs.services.interfaces.OwnerService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class OwnerJPAService implements OwnerService {

    OwnerRepository ownerRepository;

    //constructor autowiring
    public OwnerJPAService(OwnerRepository ownerRepository){
        this.ownerRepository = ownerRepository;
    }

    @Override
    public Owner findById(Long id) {
        return ownerRepository.findById(id).orElse(null);
    }

    @Override
    public Owner save(Owner owner) {
        return ownerRepository.save(owner);
    }

    @Override
    public void delete(Owner owner) {
        ownerRepository.delete(owner);
    }

    @Override
    public void deleteById(Long id) {
        ownerRepository.deleteById(id);
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners = new HashSet<>();
        ownerRepository.findAll().forEach(owners:: add);
        return owners;
    }
}
