package collections;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class sortNumbers {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter(
					"/home/gvijaykumar/eclipse-workspace/java lang/eclipse-workspace/java lang/src/main/java/oop2/vijaysort.txt");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter ten-digit phone numbers, and 'end' to exit.");
			List<String> phoneNumbers = new ArrayList<>();
			TreeSet<String> uniquePhoneNumbers = new TreeSet<>();

			while (true) {
				System.out.println("Enter a phone number or 'end' to finish: ");
				String input = sc.nextLine().trim();

				if (input.equalsIgnoreCase("end")) {
					break;
				}

				int digitCount = 0;
				for (char c : input.toCharArray()) {
					if (Character.isDigit(c)) {
						digitCount++;
					}
				}

				if (digitCount == 10) {
					uniquePhoneNumbers.add(input);
				} else {
					System.out.println("Please enter a ten-digit number.");
				}
			}

			phoneNumbers.addAll(uniquePhoneNumbers);
			Collections.sort(phoneNumbers);

			for (String number : phoneNumbers) {
				fw.write(number + "\n");
			}

			fw.close();
			sc.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
