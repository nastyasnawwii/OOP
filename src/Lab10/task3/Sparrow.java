package Lab10.task3;

public class Sparrow extends Bird implements Flyable{
    @Override
    void makeSound() {
        System.out.println("Chirp");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}
