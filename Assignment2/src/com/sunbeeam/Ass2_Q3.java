package com.sunbeeam;

import java.util.Scanner;

class CQueue {
	private int[] queue;
	private int rear, front;
	private int SIZE;
	private int cnt;

	public CQueue(int size) {
		SIZE = size;
		queue = new int[SIZE];
		rear = front = -1;
		cnt = 0;
	}

	public void offer(int value) {

		if (isFull()) {
			System.out.println("Queue is Full");
		} else {
			rear = (rear + 1) % SIZE;
			queue[rear] = value;
			cnt++;
		}
	}

	public int poll() {
		int temp = -1;
		if (isEmpty()) {
			System.out.println("Queue is Empty");
		} else {
			temp = queue[(front + 1) % SIZE];
			front = (front + 1) % SIZE;
			cnt--;
			if (front == rear) {
				front = rear = -1;
			}
		}
		return temp;
	}

	public int peek() {

		int temp = -1;
		if (isEmpty()) {
			System.out.println("Queue is Empty");
		} else {
			temp = queue[(front + 1) % SIZE];
		}
		return temp;

	}

	public boolean isFull() {
		return cnt == SIZE;
	}

	public boolean isEmpty() {
		return cnt == 0;

	}

}

public class Ass2_Q3 {

	public static void main(String[] args) {
		CQueue cq = new CQueue(5);
		int ch;
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("0.Exit\n1.offer\n2.poll\n3.peek\nEnter the choice: ");
			ch = scanner.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Enter the value to push: ");
				int value = scanner.nextInt();
				cq.offer(value);
				break;
			case 2:
				System.out.println("Poped element is : " + cq.poll());
				break;
			case 3:
				System.out.println("Peeked element is: " + cq.peek());
				break;
			default:
				System.out.println("invalid choice");
				break;
			}

		} while (ch != 0);

	}

}
