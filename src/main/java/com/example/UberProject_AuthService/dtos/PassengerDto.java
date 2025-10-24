package com.example.UberProject_AuthService.dtos;

import com.example.UberProject_AuthService.models.Passenger;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PassengerDto {
    private String id;
    private String email;
    private String password; //encrypted
    private String name;
    private String phoneNumber;
    private Date createdAt;

    public static PassengerDto from(Passenger passenger) {
        PassengerDto dto = PassengerDto.builder()
                .id(passenger.getId().toString())
                .email(passenger.getEmail())
                .name(passenger.getName())
                .password(passenger.getPassword())
                .phoneNumber(passenger.getPhoneNumber())
                .createdAt(passenger.getCreatedAt())
                .build();

        return dto;
    }

}
