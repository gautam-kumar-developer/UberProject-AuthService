package com.example.UberProject_AuthService.dtos;

import java.time.LocalDateTime;

public class PassangerDto {
    private String id;
    private String email;
    private String password; //encrypted
    private String name;
    private String phoneNumber;
    private LocalDateTime createdAt;
}
