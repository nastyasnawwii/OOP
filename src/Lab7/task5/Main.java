package Lab7.task5;

public class Main {
    public static void main(String[] args) {
        Clock clock = new Clock(23, 59, 59);
        clock.displayTime();
        clock.tick();
        clock.displayTime();
        clock.tick();
        clock.displayTime();

        clock.setHours(35);
        clock.setMinutes(65);
        clock.setSeconds(60);

        clock.setHours(13);
        clock.setMinutes(57);
        clock.setSeconds(22);

        clock.displayTime();
        clock.tick();
        clock.displayTime();
    }
}