package com.example.addove.Repository;

import com.example.addove.Model.AdvertisementModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AdvertisementRepository
        extends MongoRepository<AdvertisementModel, String> {
}
