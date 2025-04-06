package Lab6.task2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setCarMark("Tesla");
        car.setCarModel("Cybertruck");
        car.setCarSpeed(0);

        System.out.println("Before acceleration:");
        car.printCarInfo();
        car.accelerate(110);
        System.out.println("After acceleration:");
        car.printCarInfo();
    }
}