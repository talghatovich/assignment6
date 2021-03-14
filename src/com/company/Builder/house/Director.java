package com.company.Builder.house;
//director has competences as building house by manipulating with builders
public class Director {
    HouseBuilder builder;


    public void setBuilder(HouseBuilder builder) {
        this.builder = builder;
    }

    House buildHouse(){
        builder.createHouse();
        builder.buildWalls();
        builder.buildDoors();
        builder.buildWindows();
        builder.buildRoof();
        builder.buildGarage();

        House house = builder.getHouse();

        return house;
    }
}
