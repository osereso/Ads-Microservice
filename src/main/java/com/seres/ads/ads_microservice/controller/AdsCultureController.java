package com.seres.ads.ads_microservice.controller;

import com.seres.ads.ads_microservice.Service.AdsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/culture")
public class AdsCultureController {

    @Autowired
    AdsService service;

    @GetMapping(value = "")
    public String addCultureAd(){
        return service.getRandomCultureAdUrl();
    }

}
