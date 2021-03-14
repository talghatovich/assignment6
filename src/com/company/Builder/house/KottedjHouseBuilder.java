package com.company.Builder.house;
/*
* the builder helps create kottedj with its properties
* */
public class KottedjHouseBuilder extends HouseBuilder{
    @Override
    void buildWalls() {
        house.setWalls(6);
    }

    @Override
    void buildDoors() {
        house.setDoors(2);
    }

    @Override
    void buildWindows() {
        house.setWindows(8);
    }

    @Override
    void buildRoof() {
        house.setRoof(Roof.METALOCHEREPICA);
    }

    @Override
    void buildGarage() {
        house.setGarage(Garage.TWO_CAR);
    }
}
