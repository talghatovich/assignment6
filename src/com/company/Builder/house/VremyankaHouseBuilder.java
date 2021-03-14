package com.company.Builder.house;
/*
 * the builder helps create vremyanka house with its properties
 * */
public class VremyankaHouseBuilder extends HouseBuilder{
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
        house.setWindows(2);
    }

    @Override
    void buildRoof() {
        house.setRoof(Roof.SHIFER);
    }

    @Override
    void buildGarage() {
        house.setGarage(Garage.NONE);
    }
}
