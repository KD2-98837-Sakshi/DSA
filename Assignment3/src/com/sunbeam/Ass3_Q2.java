package com.sunbeam;

import java.util.Scanner;

class SinglyLinear2 {
	static class Node {
		private int data;
		private Node next;

		public Node(int value) {
			// TODO Auto-generated constructor stub
			data = value;
			next = null;
		}
	}

	Node head;

	public SinglyLinear2() {
		// TODO Auto-generated constructor stub
		head = null;
	}

	public void addPosition(int value, int pos) {
		Node newnode = new Node(value);
		if (head == null) {
			head = newnode;
		} else if (pos <= 1) {
			newnode.next = head;
			head = newnode;
		} else {

			Node trav = head;
			for (int i = 1; i < pos - 1 && trav.next != null; i++) {
				trav = trav.next;
			}
			newnode.next = trav.next;
			trav.next = newnode;

		}
	}

	public void addData(int value) {
		Node newnode = new Node(value);

		if (head == null || value < head.data) {
			newnode.next = head;
			head = newnode;
		} else {
			Node trav = head;

			while (trav.next != null && trav.next.data <= value) {
				trav = trav.next;
			}

			newnode.next = trav.next;
			trav.next = newnode;
		}
	}

	public void display() {
		Node trav = head;

		if (head == null) {
			System.out.println("List is empty");
			return;
		}

		System.out.print("List :: ");

		while (trav != null) {
			System.out.print(trav.data + " -> ");
			trav = trav.next;
		}

		System.out.println("null");
	}

}

public class Ass3_Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SinglyLinear2 list = new SinglyLinear2();
		int choice, value, pos;

		do {

			System.out.println("\n1. Add data");
			System.out.println("2. Display");
			System.out.println("0. Exit");
			System.out.print("Enter choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter value to add: ");
				value = sc.nextInt();
				list.addData(value);
				break;

			case 2:
				list.display();
				break;

			case 0:
				System.out.println("Exiting...");
				break;

			default:
				System.out.println("Invalid choice");
			}
		} while (choice != 0);

		sc.close();
	}

}
