package Lab6.task3;

public class Task3 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];

        animals[0] = new Animal();
        animals[0].setName("Dog");
        animals[0].setSound("Bark");

        animals[1] = new Animal();
        animals[1].setName("Cow");
        animals[1].setSound("Moo");

        animals[2] = new Animal();
        animals[2].setName("Bird");
        animals[2].setSound("Chirrup");

        for (Animal animal : animals){
            animal.makeSound();
        }
    }
}