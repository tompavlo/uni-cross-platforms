package com.tompavlo.myapp.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class ContentController {
    @GetMapping("/register")
    fun reg(model: Model): String{
        return "reg"
    }

    @GetMapping("/login")
    fun login(model: Model): String{
        return "login"
    }
}