package com.example.tours.service

import com.example.tours.model.Tour
import com.example.tours.repository.TourRepository
import org.springframework.stereotype.Service
import org.springframework.beans.factory.annotation.Autowired

@Service
class TourService(private val tourRepository: TourRepository) {

    fun getAllTours(): List<Tour> = tourRepository.findAll()

    fun getTourById(id: Long): Tour = tourRepository.findById(id)
        .orElseThrow { NoSuchElementException("Tour no encontrado con id: $id") }

    fun createTour(tour: Tour): Tour = tourRepository.save(tour)

    fun updateTour(id: Long, tourDetails: Tour): Tour {
        val existingTour = getTourById(id)
        existingTour.apply {
            name = tourDetails.name
            description = tourDetails.description
            duration = tourDetails.duration
            price = tourDetails.price
            location = tourDetails.location
            imageUrl = tourDetails.imageUrl
        }
        return tourRepository.save(existingTour)
    }

    fun updateTourImage(id: Long, imageUrl: String): Tour {
        val existingTour = getTourById(id)
        existingTour.imageUrl = imageUrl
        return tourRepository.save(existingTour)
    }

    fun deleteTour(id: Long) {
        if (tourRepository.existsById(id)) {
            tourRepository.deleteById(id)
        } else {
            throw NoSuchElementException("Tour no encontrado con id: $id")
        }
    }
}