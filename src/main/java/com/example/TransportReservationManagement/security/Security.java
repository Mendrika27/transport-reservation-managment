package com.example.TransportReservationManagement.security;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.servlet.HandlerExceptionResolver;

import javax.servlet.http.HttpServletRequest;
import java.security.AuthProvider;

import static com.example.TransportReservationManagement.security.Role.ADMIN;
import static com.example.TransportReservationManagement.security.Role.CLIENTS;
import static org.springframework.http.HttpMethod.*;

@Configuration
@Slf4j
public class Security extends WebSecurityConfigurerAdapter {
    private static final String AUTHORIZATION_HEADER = "Authorization";


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .exceptionHandling()

                // authenticate
                .and()
                .anonymous()

                // authorize
                .and()
                .authorizeRequests()
                .antMatchers(OPTIONS, "/**").permitAll()
                .antMatchers("/users").authenticated()
                .antMatchers(GET, "/clients").hasAnyRole(ADMIN.getRole())
                .antMatchers(GET, "/offers").hasAnyRole(CLIENTS.getRole(), ADMIN.getRole())
                .antMatchers(GET, "/towns").hasAnyRole(CLIENTS.getRole(), ADMIN.getRole())
                .antMatchers(GET, "/reservation/*").hasAnyRole(ADMIN.getRole())
                    .antMatchers(POST, "/").hasAnyRole(ADMIN.getRole())
                    .antMatchers(POST, "/reservation").hasAnyRole(CLIENTS.getRole())
                    .antMatchers(POST, "/travel").hasAnyRole(CLIENTS.getRole())
                .antMatchers("/**").denyAll()
                .and()
                .csrf().disable()
                .formLogin().disable()
                .logout().disable();
    }

}
