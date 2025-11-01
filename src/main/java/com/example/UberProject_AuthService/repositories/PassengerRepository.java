package com.example.UberProject_AuthService.repositories;

import com.example.UberProject_AuthService.models.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Long> {
    public Optional<Passenger> findPassengerByEmail(String email);
}
