package com.lab7.tomash.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
data class Department(
    @Id
    @Column(name = "departmentid")
    val id: Int,
    val name: String
)
