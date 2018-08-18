package com.j.service;

import com.j.dao.PetDao;
import com.j.domain.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class PetSearchService {
    @Autowired
    private PetDao petDao;

    public List<Pet> getAllPets() { return petDao.getAllPets(); }

    public List<Pet> findPetByLocation(String zipCode) {
        return getPetStream().filter(pet -> pet.getZipCode().equals(zipCode)).collect(Collectors.toList());
    }

    public List<Pet> findPetByType(String type) {
        return getPetStream().filter(pet -> pet.getType().equals(type)).collect(Collectors.toList());
    }

    public List<Pet> findPetByGender(String gender) {
        return getPetStream().filter(pet -> pet.getGender().equals(gender)).collect(Collectors.toList());
    }

    public List<Pet> findPetByTypeAndLocation(String type, String zipCode) {
        return getPetStream()
                .filter(pet -> pet.getType().equals(type))
                .filter(pet -> pet.getZipCode().equals(zipCode))
                .collect(Collectors.toList());
    }

    public List<Pet> findPetByTypeAndGender(String type, String gender) {
        return getPetStream()
                .filter(pet -> pet.getType().equals(type))
                .filter(pet -> pet.getZipCode().equals(gender))
                .collect(Collectors.toList());
    }

    public List<Pet> findPetByGenderAndLocation(String gender, String zipCode) {
        return getPetStream()
                .filter(pet -> pet.getType().equals(gender))
                .filter(pet -> pet.getZipCode().equals(zipCode))
                .collect(Collectors.toList());
    }

    public List<Pet> findPetByTypeAndLocationAndGender(String type, String zipCode, String gender) {
        return getPetStream()
                .filter(pet -> pet.getType().equals(type))
                .filter(pet -> pet.getZipCode().equals(zipCode))
                .filter(pet -> pet.getZipCode().equals(gender))
                .collect(Collectors.toList());
    }

    private Stream<Pet> getPetStream() {return petDao.getAllPets().stream();}
}
