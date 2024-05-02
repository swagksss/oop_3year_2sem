package com.univ.semester6ooplab2.controller;

import com.univ.semester6ooplab2.dto.UserTourDto;
import com.univ.semester6ooplab2.service.CustomerCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cart")
public class CustomerCartController {
    private CustomerCartService customerCartService;

    @Autowired
    public CustomerCartController(CustomerCartService customerCartService) {
        this.customerCartService = customerCartService;
    }

    @PostMapping
    public ResponseEntity<?> customerAddTourToCart(@RequestBody UserTourDto userTourDto) {
        customerCartService.customerAddTourToCart(userTourDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<?> getAllToursFromCart(@RequestParam Integer userId) {
        var tours = customerCartService.getAllToursFromCart(userId);
        return ResponseEntity.ok(tours);
    }

    @DeleteMapping
    public ResponseEntity<?> deleteTourFromCart(@RequestParam Integer userId,
                                                @RequestParam Integer tourId) {
        customerCartService.deleteTourFromCart(userId, tourId);
        return ResponseEntity.ok().build();
    }
}
