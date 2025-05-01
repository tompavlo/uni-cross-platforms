package com.lab7.tomash.entities

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne

@Entity
data class Employee(
    @Id
    val id: Int,
    val name: String,
    @ManyToOne
    @JoinColumn(name = "departmentid" )
    var department: Department
)
