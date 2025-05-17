package com.tompavlo.myapp.entity

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : CrudRepository<User, Int>{

    fun findByName(username: String): User?
}