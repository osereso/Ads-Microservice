package com.seres.ads.ads_microservice.Service;

import com.seres.ads.ads_microservice.model.AdCategory;
import com.seres.ads.ads_microservice.model.Ads;
import com.seres.ads.ads_microservice.repository.AdsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class AdsService {
    private Random rnd = new Random();

    @Autowired
    AdsRepository repository;

    public String getRandomTechAdUrl() {
        List<Ads> ads = repository.getAdsByAdCategory(AdCategory.TECH);
        return ads.get(rnd.nextInt(ads.size())).getUrl();
    }

    public Ads save(Ads a) {
        return repository.save(a);
    }

    public String getRandomSportAdUrl() {
            List<Ads> ads = repository.getAdsByAdCategory(AdCategory.SPORT);
        return ads.get(rnd.nextInt(ads.size())).getUrl();
    }

    public String getRandomCultureAdUrl() {
        List<Ads> ads = repository.getAdsByAdCategory(AdCategory.CULTURE);
        return ads.get(rnd.nextInt(ads.size())).getUrl();
    }

    public String getRandomPoliticsAdUrl() {
        List<Ads> ads = repository.getAdsByAdCategory(AdCategory.POLITICS);
        return ads.get(rnd.nextInt(ads.size())).getUrl();
    }


    public String getRandomMainAdUrl() {
        List<Ads> ads = repository.findAll();
        return ads.get(rnd.nextInt(ads.size())).getUrl();
    }
}
