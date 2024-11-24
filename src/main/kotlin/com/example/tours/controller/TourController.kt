package com.example.tours.controller

import com.example.tours.model.Tour
import com.example.tours.service.TourService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/tours")
@CrossOrigin(origins = ["http://localhost:3000"])
class TourController(private val tourService: TourService) {

    @GetMapping
    fun getAllTours(): ResponseEntity<List<Tour>> =
        ResponseEntity.ok(tourService.getAllTours())

    @GetMapping("/{id}")
    fun getTourById(@PathVariable id: Long): ResponseEntity<Tour> =
        ResponseEntity.ok(tourService.getTourById(id))

    @PostMapping
    fun createTour(@RequestBody tour: Tour): ResponseEntity<Tour> =
        ResponseEntity(tourService.createTour(tour), HttpStatus.CREATED)

    @PutMapping("/{id}")
    fun updateTour(
        @PathVariable id: Long,
        @RequestBody tourDetails: Tour
    ): ResponseEntity<Tour> =
        ResponseEntity.ok(tourService.updateTour(id, tourDetails))

    @PutMapping("/{id}/image")
    fun updateTourImage(@PathVariable id: Long, @RequestBody imageUrl: String): ResponseEntity<Tour> {
        val updatedTour = tourService.updateTourImage(id, imageUrl)
        return ResponseEntity.ok(updatedTour)
    }

    @DeleteMapping("/{id}")
    fun deleteTour(@PathVariable id: Long): ResponseEntity<Unit> =
        ResponseEntity(tourService.deleteTour(id), HttpStatus.NO_CONTENT)
}