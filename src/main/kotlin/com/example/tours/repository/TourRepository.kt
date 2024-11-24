package com.example.tours.repository

import com.example.tours.model.Tour
import org.springframework.data.jpa.repository.JpaRepository

interface TourRepository : JpaRepository<Tour, Long>