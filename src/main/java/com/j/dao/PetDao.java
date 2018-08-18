package com.j.dao;

import com.j.domain.Pet;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class PetDao {
    private static List<Pet> petList;
    
    static {
        petList = new ArrayList<Pet>(){
            {
                add(new Pet(1, "Snoopy", "dog", "male", "97205", true, null));
                add(new Pet(2, "Willow", "cat", "female", "97205", true, null));
                add(new Pet(3, "Yoda", "dog", "neutered", "90210", true, null));
                add(new Pet(4, "Lassie", "dog", "spayed", "90210", true, null));
                add(new Pet(5, "Fluffly", "rabbit", "female", "97215", true, null));
                add(new Pet(6, "Rhea", "cat", "spayed", "97215", true, null));
                add(new Pet(7, "Lese", "cat", "spayed", "97215", true, null));
                add(new Pet(8, "Rascal", "dog", "male", "97205", true, null));
            }
        };
    }

    public List<Pet> getAllPets() {return petList;}

    // Thinking about Optional<Pet> here.
    public Pet findPetById(int id) {
        return petList.stream().filter(pet -> pet.getId() == id).collect(Collectors.toList()).get(0);
    }
}
