package vehicles.water;

import products.IProduct;
import vehicles.Vehicle;

public class Kayak extends Vehicle implements IWaterVehicle {
    
    private String hullType;
    public Kayak(String type, float weight, int maxSpeed, IProduct baseProduct){
        super(weight, maxSpeed, baseProduct);
        this.hullType = type;
        
    }
    

    @Override
    public String getHullType() {
        return hullType;
    }

    @Override
    public void setHullType(String type) {
        this.hullType = type;

    }
}
