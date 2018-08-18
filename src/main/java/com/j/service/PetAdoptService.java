package com.j.service;

import com.j.dao.PetDao;
import com.j.domain.PetAdoptRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PetAdoptService {
    @Autowired
    private PetDao petDao;

    //Think
    public void adoptPet(PetAdoptRequest petAdoptRequest) {

    }
}
