package com.j.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pet {
    private int id;
    private String name;
    private String type;
    private String gender;
    private String zipCode;

    private boolean okToAdopt;
    private AdoptionRecord adoptionRecord;
}
