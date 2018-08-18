package com.j.controller;

import com.j.domain.Pet;
import com.j.service.PetSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pets")
public class PetController {
    @Autowired
    private PetSearchService petSearchService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Pet> getAllPets() {
        return petSearchService.getAllPets();
    }

    @RequestMapping(value = "/location", method = RequestMethod.GET)
    public List<Pet> getPetsByLocation(@RequestParam("zip") String zip) {
        return petSearchService.findPetByLocation(zip);
    }

    @RequestMapping(value = "/type", method = RequestMethod.GET)
    public List<Pet> getPetsByType(@RequestParam("type") String type) {
        return petSearchService.findPetByType(type);
    }

    @RequestMapping(value = "/gender", method = RequestMethod.GET)
    public List<Pet> getPetsByGender(@RequestParam("gender") String gender) {
        return petSearchService.findPetByGender(gender);
    }

    @RequestMapping(value = "/typeAndLocation", method = RequestMethod.GET)
    public List<Pet> getPetByTypeAndLocation(@RequestParam("type") String type,
                                              @RequestParam("zip") String zip) {
        return petSearchService.findPetByTypeAndLocation(type, zip);
    }

    @RequestMapping(value = "/typeAndGender", method = RequestMethod.GET)
    public List<Pet> getPetsByTypeAndGender(@RequestParam("type") String type,
                                              @RequestParam("gender") String gender) {
        return petSearchService.findPetByTypeAndGender(type, gender);
    }

    @RequestMapping(value = "/genderAndLocation", method = RequestMethod.GET)
    public List<Pet> getPetsByGenderAndLocation(@RequestParam("gender") String gender,
                                              @RequestParam("location") String zip) {
        return petSearchService.findPetByGenderAndLocation(gender, zip);
    }

    @RequestMapping(value = "/typeAndLocationAndGender", method = RequestMethod.GET)
    public List<Pet> getPetsByTypeAndLocationAndGender(@RequestParam("type") String type,
                                              @RequestParam("zip") String zip,
                                              @RequestParam("gender") String gender) {
        return petSearchService.findPetByTypeAndLocationAndGender(type, zip, gender);
    }
}
