package com.example.TransportReservationManagement.security;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    CLIENTS,
    ADMIN;

    public String getRole() {
        return name();
    }

    @Override
    public String getAuthority() {
        return "ROLE_" + getRole();
    }
}
