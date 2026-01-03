package com.example.addove.controller;

import org.springframework.web.bind.annotation.RestController;
import com.example.addove.Dto.*;
import com.example.addove.serviceimplementation.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/production-promotion")
@RequiredArgsConstructor
public class ProductionPromotion {

    private final ProductionPromotionService productionPromotionService;

    @PostMapping("/promote")
    public ResponseEntity<?> promoteProduction(@RequestBody ProductionPromotionRequest request) {
        return ResponseEntity.ok(productionPromotionService.promoteProduction(request));
    }
    
}
