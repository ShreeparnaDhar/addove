package com.example.addove.controller;

import com.example.addove.Dto.*;
import com.example.addove.serviceimplementation.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/signup")
    public ResponseEntity<?> signupWithEmail(@RequestBody SignupRequest request) {
        return ResponseEntity.ok(authService.signupWithEmail(request));
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest request) {
        return ResponseEntity.ok(authService.login(request));
    }

    @PostMapping("/forgot-password")
    public ResponseEntity<?> forgotPassword(@RequestBody ForgotPasswordRequest request) {
        return ResponseEntity.ok(authService.forgotPassword(request));
    }

    // OAuth placeholders
    @PostMapping("/google")
    public ResponseEntity<?> googleLogin() {
        return ResponseEntity.ok("Google login integration pending");
    }

    @PostMapping("/apple")
    public ResponseEntity<?> appleLogin() {
        return ResponseEntity.ok("Apple login integration pending");
    }
}
