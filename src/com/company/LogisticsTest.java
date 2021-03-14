package com.company;

import com.company.FabricMethod.logistics.ShipFactory;
import com.company.FabricMethod.logistics.Transport;
import com.company.FabricMethod.logistics.TransportFactory;
import com.company.FabricMethod.logistics.TruckFactory;

import java.util.Scanner;

public class LogisticsTest {
    public static void main(String[] args) {

        //we ask for road
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the land of delivery: ");
        String road = sc.next();

        //here we create transport by creating factory that defines the type of transport by its road
        TransportFactory transportFactory = createTransportByRoad(road);
        Transport transport = transportFactory.createTransport();

        //checking by calling method delivery
        transport.delivery();
    }

    /*the method below is used to make transport creation process more intuitive.
    It creates new transport, based on the road of it, by calling its factory.*/
    static TransportFactory createTransportByRoad(String road){
        if(road.equalsIgnoreCase("land")){
            return new TruckFactory();
        }else if(road.equalsIgnoreCase("sea")){
            return new ShipFactory();
        }else {
            throw new RuntimeException(road+" is unknown road");
        }
    }
}
