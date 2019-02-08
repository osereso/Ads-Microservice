package com.seres.ads.ads_microservice.repository;

import com.seres.ads.ads_microservice.model.AdCategory;
import com.seres.ads.ads_microservice.model.Ads;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdsRepository extends JpaRepository<Ads, Long> {

    List<Ads> findAll();

    List<Ads> getAdsByAdCategory(AdCategory category);

    // int countDistinctByAdCategory(AdCategory category);



}
