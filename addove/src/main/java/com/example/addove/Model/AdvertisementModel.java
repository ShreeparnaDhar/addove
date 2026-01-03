package com.example.addove.Model;

import java.sql.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdvertisementModel {
    String adTitle;
    String productPromotionType;
    String adSpaces;
    String adSpaceDescription;
    String productPromotionFormat;
    String Region_City;
    String category;
    String targetAuxdienceAge;
    String MonthlyTraffic;
    String AdditonalRequirements;
    Date startDate;
    Date endDate;
    List<BudgetAndTime> budgetAndTime;

}
