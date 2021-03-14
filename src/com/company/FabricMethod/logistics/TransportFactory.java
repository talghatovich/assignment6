package com.company.FabricMethod.logistics;
/*the interface has only one method that is being implemented by transport factories(truckFactory and shipfactory)
* in purpose to make creation of transport easier*/
public interface TransportFactory {
    Transport createTransport();
}
