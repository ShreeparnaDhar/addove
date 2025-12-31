package com.example.addove.Dto;

import lombok.Data;

@Data
public class SignupRequest {
    @NotBlank(message = "Email is required")
    @Email
    private String email;
    private String phone;
    @NotBlank(message = "Password is required")
    private String password;
}

