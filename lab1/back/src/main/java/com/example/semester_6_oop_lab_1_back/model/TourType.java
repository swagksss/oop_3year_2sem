package com.example.semester_6_oop_lab_1_back.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TourType {
    RESORT("Resort"),
    EXCURSION("Excursion"),
    SHOPPING("Shopping");

    private final String name;
}
