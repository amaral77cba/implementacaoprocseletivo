package com.amarildo.seletivo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http
                // Desabilita CSRF (necessário para POST/PUT/DELETE sem login)
                .csrf(csrf -> csrf.disable())

                // Libera todas as requisições
                .authorizeHttpRequests(auth -> auth
                        .anyRequest().permitAll()
                )

                // Desabilita login padrão
                .httpBasic(Customizer.withDefaults())
                .formLogin(form -> form.disable());

        return http.build();
    }
}
