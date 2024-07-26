package com.rafed.security.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static com.rafed.security.user.Permission.*;

@RequiredArgsConstructor

public enum Role {

    USER(Collections.emptySet()),
    ADMIN(Set.of(
            ADMIN_READ,ADMIN_DELETE,ADMIN_UPDATE,ADMIN_POST,MANAGER_UPDATE,MANAGER_DELETE,MANAGER_POST,MANAGER_READ
    )),
    MANAGER(Set.of(
            MANAGER_UPDATE,MANAGER_DELETE,MANAGER_POST,MANAGER_READ
    )) ;

    @Getter
    private final Set<Permission> permissions;

    public List<SimpleGrantedAuthority> getAuthorities() {
        var authorities = getPermissions()
                .stream()
                .map(permission -> new SimpleGrantedAuthority(permission.getPermission()))
                .collect(Collectors.toList());
        authorities.add(new SimpleGrantedAuthority("ROLE_" + this.name()));
        return authorities;
    }


}
