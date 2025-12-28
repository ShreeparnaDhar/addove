package com.example.addove.serviceimplementation;

import com.example.addove.Dto.*;
import com.example.addove.Model.AuthProvider;
import com.example.addove.Model.User;
import com.example.addove.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    // SIGNUP
    public String signupWithEmail(SignupRequest request) {

        if (request.getEmail() != null &&
            userRepository.findByEmail(request.getEmail()).isPresent()) {
            throw new RuntimeException("Email already exists");
        }
        if (!request.getEmail().isEmpty() && !request.getPassword().isEmpty()) {

        User user = new User();
        user.setEmail(request.getEmail());
        user.setPhone(null);
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        user.setProvider(AuthProvider.LOCAL);

        userRepository.save(user);
        return "User registered successfully";
        } else {
            throw new RuntimeException("Email and Password must not be empty");
        }
    }

    public String signupWithPhoneNumber(SignupRequest request) {

        if (request.getPhone() != null &&
            userRepository.findByPhone(request.getPhone()).isPresent()) {
            throw new RuntimeException("Phone number already exists");
        }
        if (!request.getPhone().isEmpty()) {

        User user = new User();
        user.setEmail(request.getEmail());
        user.setPhone(null);
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        user.setProvider(AuthProvider.LOCAL);

        userRepository.save(user);
        return "User registered successfully";
        } else {
            throw new RuntimeException("Email and Password must not be empty");
        }
    }

    // LOGIN
    public String login(LoginRequest request) {

        User user = request.getEmailOrPhone().contains("@")
                ? userRepository.findByEmail(request.getEmailOrPhone())
                .orElseThrow(() -> new RuntimeException("User not found"))
                : userRepository.findByPhone(request.getEmailOrPhone())
                .orElseThrow(() -> new RuntimeException("User not found"));

        if (!passwordEncoder.matches(request.getPassword(), user.getPassword())) {
            throw new RuntimeException("Invalid password");
        }

        return "Login successful";
    }

    // FORGOT PASSWORD
    public String forgotPassword(ForgotPasswordRequest request) {

        User user = userRepository.findByEmail(request.getEmail())
                .orElseThrow(() -> new RuntimeException("Email not registered"));

        // Generate reset token (later email integration)
        String resetToken = java.util.UUID.randomUUID().toString();

        return "Password reset link sent (token: " + resetToken + ")";
    }
}
