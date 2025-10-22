package com.example.UberProject_AuthService.controllers;

import com.example.UberProject_AuthService.dtos.PassangerDto;
import com.example.UberProject_AuthService.dtos.PassangerSignUpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {
    @PostMapping("/signup/passanger")
    public ResponseEntity<PassangerDto> signUp (@RequestBody PassangerSignUpRequest passangerSignUpRequest){
        return null;
    }
}
