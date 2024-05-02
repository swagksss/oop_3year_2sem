package com.univ.semester6ooplab2.dao;

import com.univ.semester6ooplab2.entity.UsersDiscount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersDiscountDAO extends CrudRepository<UsersDiscount, Integer> {
}
