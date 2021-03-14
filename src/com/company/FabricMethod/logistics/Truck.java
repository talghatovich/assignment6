package com.company.FabricMethod.logistics;

public class Truck implements Transport{
    //implemented method that overrides under requirements of Truck road(land)
    @Override
    public void delivery() {
        System.out.println("The delivery goes by Truck on land");
    }
}
