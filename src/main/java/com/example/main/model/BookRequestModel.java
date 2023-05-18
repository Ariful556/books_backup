package com.example.main.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class BookRequestModel
{
    private  String bookName;
    private  String authorName;
    private  String description;
    private  String Role;
}
