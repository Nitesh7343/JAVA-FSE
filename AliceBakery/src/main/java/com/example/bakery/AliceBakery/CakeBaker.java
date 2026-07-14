package com.example.bakery.AliceBakery;

public class CakeBaker {

    private final Frosting frosting;
    private final Syrup syrup;

    public CakeBaker(Frosting frosting, Syrup syrup) {
        this.frosting = frosting;
        this.syrup = syrup;
    }

    public void bake() {
        System.out.print("Cake is baked with " + frosting.getFrostingType() + " " + syrup.getSyrupType());
        System.out.println("Enjoy Your Cake");
    }
}
