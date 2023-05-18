package com.example.main.model;

import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class UserRequestModel
{
    private  String firstname;
    private  String lastname;
    private  String email;
    private  String password;
    private  String address;
    private  String Role;
}