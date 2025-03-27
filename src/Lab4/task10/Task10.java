package Lab4.task10;

public class Task10 {
    public static void main(String[] args) {
        printNumbers("Numbers: ", 42, 52, 9, 1, 4, 88);
        printNumbers("Temperature: ", 20, 16, 21, 14, 23);
    }
    public static void printNumbers(String message, int... numbers){
        System.out.println(" ");
        System.out.print(message);
        for(int num : numbers){
            System.out.print(num + " ");
        }
    }
}