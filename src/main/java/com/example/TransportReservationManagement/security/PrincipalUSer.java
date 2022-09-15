package com.example.TransportReservationManagement.security;

import com.example.TransportReservationManagement.model.User;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

@Getter
@AllArgsConstructor
@ToString
public class PrincipalUSer implements UserDetails {

    private final User user;
    private final String bearer;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(Role.valueOf(user.getRole().toString()));
    }

    @Override
    public String getPassword() {
        return bearer;
    }

    @Override
    public String getUsername() {
        return user.getLastName();
    }

    @Override
    public boolean isAccountNonExpired() {
        return isEnabled();
    }

    @Override
    public boolean isAccountNonLocked() {
        return isEnabled();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return isEnabled();
    }

    @Override
    public boolean isEnabled() {
        return Objects.equals(User.Role.CLIENTS, user.getRole());
    }


    public int getUserId() {
        return user.getId();
    }

    public String getRole() {
        return user.getRole().toString();
    }
}
