package Lab6.task2;

public class Task2 {
    public static void main(String[] args) {
        String carMark = "Tesla";
        String carModel = "Cybertruck";
        int carSpeed = 0;
        System.out.println("Before car acceleration:");
        printCarInfo(carMark, carModel, carSpeed);
        carSpeed = accelerate(carSpeed, 110);
        System.out.println("After car acceleration:");
        printCarInfo(carMark, carModel, carSpeed);
    }
    public static int accelerate(int currentSpeed, int increase){
        return currentSpeed + increase;
    }
    public static void printCarInfo(String carMark, String carModel, int carSpeed){
        System.out.println("Car mark: " + carMark);
        System.out.println("Car model: " + carModel);
        System.out.println("Car speed: " + carSpeed);
    }
}