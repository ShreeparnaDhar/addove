package com.example.addove.Dto;

import lombok.Data;

@Data
public class LoginRequest {
    private String emailOrPhone;
    private String password;
}
