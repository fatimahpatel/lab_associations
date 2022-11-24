package vehicles;

public class Radar implements IRadar {

    private int maxDistance;

    public Radar(int maxDistance){
        this.maxDistance = maxDistance;
    }

    @Override
    public String startRadar() {
        return "Radar started";
    }

    @Override
    public String stopRadar() {
        return "Radar stopped";
    }
}
