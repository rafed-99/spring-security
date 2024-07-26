package com.rafed.security.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/management")
//@RolesAllowed("")
public class ManagerController {

    @GetMapping
    public ResponseEntity<String> get(){
        return ResponseEntity.ok("GET:: Hello from manager");
    }

    @PostMapping
    public ResponseEntity<String> post(){
        return ResponseEntity.ok("POST:: Hello from manager");
    }

    @DeleteMapping
    public ResponseEntity<String> delete(){
        return ResponseEntity.ok("DELETE:: Hello from manager");
    }

    @PutMapping
    public ResponseEntity<String> put(){
        return ResponseEntity.ok("PUT:: Hello from manager");
    }
}
