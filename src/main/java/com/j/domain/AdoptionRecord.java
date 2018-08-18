package com.j.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class AdoptionRecord {
    private Adopter adopter;
    private Double adoptionFee;
    private String adoptionDate;
}
