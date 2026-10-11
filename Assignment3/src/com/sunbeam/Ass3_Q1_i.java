package com.sunbeam;

import java.util.Scanner;

class SinglyLinear {
	static class Node {
		private int data;
		private Node next;

		public Node(int value) {
			data = value;
			next = null;
		}
	}

	Node head;

	public SinglyLinear() {
		// TODO Auto-generated constructor stub
		head = null;
	}

	public void addFirst(int value) {
		Node newnode = new Node(value);
		newnode.next = head;
		head = newnode;
	}

	public void addLast(int value) {
		Node newnode = new Node(value);

		if (head == null) {
			head = newnode;
			return;
		}

		Node trav = head;
		while (trav.next != null) {
			trav = trav.next;
		}
		trav.next = newnode;
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

	public void addAfterData(int value, int key) {
		Node newnode = new Node(value);
		if (head == null) {
			System.out.println("LinkedList is Empty");
		} else {

			Node trav = head;
			while (trav.data != key) {
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

public class Ass3_Q1_i {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SinglyLinear list = new SinglyLinear();
		int choice, value, pos;

		do {
			System.out.println("\n1. Add First");
			System.out.println("2. Add Last");
			System.out.println("3. Add Position");
			System.out.println("4. Add after data");
			System.out.println("5. Display");
			System.out.println("0. Exit");
			System.out.print("Enter choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter value: ");
				value = sc.nextInt();
				list.addFirst(value);
				break;

			case 2:
				System.out.print("Enter value: ");
				value = sc.nextInt();
				list.addLast(value);
				break;

			case 3:
				System.out.print("Enter value and position: ");
				value = sc.nextInt();
				pos = sc.nextInt();
				list.addPosition(value, pos);
				break;
			case 4:
				System.out.print("Enter value to add: ");
				value = sc.nextInt();
				System.out.println("Enter the data after you want to add data:");
				int data = sc.nextInt();
				list.addAfterData(value, data);
				break;

			case 5:
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
