package com.tompavlo.myapp.service

import com.tompavlo.myapp.entity.UserRepository
import com.tompavlo.myapp.entity.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsByNameServiceWrapper
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service

@Service
class UserService : UserDetailsService {

    @Autowired
    private lateinit var userRepository: UserRepository

    override fun loadUserByUsername(username: String): UserDetails? {
        val user = userRepository.findByName(username) ?: throw UsernameNotFoundException(
            "User with the name $username wasn't found"
        )

        return org.springframework.security.core.userdetails.User(
            user.name,
            user.password,
            listOf(SimpleGrantedAuthority(user.role.name))
        )
    }
}