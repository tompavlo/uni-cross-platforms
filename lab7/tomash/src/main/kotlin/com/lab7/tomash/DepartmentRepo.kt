package com.lab7.tomash

import com.lab7.tomash.entities.Department
import dagger.Component
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface DepartmentRepo : CrudRepository<Department, Int>