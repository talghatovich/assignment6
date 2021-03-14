package com.company.FabricMethod.logistics;

public class Ship implements Transport{
    //implemented method that overrides under requirements of Ship road(sea)
    @Override
    public void delivery() {
        System.out.println("The delivery goes by Ship on Sea");
    }
}
