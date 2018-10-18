package com.seres.ads.ads_microservice.controller;

import com.seres.ads.ads_microservice.Service.AdsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/main")
public class AdsController {

    @Autowired
    AdsService service;

    @GetMapping(value = "")
    public Map<String, String> giveMainhAd(){
        Map<String, String> responsemap = new HashMap<>();
        responsemap.put("adImgURL", service.getRandomMainAdUrl());
        return responsemap;
    }

}
