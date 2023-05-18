package com.example.main.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String firstname;
    private  String lastname;
    private  String email;
    private  String role;
    private  String password;
    private  String address;
}
