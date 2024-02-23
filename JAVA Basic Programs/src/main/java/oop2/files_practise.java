package oop2;

import java.io.*;

public class files_practise {

	public static void main(String[] args) {
		// Specify the desktop directory path based on your operating system.
		String desktopPath = System.getProperty("user.home") + File.separator + "Desktop";

		// Create a File object for the file on the desktop.
		File f = new File(desktopPath + File.separator + "vijay.txt");

		if (f.exists()) {
			System.out.println("File exists.");
		} else {
			System.out.println("File does not exist.");
		}

		try {
			if (f.createNewFile()) {
				System.out.println("File created successfully.");
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (f.exists()) {
			System.out.println(f.getAbsolutePath());
			System.out.println(f.getName());
			System.out.println(f.canRead());
			System.out.println(f.canWrite());
			System.out.println(f.length());
			f.delete();
		}
	}
}
