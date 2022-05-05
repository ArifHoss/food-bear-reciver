package com.foodbear.foodbear.auth;

import com.foodbear.foodbear.entities.FoodBearUser;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class FoodBearPrincipal implements UserDetails {

    private final FoodBearUser foodBearUser;

    public FoodBearPrincipal(FoodBearUser foodBearUser) {
        this.foodBearUser = foodBearUser;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return this.foodBearUser.getPassword();
    }

    @Override
    public String getUsername() {
        return this.foodBearUser.getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}