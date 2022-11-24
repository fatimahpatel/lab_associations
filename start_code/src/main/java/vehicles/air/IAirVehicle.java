package vehicles.air;

import vehicles.IVehicle;

public interface IAirVehicle extends IVehicle {

    public int getMaxFlightAltitude();
    public void setMaxFlightAltitude(int maxFlightAltitude);

    
}
