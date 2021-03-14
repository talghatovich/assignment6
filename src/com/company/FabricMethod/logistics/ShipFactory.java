package com.company.FabricMethod.logistics;

public class ShipFactory implements TransportFactory{
    //implemented method that creates Ship
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
