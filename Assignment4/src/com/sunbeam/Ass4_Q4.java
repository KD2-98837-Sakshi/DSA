package com.sunbeam;

import java.util.Scanner;

public class Ass4_Q4 {
	static class Node {
		int val;
		Node next;

		Node(int val) {
			this.val = val;
		}
	}

	public static Node deleteMiddle(Node head) {
		if (head == null || head.next == null) {
			return null;
		}

		Node slow = head;
		Node fast = head;
		Node prev = null;

		while (fast != null && fast.next != null) {
			prev = slow;
			slow = slow.next;
			fast = fast.next.next;
		}

		prev.next = slow.next;

		return head;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of nodes:");
		int n = sc.nextInt();

		Node head = null;
		Node tail = null;

		System.out.println("Enter node values:");
		for (int i = 0; i < n; i++) {
			Node newnode = new Node(sc.nextInt());

			if (head == null) {
				head = newnode;
				tail = newnode;
			} else {
				tail.next = newnode;
				tail = newnode;
			}
		}

		head = deleteMiddle(head);

		System.out.println("List after deleting middle node:");
		Node trav = head;

		while (trav != null) {
			System.out.print(trav.val + " ");
			trav = trav.next;
		}

		sc.close();
	}
}
