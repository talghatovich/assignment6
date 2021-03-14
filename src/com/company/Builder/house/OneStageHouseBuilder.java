package com.company.Builder.house;
/*
 * the builder helps create one staged house with its properties
 * */
public class OneStageHouseBuilder extends HouseBuilder{
    @Override
    void buildWalls() {
        house.setWalls(4);
    }

    @Override
    void buildDoors() {
        house.setDoors(1);
    }

    @Override
    void buildWindows() {
        house.setWindows(4);
    }

    @Override
    void buildRoof() {
        house.setRoof(Roof.SHIFER);
    }

    @Override
    void buildGarage() {
        house.setGarage(Garage.ONE_CAR);
    }
}
