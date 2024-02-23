package oop2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class readNames {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("/home/gvijaykumar/Desktop/vijay1.txt");
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				String[] words = line.split(" ");
				{
					if (words.length == 2) {
						System.out.println(line);
					}
				}
			}
			br.close();
			fr.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
