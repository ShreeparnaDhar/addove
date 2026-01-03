package com.example.addove.service;

import java.util.List;

import com.example.addove.Model.AdvertisementModel;
import com.example.addove.Model.ProductModel;

public interface ProductPromotionService {
    List<ProductModel>       CreateProductProduction (List<ProductModel> list);
    List<String> CreateAdvertisementSpace                            (List<AdvertisementModel> list);
    
} 
