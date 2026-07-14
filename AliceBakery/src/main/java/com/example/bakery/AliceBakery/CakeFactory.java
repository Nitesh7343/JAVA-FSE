package com.example.bakery.AliceBakery;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class CakeFactory {
    private final Map<String,Frosting> frostings;
    private final Map<String, Syrup>  syrups;

    public CakeFactory(Map<String, Frosting> frostings,Map<String ,Syrup> syrups) {
        this.frostings = frostings;
        this.syrups = syrups;
    }

    public CakeBaker create(String frostingName, String syrupName) {
        Frosting frosting = frostings.get(frostingName);
        Syrup syrup = syrups.get(syrupName);

        return new CakeBaker(frosting,syrup);
    }
}
