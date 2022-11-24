package vehicles;

public final class Motor implements IMotorised{

    private int hp;
    private int fuel;
    
    public Motor(int hp, int fuel){
        this.hp = hp;
        this.fuel = fuel;
    }

    @Override
    public void startEngine() {
        System.out.println("Vroom!");    
    }

    @Override
    public void stopEngine() {
        System.out.println("...");
    }

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public int getFuel() {
        return fuel;
    }

    @Override
    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
}
