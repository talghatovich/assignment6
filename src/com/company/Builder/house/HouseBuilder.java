package com.company.Builder.house;
//house builder parent class which is being implemented by other classes(vremyankaHouseBuilder,
// OneStageHouseBuilder and KottedjHouseBuilder)
public abstract class HouseBuilder {
    //instance of house
    House house;
    //method of creating new instance
    void createHouse(){
        house = new House();
    }
    //abstract methods for every property of house
    abstract void buildWalls();
    abstract void buildDoors();
    abstract void buildWindows();
    abstract void buildRoof();
    abstract void buildGarage();

    //method that gets information about house
    House getHouse(){
        return house;
    }


}
