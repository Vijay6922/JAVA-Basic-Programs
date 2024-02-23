package oop2;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

enum TimeOperation {
    GET_TOTAL_SECONDS,
    INCREMENT,
    DECREMENT,
    FORMAT;
}
class t1 {
    private int hours;
    private int minutes;
    private int seconds;
    private TimeOperation operation;

    public t1(int hours, int minutes, int seconds, TimeOperation operation) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        this.operation = operation;
    }

    public void operations() {
        switch (operation) {
            case GET_TOTAL_SECONDS: {
                System.out.println((hours * 3600) + (minutes * 60) + seconds);
                break;
            }
            case INCREMENT: {
                seconds = seconds + 1;
                if (seconds == 60) {
                    seconds = 0;
                    minutes = minutes + 1;
                    if (minutes == 60) {
                        minutes = 0;
                        hours = hours + 1;
                        if (hours == 24) {
                            hours = 0;
                        }
                    }
                }
                System.out.println(hours + ":" + minutes + ":" + seconds);
                break;
            }
            case DECREMENT: {
                seconds = seconds - 1;
                if (seconds < 0) {
                    seconds = 59;
                    minutes = minutes - 1;
                    if (minutes < 0) {
                        minutes = 59;
                        hours = hours - 1;
                        if (hours < 0) {
                            hours = 23;
                        }
                    }
                }
                System.out.println(hours + ":" + minutes + ":" + seconds);
                break;
            }
            case FORMAT: {
                System.out.println("Enter time in [HH:mm:ss] format");
                LocalTime t = LocalTime.of(hours, minutes, seconds);
                DateTimeFormatter t2 = DateTimeFormatter.ofPattern("HH:mm:ss");
                String t3 = t.format(t2);
                System.out.println(t3);
                break;
            }
        }
    }

    @Override
    public String toString() {
        return hours + ":" + minutes + ":" + seconds;
    }
}
