package Lab7.task5;

public class Clock {
    private int hours;
    private int minutes;
    private int seconds;

    public Clock(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours){
        if (hours >= 0 && hours < 24){
            this.hours = hours;
        }else {
            System.out.println("Hours must be between 0 and 23");
        }
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if (minutes >=0 && minutes < 60){
            this.minutes = minutes;
        }else {
            System.out.println("Minutes must be between 0 and 59");
        }
    }

    public int getSeconds(){
        return seconds;
    }

    public void setSeconds(int seconds){
        if (seconds >= 0 && seconds < 60){
            this.seconds = seconds;
        }else {
            System.out.println("Seconds must be between 0 and 59");
        }
    }

    public void displayTime(){
        System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
    }

    public void tick(){
        seconds++;
        if (seconds == 60){
            seconds = 0;
            minutes++;
            if (minutes == 60){
                minutes = 0;
                hours++;
                if (hours ==  24){
                    hours = 0;
                }
            }
        }
    }
}