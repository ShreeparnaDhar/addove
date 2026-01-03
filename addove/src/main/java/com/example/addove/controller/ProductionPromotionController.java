    package com.example.addove.controller;

import com.example.addove.Dto.*;
import com.example.addove.service.ProductPromotionService;
import com.example.addove.serviceimplementation.*;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
// import com.example.addove.service.ProductionPromotionService;

@RestController
@RequestMapping("/api/production-promotion")
public class ProductionPromotionController {
    @Autowired
    private  ProductPromotionService productionPromotionService ;

    @PostMapping("/promote")
    public ResponseEntity<?> promoteProduction(@RequestBody ProductionPromotionRequest request) {
        return ResponseEntity.ok(productionPromotionService.CreateProductProduction(request.getProductProductionList()));
    }
    
}
