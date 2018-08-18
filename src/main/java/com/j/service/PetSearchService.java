package com.j.service;

import com.j.dao.PetDao;
import com.j.domain.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class PetSearchService {
    @Autowired
    private PetDao petDao;

    public List<Pet> getAllPets() { return petDao.getAllPets(); }


}
