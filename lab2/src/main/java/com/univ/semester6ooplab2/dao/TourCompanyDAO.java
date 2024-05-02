package com.univ.semester6ooplab2.dao;

import com.univ.semester6ooplab2.entity.TourCompany;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TourCompanyDAO extends CrudRepository<TourCompany, Integer> {
}
