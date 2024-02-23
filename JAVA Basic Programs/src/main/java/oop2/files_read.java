package oop2;

import java.io.*;

public class files_read {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("/home/gvijaykumar/Desktop/vijay.txt");
			int i = 0;
			while ((i = fr.read()) != -1) {
				System.out.print((char) i); // while((i=fr.read())!=-1)
			}
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
