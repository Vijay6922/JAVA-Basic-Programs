package oop2;

import java.util.Scanner;

interface doOperations {
	public int add(int a, int b);

	public int sub(int a, int b);

	public int mul(int a, int b);

	public float div(int a, int b);

	public int mod(int a, int b);
}

class Cal implements doOperations {
	@Override
	public int add(int a, int b) {
		int c = a + b;
		return c;
	}

	@Override
	public int sub(int a, int b) {
		int c = a - b;
		return c;
	}

	@Override
	public int mul(int a, int b) {
		int c = a * b;
		return c;
	}

	@Override
	public float div(int a, int b) {
		if (a > b) {
			float c = a / b;
			return c;
		} else {
			float d = b / a;
			return d;
		}
	}

	@Override
	public int mod(int a, int b) {
		int c = a % b;
		return c;
	}
}

public class testOperations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		doOperations c = new Cal();
		System.out.println("the addition of two numbers is : " + c.add(a, b));
		System.out.println("the subtraction of two numbers is : " + c.sub(a, b));
		System.out.println("the multiplication of two numbers is : " + c.mul(a, b));
		System.out.println("the division of two numbers is : " + c.div(a, b));
		System.out.println("the modulus division of two numbers is : " + c.mod(a, b));
	}

}
