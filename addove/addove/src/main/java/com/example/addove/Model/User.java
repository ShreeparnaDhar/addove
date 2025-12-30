package com.example.addove.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document(collection = "users")
public class User {

    @Id
    private String id;

    private String email;
    private String phone;
    private String password;

    private AuthProvider provider; // LOCAL, GOOGLE, APPLE
    private boolean enabled = true;

    private LocalDateTime createdAt = LocalDateTime.now();
}
