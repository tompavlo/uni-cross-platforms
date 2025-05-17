package com.tompavlo.myapp.controller

import com.tompavlo.myapp.Roles
import com.tompavlo.myapp.dto.RegisterDto
import com.tompavlo.myapp.entity.User
import com.tompavlo.myapp.entity.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class SigningController {

    @Autowired
    private lateinit var userRepository: UserRepository

    @Autowired
    private lateinit var passwordEncoder: PasswordEncoder

    @PostMapping(value = ["/register"], consumes = ["application/json"])
    fun createUser(@RequestBody request: RegisterDto): User{
        val encodedPassword = passwordEncoder.encode(request.password)
        val user = User(0, request.name, encodedPassword, Roles.CLIENT)
        return userRepository.save(user)

    }
}
