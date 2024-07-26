package com.rafed.security.demo;

import jakarta.annotation.security.RolesAllowed;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/admin")
@PreAuthorize("hasRole('ADMIN')")
//@RolesAllowed("")
public class AdminController {

    @GetMapping
    @PreAuthorize("hasAuthority('admin::read')")
    public ResponseEntity<String> get(){
        return ResponseEntity.ok("GET:: Hello from admin");
    }

    @PostMapping
    @PreAuthorize("hasAuthority('admin::post')")
    public ResponseEntity<String> post(){
        return ResponseEntity.ok("POST:: Hello from admin");
    }

    @DeleteMapping
    @PreAuthorize("hasAuthority('admin::delete')")
    public ResponseEntity<String> delete(){
        return ResponseEntity.ok("DELETE:: Hello from admin");
    }

    @PutMapping
    @PreAuthorize("hasAuthority('admin::update')")
    public ResponseEntity<String> put(){
        return ResponseEntity.ok("PUT:: Hello from admin");
    }

}
