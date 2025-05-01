package com.lab7.tomash

import com.lab7.tomash.entities.Employee
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface EmployeeRepo : CrudRepository<Employee, Int>