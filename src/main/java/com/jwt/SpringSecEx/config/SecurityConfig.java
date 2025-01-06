package com.jwt.SpringSecEx.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.CsrfConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

          return http
                  .csrf(customzer -> customzer.disable())
                  .authorizeHttpRequests(request -> request.anyRequest().authenticated())
                  .httpBasic(Customizer.withDefaults())
                  .sessionManagement(session-> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                  .build();
//        http.formLogin(Customizer.withDefaults());
    }

    @Bean
    public UserDetailsService userDetailsService(){

        UserDetails userDetails = User
                .

        return new InMemoryUserDetailsManager();
    }
}
