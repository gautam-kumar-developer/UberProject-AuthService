package com.example.UberProject_AuthService.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity // to represent a class as table
@Table(name = "Booking Review") //to config the table name
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) // Default Strategy is InheritanceType.Single_Table
public class Review extends BaseModel {

    @Column(nullable = false) // @Column to add various column related property
    private String content;

    private Double rating;
}
