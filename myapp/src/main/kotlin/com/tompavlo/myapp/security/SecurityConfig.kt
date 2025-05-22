package com.tompavlo.myapp.security

import com.tompavlo.myapp.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.authentication.AuthenticationProvider
import org.springframework.security.authentication.dao.DaoAuthenticationProvider
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.security.web.SecurityFilterChain

@Configuration
@EnableWebSecurity
class SecurityConfig(
    private val successLoginHandler: SuccessLoginHandler,
    @Autowired
    private var userService: UserService
) {


    @Bean
    fun userDetailService(): UserDetailsService {
        return userService
    }

    @Bean
    fun authenticationProvider(): AuthenticationProvider {
        val provider = DaoAuthenticationProvider()
        provider.setUserDetailsService(userService)
        provider.setPasswordEncoder(passwordEncoder())
        return provider
    }

    @Bean
    fun passwordEncoder(): PasswordEncoder {
        return BCryptPasswordEncoder()
    }

    @Bean
    fun securityFilterChain(http: HttpSecurity): SecurityFilterChain {
        http
            .csrf { it.disable() }
            .authenticationProvider(authenticationProvider())
            .authorizeHttpRequests {
                it
                    .requestMatchers("/register", "/login").permitAll()
                    .requestMatchers("/client/**").hasRole("CLIENT")
                    .requestMatchers("/accountant/**").hasRole("ACCOUNTANT")
                    .anyRequest().authenticated()
            }
            .formLogin {
                it.loginPage("/login")
                    .successHandler(successLoginHandler)
                    .permitAll()
            }
            .logout { it.logoutSuccessUrl("/login") }
        return http.build()
    }
}