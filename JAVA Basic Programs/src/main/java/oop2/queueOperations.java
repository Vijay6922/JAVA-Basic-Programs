package oop2;

public interface queueOperations {
	public void enqueue(int data);

	public void dequeue();

	public void print();

	public boolean isEmpty();
    
	public boolean isFull();

	public int length();
}

class Operations implements queueOperations {
	int front = 0;
	int rear = 0;
	int size = 0;
	int queue[] = new int[10];

	@Override
	public void enqueue(int data) {
		if (!isFull()) {
			queue[rear] = data;
			rear = (rear + 1) % 10; // circular
			size = size + 1;
		} else {
			System.out.println("queue is full");
		}
	}

	@Override
	public void dequeue() {
		if (!isEmpty()) {
			int data = queue[front];
			front = (front + 1) % 10;
			size = size - 1;
			System.out.println("removed element : " + data);
		} else {
			System.out.println("queue is empty");
		}
	}

	@Override
	public void print() {
		for (int i = 0; i < size; i++) {
			System.out.print((front + queue[i]) % 10 + "  ");
		}

	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public boolean isFull() {
		return size == 10;
	}

	@Override
	public int length() {

		return size;
	}

}
