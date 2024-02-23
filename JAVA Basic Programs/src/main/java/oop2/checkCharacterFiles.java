package oop2;

import java.io.FileReader;
import java.io.IOException;

public class checkCharacterFiles {

	public static void main(String[] args) {
		try {
			int i = 0;
			int cu = 0, cl = 0, co = 0;

			FileReader fr = new FileReader("/home/gvijaykumar/Desktop/vijay.txt");

			while ((i = fr.read()) != -1) {
				char c = (char) i; // Convert ASCII value to character

				if (Character.isUpperCase(c)) {
					cu++;
				} else if (Character.isLowerCase(c)) {
					cl++;
				} else {
					co++;
				}
			}

			fr.close(); // Close the FileReader

			System.out.println("Uppercase: " + cu);
			System.out.println("Lowercase: " + cl);
			System.out.println("Other characters: " + co);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
