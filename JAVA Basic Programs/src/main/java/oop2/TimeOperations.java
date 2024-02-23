package oop2;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class operation {
	int hours;
	int minutes;
	int seconds;

	public operation(int hours, int minutes, int seconds) {
		super();
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	public int getTotalSeconds() {
		return this.hours * 3600 + this.minutes * 60 + seconds;
	}

	public void increment() {
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
		System.out.println(hours + " " + minutes + " " + seconds);
	}

	public void decrement() {
		seconds = seconds - 1;
		if (seconds == 0) {
			seconds = 59;
			minutes = minutes - 1;
			if (minutes == 0) {
				minutes = 59;
				hours = hours - 1;
				if (hours < 0) {
					hours = 23;
				}
			}
		}
		System.out.println(hours + " " + minutes + " " + seconds);
	}

	public void format() {
		System.out.println("Enter time in [HH:mm:ss] format");
		LocalTime t1 = LocalTime.of(hours, minutes, seconds);
		DateTimeFormatter t2 = DateTimeFormatter.ofPattern("HH:mm:ss");
		String t3 = t1.format(t2);
		System.out.println(t3);
	}

	public int compare(operation other) {

		if (this.hours != other.hours) {
			return Integer.compare(this.hours, other.hours);
		}

		if (this.minutes != other.minutes) {
			return Integer.compare(this.minutes, other.minutes);
		}

		return Integer.compare(this.seconds, other.seconds);
	}
}

public class TimeOperations {

	public static void main(String[] args) {
		operation o = new operation(12, 34, 22);
		o.decrement();
		o.increment();
		o.format();
		o.getTotalSeconds();
		operation o1 = new operation(22, 3, 2);
		int result = (o.compare(o1));
		System.out.println(result);
	}

}
