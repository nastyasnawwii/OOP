package Lab10.task5;

public class Main {
    public static void main(String[] args) {
        WasherDryer washerDryer = new WasherDryer("Samsung");

        washerDryer.turnOn();
        washerDryer.wash();
        washerDryer.dry();

        Appliance appliance = new WasherDryer("Bosch");
        Washable washable = new WasherDryer("LG");
        Dryable dryable = new WasherDryer("Gorenje");

        appliance.turnOn();
        ((Washable) washable).wash();
        ((Dryable) dryable).dry();
    }
}