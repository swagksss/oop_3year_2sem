package com.univ.semester6ooplab2.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDiscountDto {
    private Integer id;
    private Integer userId;
    private Integer tourCompanyId;
    private Integer discount;
}
