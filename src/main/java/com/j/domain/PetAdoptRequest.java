package com.j.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @Getter
@NoArgsConstructor
@AllArgsConstructor
public class PetAdoptRequest {
    private int petId;
    private AdoptionRecord adoptionRecord;
}
