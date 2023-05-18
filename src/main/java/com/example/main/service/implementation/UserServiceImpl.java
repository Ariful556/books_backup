package com.example.main.service.implementation;

import com.example.main.entity.UserEntity;
import com.example.main.model.UserRequestModel;
import com.example.main.repository.UserRepository;
import com.example.main.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl extends UserService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }

    public ResponseEntity<Object> register(UserRequestModel requestModel) {
        UserEntity userEntity = UserEntity.builder()
                .email(requestModel.getEmail())
                .role(requestModel.getRole())
                .address(requestModel.getAddress())
                .firstname(requestModel.getFirstname())
                .lastname(requestModel.getLastname())
                .password(requestModel.getPassword())
                .build();
        UserEntity savedUserEntity = userRepository.save(userEntity);
        return new ResponseEntity<>(savedUserEntity, HttpStatus.CREATED);
    }
}

