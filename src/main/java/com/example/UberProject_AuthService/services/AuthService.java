package com.example.UberProject_AuthService.services;

import com.example.UberProject_AuthService.dtos.PassengerDto;
import com.example.UberProject_AuthService.dtos.PassengerSignUpRequest;
import com.example.UberProject_AuthService.models.Passenger;
import com.example.UberProject_AuthService.repositories.PassengerRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final PassengerRepository passengerRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public AuthService(PassengerRepository passengerRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.passengerRepository = passengerRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    public PassengerDto signupPassenger(PassengerSignUpRequest passengerSignUpRequest) {
        Passenger passenger = Passenger.builder()
                .name(passengerSignUpRequest.getName())
                .email(passengerSignUpRequest.getEmail())
                .phoneNumber(passengerSignUpRequest.getPhoneNumber())
                .password(bCryptPasswordEncoder.encode(passengerSignUpRequest.getPassword())) // TODO => Encrypt the password
                .build();

        passengerRepository.save(passenger);
        new PassengerDto();
        return PassengerDto.from(passenger);
    }

}
