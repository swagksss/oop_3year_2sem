package com.univ.semester6ooplab2.dao;

import com.univ.semester6ooplab2.entity.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersDAO extends CrudRepository<Users, Integer> {
}
