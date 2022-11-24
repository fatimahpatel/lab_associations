package vehicles.air;

import products.IProduct;
import vehicles.IMotorised;
import vehicles.IRadar;
import vehicles.Vehicle;

public class Plane extends Vehicle implements IAirVehicle, IMotorised, IRadar {

    private int maxFlightAltitude;
    private IMotorised engine;
    private IRadar radar;

    public Plane(float weight, int maxSpeed, IProduct baseProduct, int maxFlightAltitude ){
        super(weight, maxSpeed, baseProduct);
        this.maxFlightAltitude = maxFlightAltitude;
    }

    @Override
    public int getMaxFlightAltitude() {
        return maxFlightAltitude;
    }

    @Override
    public void setMaxFlightAltitude(int maxFlightAltitude) {
        this.maxFlightAltitude = maxFlightAltitude;
    }

    @Override
    public void startEngine() {
        this.engine.startEngine();
    }

    @Override
    public void stopEngine() {
        this.engine.stopEngine();
    }

    @Override
    public int getHp() {
        return this.engine.getHp();
    }

    @Override
    public void setHp(int hp) {
        this.engine.setHp(hp);
    }

    @Override
    public int getFuel() {
        return this.engine.getFuel();
    }

    @Override
    public void setFuel(int fuel) {
        this.engine.setFuel(fuel);
    }

    @Override
    public String startRadar() {
        return this.radar.startRadar();
    }

    @Override
    public String stopRadar() {
        return this.radar.stopRadar();
    }
}
