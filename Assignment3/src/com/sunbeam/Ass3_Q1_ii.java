package com.sunbeam;

import java.util.Scanner;

class SinglyLinear1 {
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

	public SinglyLinear1() {
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

	public void addBeforeData(int value, int key) {
		Node newnode = new Node(value);
		if (head == null) {
			System.out.println("Key not found");
		} else if (head.data == key) {
			newnode.next = head;
			head = newnode;
		}

		else {

			Node trav = head;
			while (trav.next.data != key) {
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

public class Ass3_Q1_ii {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SinglyLinear1 list = new SinglyLinear1();
		int choice, value, pos;

		do {
			System.out.println("\n1. Add First");
			System.out.println("2. Add Last");
			System.out.println("3. Add Position");
			System.out.println("4. Add before data");
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
				list.addBeforeData(value, data);
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
