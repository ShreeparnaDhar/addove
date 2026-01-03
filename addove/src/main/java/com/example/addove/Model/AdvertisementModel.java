package com.example.addove.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "advertisement")   
public class AdvertisementModel {

    @Id
    private String id;                     
    private String adTitle;
    private String productPromotionType;
    private String adSpaces;
    private String adSpaceDescription;
    private String productPromotionFormat;
    private String regionCity;
    private String category;
    private String targetAudienceAge;
    private String monthlyTraffic;
    private String additionalRequirements;
    private Date startDate;
    private Date endDate;
    private List<BudgetAndTime> budgetAndTime;
}
