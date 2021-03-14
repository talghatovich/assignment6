package com.company.Builder.house;
//class house has fields same as properties of every house

public class House {
    //fields
    private int walls;
    private int doors;
    private int windows;
    private Roof roof;
    private Garage garage;


    //setters only
    public void setWalls(int walls) {
        this.walls = walls;
    }
    public void setDoors(int doors) {
        this.doors = doors;
    }
    public void setWindows(int windows) {
        this.windows = windows;
    }
    public void setRoof(Roof roof) {
        this.roof = roof;
    }
    public void setGarage(Garage garage) {
        this.garage = garage;
    }

    //tostring method
    @Override
    public String toString() {
        return "House{" +
                "walls=" + walls +
                ", doors=" + doors +
                ", windows=" + windows +
                ", roof=" + roof +
                ", garage=" + garage +
                '}';
    }
}
