package com.univ.semester6ooplab2.service;

import com.univ.semester6ooplab2.dao.ToursDAO;
import com.univ.semester6ooplab2.entity.Tours;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.StreamSupport;

@Service
public class CustomerService {
    private final ToursDAO toursDAO;

    @Autowired
    public CustomerService(ToursDAO toursDAO) {
        this.toursDAO = toursDAO;
    }

    public List<Tours> getAllTours() {
        return StreamSupport.stream(toursDAO.findAll().spliterator(), false)
                .toList();
    }
}
