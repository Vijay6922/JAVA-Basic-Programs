package oop2;

import java.io.*;

public class Files_write {

	public static void main(String[] args) {
		// File f = new File("/home/gvijaykumar/Desktop/vijay.txt");
		try {
			FileWriter fw = new FileWriter("/home/gvijaykumar/Desktop/vijay.txt");
			fw.write("this is new file");
			fw.close();
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
