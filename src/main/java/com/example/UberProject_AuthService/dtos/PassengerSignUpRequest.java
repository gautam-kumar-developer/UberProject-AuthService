package com.example.UberProject_AuthService.dtos;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PassengerSignUpRequest {
    private String email;
    private String password;
    private String name;
    private String phoneNumber;
}
