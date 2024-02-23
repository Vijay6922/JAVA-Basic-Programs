package oop2;
import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
public class RandomNumbers {

	public static void main(String[] args) {
		try
		{
	     FileWriter fw = new FileWriter("/home/gvijaykumar/Desktop/vijay2.txt");
	     Scanner sc = new Scanner(System.in);
	     System.out.println("enter your range");
	     int r = sc.nextInt();
	     System.out.println("enter how many numbers");
	     int i = sc.nextInt();
	     Random random = new Random();
	     int a=0;
	     while(a!=r)
	     {
	    	int e = (int) Math.random()*100;
	    	a++;
	    	System.out.println(random);
	     }
		}
		catch(IOException e)
		{
			
		}

	}

}
