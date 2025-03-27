package Lab4.task9;

public class Task9 {
    public static void main(String[] args) {
        int sumV1 = sum(8, 2);
        int sumV2 = sum(21, 7, 12);
        int sumV3 = sum(22, 44, 11, 66);

        System.out.println("First sum is: " + sumV1);
        System.out.println("Second sum is: " + sumV2);
        System.out.println("Third sum is: " + sumV3);
    }
    public static int sum(int... numbers){
        int sum = 0;
        for(int num : numbers){
            sum += num;
        }
        return sum;
    }
}