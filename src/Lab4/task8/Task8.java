package Lab4.task8;

public class Task8 {
    static int counter = 10;
    public static void main(String[] args) {
        increment();
        increment();
        increment();

        System.out.println("Counter before setCounter() = " + counter);
        setCounter(5);
        System.out.println("Counter after setCounter() = " + counter);
    }
    public static int increment(){
        return counter++;
    }
    public static int setCounter(int counter){
        return counter;
    }
}