package com.sunbeeam;

import java.util.Scanner;

class Stack1 {

	private int[] stk;
	private int SIZE;
	private int top;

	public Stack1(int size) {
		// TODO Auto-generated constructor stub
		SIZE = size;
		stk = new int[SIZE];
		top = SIZE;
	}

	public void push(int value) {
		if (isFull()) {
			System.out.println("Stack is full");
		} else {
			top--;
			stk[top] = value;
		}
	}

	public int pop() {
		int temp = -1;
		if (isEmpty()) {
			System.out.println("Stack is Empty");

		} else {
			temp = stk[top];
			top++;
		}
		return temp;
	}

	public int peek() {
		int temp = -1;
		if (isEmpty()) {
			System.out.println("Stack is Empty");
		} else {
			temp = stk[top];
		}
		return temp;
	}

	public boolean isFull() {
		return top == 0;
	}

	public boolean isEmpty() {
		return top == SIZE;
	}

}

public class Ass2_Q2 {

	public static void main(String[] args) {
		Stack1 lstk = new Stack1(5);
		int ch;
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("0.Exit\n1.push\n2.pop\n3.peek\nEnter the choice: ");
			ch = scanner.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Enter the value to push: ");
				int value = scanner.nextInt();
				lstk.push(value);
				break;
			case 2:
				System.out.println("Poped element is : " + lstk.pop());
				break;
			case 3:
				System.out.println("Peeked element is: " + lstk.peek());
				break;
			default:
				System.out.println("invalid choice");
				break;
			}

		} while (ch != 0);

	}

}
