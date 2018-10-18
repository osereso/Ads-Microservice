package com.seres.ads.ads_microservice.init;

import com.seres.ads.ads_microservice.Service.AdsService;
import com.seres.ads.ads_microservice.model.AdCategory;
import com.seres.ads.ads_microservice.model.Ads;
import org.springframework.stereotype.Component;

@Component
public class Initializer {

    public Initializer(AdsService s) {
        Ads ad1 = new Ads();
        ad1.setUrl("https://img66.anypromo.com/WebSite2016/Category/2123/Technology-1200x250.jpg");
        ad1.setAdCategory(AdCategory.TECH);

        Ads ad2 = new Ads();
        ad2.setUrl("http://facilitiessurvey.com/wp-content/uploads/2016/06/product-banners-cmms-1200x250.jpg");
        ad2.setAdCategory(AdCategory.TECH);

        Ads ad3 = new Ads();
        ad3.setUrl("https://www.runpacers.com/wp/wp-content/uploads/2016/11/PaceNation-PodcastBanner-1200x250.jpg");
        ad3.setAdCategory(AdCategory.TECH);

        Ads ad4 = new Ads();
        ad4.setUrl("https://www.loudrumor.com/wp-content/uploads/lr-25VideoTools-1200x250.jpg");
        ad4.setAdCategory(AdCategory.SPORT);

        Ads ad5 = new Ads();
        ad5.setUrl("https://s3.envato.com/files/156746004/970x250.jpg");
        ad5.setAdCategory(AdCategory.SPORT);

        Ads ad6 = new Ads();
        ad6.setUrl("http://www.ambrosiansnooker.com/wordpress/wp-content/uploads/2016/10/BANNER-1200X250-08.jpg");
        ad6.setAdCategory(AdCategory.SPORT);

        Ads ad7 = new Ads();
        ad7.setUrl("http://icotv.org/wp-content/uploads/2016/06/Banner-Ramadan-Events-1200x250.jpg");
        ad7.setAdCategory(AdCategory.CULTURE);

        Ads ad8 = new Ads();
        ad8.setUrl("http://kore.am/wp-content/uploads/2018/10/New-Amenities-KOR-2018-Kore.am-1200x250.gif");
        ad8.setAdCategory(AdCategory.CULTURE);

        Ads ad9 = new Ads();
        ad9.setUrl("http://www.issl.bm/wp-content/uploads/2013/12/US-Ship-Banner-250-FINAL-1200x250.png");
        ad9.setAdCategory(AdCategory.CULTURE);

        Ads ad10 = new Ads();
        ad10.setUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTJXdnX6Wn-MkGA6IhxwrReDROv37xS0J8_G5Gs3mDmo_v9q-UIZw");
        ad10.setAdCategory(AdCategory.POLITICS);

        Ads ad11 = new Ads();
        ad11.setUrl("https://eyeqvc.com/wp-content/uploads/2015/02/EyeQ_Irritating1000_1200x250LP-1200x250.gif");
        ad11.setAdCategory(AdCategory.POLITICS);

        Ads ad12 = new Ads();
        ad12.setUrl("https://icdn8.digitaltrends.com/image/linkedin-mem-1-1200x250.png?ver=1");
        ad12.setAdCategory(AdCategory.POLITICS);

        Ads ad13 = new Ads();
        ad5.setUrl("http://ad.adverticum.net/banners/5387620/970x250.jpg");
        ad5.setAdCategory(AdCategory.SPORT);

        s.save(ad1);
        s.save(ad2);
        s.save(ad3);
        s.save(ad4);
        s.save(ad5);
        s.save(ad6);
        s.save(ad7);
        s.save(ad8);
        s.save(ad9);
        s.save(ad10);
        s.save(ad11);
        s.save(ad12);
        s.save(ad13);

    }
}
