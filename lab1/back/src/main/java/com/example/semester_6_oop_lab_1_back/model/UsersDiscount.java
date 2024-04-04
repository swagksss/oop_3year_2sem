package com.example.semester_6_oop_lab_1_back.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsersDiscount {
    private int id;
    private int userId;
    private int tourCompanyId;
    private int discount;
}