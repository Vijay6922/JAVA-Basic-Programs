package oop2;
import java.io.*;
import java.util.Scanner;
public class endNames {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try
		{
		FileWriter fw = new FileWriter("/home/gvijaykumar/Desktop/vijay1.txt");
		while(true)
		{
			String s = sc.nextLine();
			if(s.equals("end"))
			{
				break;
			}
			fw.write(s+" ");
		}
		fw.close();
	}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}

}
