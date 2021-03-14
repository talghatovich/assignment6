package com.company.FabricMethod.logistics;

public class TruckFactory implements TransportFactory {
    //implemented method that creates Truck
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
