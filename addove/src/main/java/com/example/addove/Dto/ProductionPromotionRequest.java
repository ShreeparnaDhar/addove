package com.example.addove.Dto;
import java.util.List;
import lombok.Data;
import com.example.addove.Model.AdvertisementModel;
import com.example.addove.Model.ProductModel;

@Data
public class ProductionPromotionRequest {
    private List<ProductModel>          ProductProductionList;
    private List<AdvertisementModel>    AdvertisementSpaceList;
    
}
