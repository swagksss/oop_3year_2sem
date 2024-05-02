package com.univ.semester6ooplab2.controller;

import com.univ.semester6ooplab2.dto.TourDto;
import com.univ.semester6ooplab2.service.TourAgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tour-agent")
public class TourAgentController {
    private final TourAgentService tourAgentService;

    @Autowired
    public TourAgentController(TourAgentService tourAgentService) {
        this.tourAgentService = tourAgentService;
    }

    @PostMapping
    public ResponseEntity<?> createTour(@RequestBody TourDto tourDto) {
        tourAgentService.createTour(tourDto);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<?> updateTour(@RequestBody TourDto tourDto) {
        tourAgentService.updateTour(tourDto);
        return ResponseEntity.ok().build();
    }
}
