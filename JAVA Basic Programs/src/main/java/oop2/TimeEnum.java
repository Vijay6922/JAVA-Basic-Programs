package oop2;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

enum time {
	getTotalSeconds, increment, decrement, format;
}

class methods {
	int hours;
	int minutes;
	int seconds;
	time t;

	public methods(int hours, int minutes, int seconds, time t) {
		super();
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
		this.t = t;
	}

	public void operations() {
		switch (t) {
		case getTotalSeconds: {
			System.out.println( (hours * 3600) + (minutes * 60) + seconds);
		}
		case increment: {
			seconds = seconds + 1;
			if (seconds == 60) {
				seconds = 1;
			}
			minutes = minutes + 1;
			if (minutes == 60) {
				minutes = 1;
			}
			hours = hours + 1;
			if (hours == 12) {
				hours = 1;
			}
			System.out.println(hours + minutes + seconds);
		}
		case decrement: {
			seconds = seconds - 1;
			if (seconds == 0) {
				seconds = 60;
			}
			minutes = minutes - 1;
			if (minutes == 0) {
				minutes = 59;
			}
			hours = hours - 1;
			if (hours == 1) {
				hours = 0;
			}
			System.out.println(hours + minutes + seconds);
		}
		case format: {
			System.out.println("enter time in [yyyy-mm-dd] format");
			LocalTime t1 = LocalTime.of(hours, minutes, seconds);
			DateTimeFormatter t2 = DateTimeFormatter.ofPattern("HH:mm:ss");
			String t3 = t1.format(t2);
			System.out.println(t3);
		}
		}
		
	}

public class TimeEnum {

	public static void main(String[] args) {
		methods m = new methods(12,23,20,time.getTotalSeconds);
		System.out.println(m);

	}
}
}
