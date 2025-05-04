package Lab7.task3;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Tesla", "Model Y", 120);
        car.accelerate(70);
        car.brake(20);
        car.brake(60);
        car.carInfo();
    }
    }
