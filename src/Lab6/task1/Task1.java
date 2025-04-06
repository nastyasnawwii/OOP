package Lab6.task1;

public class Task1 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Nastya";
        person1.age = 17;

        String person1Introduction = person1.introduce();
        System.out.println(person1Introduction);
    }
}
