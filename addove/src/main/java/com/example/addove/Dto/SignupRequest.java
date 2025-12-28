package com.example.addove.Dto;

import lombok.Data;

@Data
public class SignupRequest {
    private String email;
    private String phone;
    private String password;
}
