package com.example.addove.dao;

import java.util.List;

import com.example.addove.Model.AdvertisementModel;
import com.example.addove.Model.ProductModel;

public interface InsertProductAndAdvertisementProductionDetails {
    List<ProductModel>       InsertProductProductionDetails (List<ProductModel> list);
    List<AdvertisementModel> InsertAdvertisementSpaceDetails (List<AdvertisementModel> list);
}
