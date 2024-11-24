package com.example.tours.model
import jakarta.persistence.*
import java.math.BigDecimal

@Entity
@Table(name = "tours")
data class Tour(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column(nullable = false)
    var name: String,

    @Column(nullable = false)
    var description: String,

    @Column(nullable = false)
    var duration: Int, // en horas

    @Column(nullable = false)
    var price: BigDecimal,

    @Column(nullable = false)
    var location: String,

    @Column(nullable = true)
    var imageUrl: String? = null // URL de la imagen del tour
)
