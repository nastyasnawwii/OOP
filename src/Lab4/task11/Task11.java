package Lab4.task11;

public class Task11 {
    public static void main(String[] args) {
        int max1 = findMax(8, 98, 28, 12);
        int max2 = findMax(0, 20, 17, 19, 3);
        int max3 = findMax(1, 32, 45, 10, 64, 4, 12);

        System.out.println("First maximum: " + max1);
        System.out.println("Second maximum: " + max2);
        System.out.println("Third maximum: " + max3);
    }
    public static int findMax(int... numbers){
        int max = numbers[0];
        for(int num : numbers){
            if(num > max){
                max = num;
            }
        }
        return max;
    }
}