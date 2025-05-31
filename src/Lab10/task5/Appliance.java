package Lab10.task5;

abstract class Appliance {
    public String brand;

    public Appliance(String brand){
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
    abstract void turnOn();
}
