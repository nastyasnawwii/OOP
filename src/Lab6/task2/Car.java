package Lab6.task2;

public class Car {
    private String carMark;
    private String carModel;
    private int carSpeed;

    public void setCarMark(String carBrand){
        this.carMark = carBrand;
    }

    public String getCarMark(){
        return carMark;
    }

    public void setCarModel(String carModel){
        this.carModel = carModel;
    }

    public String getCarModel(){
        return carModel;
    }

    public void setCarSpeed(int carSpeed){
        this.carSpeed = carSpeed;
    }

    public int getCarSpeed(){
        return carSpeed;
    }

    public void accelerate(int increase){
        carSpeed += increase;
    }

    public void printCarInfo(){
        System.out.printf("Car brand: %s\nCar model: %s\nCar speed: %d\n", carMark, carModel, carSpeed);
    }
}