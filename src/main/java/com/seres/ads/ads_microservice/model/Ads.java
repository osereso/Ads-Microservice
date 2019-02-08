package com.seres.ads.ads_microservice.model;


import javax.persistence.*;

@Entity
public class Ads {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String url;

    @Enumerated(EnumType.STRING)
    AdCategory adCategory;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setAdCategory(AdCategory adCategory) {
        this.adCategory = adCategory;
    }

}
