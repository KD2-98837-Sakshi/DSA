package com.sunbeeam;

import java.util.Scanner;

class LinearQueue {

	private int[] queue;
	private int rear, front;
	private int SIZE;

	public LinearQueue(int size) {
		SIZE = size;
		queue = new int[SIZE + 1];
		rear = front = 0;
	}

	public void offer(int value) {
		if (isFull()) {
			System.out.println("Queue is Full");
		} else {
			rear++;
			queue[rear] = value;
		}
	}

	public int poll() {
		int temp = -1;
		if (isEmpty()) {
			System.out.println("Queue is Empty");
		} else {
			temp = queue[front + 1];
			front++;
		}
		return temp;
	}

	public int peek() {
		int temp = -1;
		if (isEmpty()) {
			System.out.println("Queue is Empty");
		} else {
			temp = queue[front + 1];
		}
		return temp;
	}

	public boolean isFull() {
		return rear == SIZE;
	}

	public boolean isEmpty() {
		return rear == front;
	}
}

public class Ass2_Q1 {

	public static void main(String[] args) {
		LinearQueue lq = new LinearQueue(5);
		int ch;
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("0.Exit\n1.offer\n2.poll\n3.peek\nEnter the choice: ");
			ch = scanner.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Enter the value to push: ");
				int value = scanner.nextInt();
				lq.offer(value);
				break;
			case 2:
				System.out.println("Poped element is : " + lq.poll());
				break;
			case 3:
				System.out.println("Peeked element is: " + lq.peek());
				break;
			default:
				System.out.println("invalid choice");
				break;
			}

		} while (ch != 0);

	}

}
