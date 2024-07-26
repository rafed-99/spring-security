package com.rafed.security.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Permission {

    ADMIN_READ("admin::read"),
    ADMIN_POST("admin::post"),
    ADMIN_UPDATE("admin::update"),
    ADMIN_DELETE("admin::delete"),
    MANAGER_READ("manager::read"),
    MANAGER_POST("manager::post"),
    MANAGER_UPDATE("manager::update"),
    MANAGER_DELETE("manager::delete");

    @Getter
    private final String permission;
}
