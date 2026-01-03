 package com.example.addove.serviceimplementation;

import com.example.addove.Dto.*;
import com.example.addove.Model.AuthProvider;
import com.example.addove.Model.User;
import com.example.addove.Repository.UserRepository;
import com.example.addove.service.ProductPromotionService;
import com.example.addove.Model.AdvertisementModel;
import com.example.addove.Model.ProductModel;

import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class ProductPromotionServiceImpl implements ProductPromotionService {

    @Override
    public List<ProductModel> CreateProductProduction(List<ProductModel> list) {
        
        if (list.isEmpty()) {
            throw new RuntimeException("No Products Available");
        }
        else{
                
        }


        
        return null;
    }

    @Override
    public List<String> CreateAdvertisementSpace(List<AdvertisementModel> list) {
        // TODO Auto-generated method stub
        return null;
    }
}