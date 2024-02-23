package oop2;

import java.util.Scanner;

public class modify {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 5 numbers");
		int num[] = new int[5];
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			String s = sc.nextLine();
			try {
				num[i] = Integer.parseInt(s);
				sum = sum + num[i];
			} catch (NumberFormatException ex) {
				System.out.println("please enter numbers");
				i--;
			}

		}
		System.out.println("sum :" + sum);
	}

}
