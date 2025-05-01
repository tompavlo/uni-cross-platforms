package com.lab7.tomash

import com.lab7.tomash.entities.Department
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class Controller(
    private val departmentRepo: DepartmentRepo,
    private val employeeRepo: EmployeeRepo
) {
    @GetMapping("/")
    fun index(model: Model): String{
        val departments = departmentRepo.findAll()
        val employees = employeeRepo.findAll()
        model.addAttribute("departments", departments)
        model.addAttribute("employees", employees)
        return "index"
    }
}