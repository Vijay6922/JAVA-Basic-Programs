package oop2;

import java.util.Scanner;

public class testQueueOperations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		queueOperations q = new Operations();
		System.out.println("enter values in queue");
		int n = sc.nextInt();
		q.enqueue(n);
		System.out.println("enter values in queue");
		int m = sc.nextInt();
		q.enqueue(m);
		System.out.println("enter values in queue");
		int nm = sc.nextInt();
		q.enqueue(nm);
		q.print();
		q.dequeue();
		q.dequeue();
		System.out.println(q.isEmpty());
		System.out.println(q.isFull());
		System.out.println(q.length());
	}

}
