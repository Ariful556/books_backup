package com.example.main.service;

import com.example.main.model.UserRequestModel;
import org.springframework.http.ResponseEntity;

public abstract class UserService {
    public ResponseEntity<Object> register(UserRequestModel requestModel) {
        return null;
    }
}
