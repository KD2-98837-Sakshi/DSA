package com.sunbeam;

class LinkedList {
	static class Node {
		private int data;
		private Node next;

		public Node(int value) {
			data = value;
			next = null;
		}
	}

	private Node head, tail;

	public LinkedList() {
		head = tail = null;
	}

	public boolean isEmpty() {
		return head == null && tail == null;
	}

	public void addFirst(int value) {
		// 1. create a newnode
		Node newnode = new Node(value);
		// 2. if list is empty
		if (head == null) {
			// a. add newnode into head and tail
			head = tail = newnode;
			// b. make list circular
			tail.next = head;
		}
		// 3. if list is not empty
		else {
			// a. add first node into next of newnode
			newnode.next = head;
			// b. add newnod into next of last node
			tail.next = newnode;
			// c. move head on newnode
			head = newnode;
		}
	}

	public void addLast(int value) {
		// 1. create a newnode
		Node newnode = new Node(value);
		// 2. if list is empty
		if (head == null) {
			// a. add newnode into head and tail
			head = tail = newnode;
			// b. make list circular
			tail.next = head;
		}
		// 3. if list is not empty
		else {
			// a. add first node into next of newnode
			newnode.next = head;
			// b. add newnod into next of last node
			tail.next = newnode;
			// c. move tail on newnode
			tail = newnode;
		}
	}

	public void addPosition(int value, int pos) {
		if (pos < 1) {
			return;
		}

		Node newnode = new Node(value);

		if (head == null) {
			if (pos != 1) {
				return;
			}

			head = newnode;
			tail = newnode;
			tail.next = head;
			return;
		}

		if (pos == 1) {
			newnode.next = head;
			head = newnode;
			tail.next = head;
			return;
		}

		Node trav = head;

		for (int i = 1; i < pos - 1; i++) {
			trav = trav.next;

			if (trav == head) {
				return;
			}
		}

		newnode.next = trav.next;
		trav.next = newnode;

		if (trav == tail) {
			tail = newnode;
		}
	}

	public void deleteFirst() {
		// 1. if list is empty
		if (head == null) // if(head == tail)
			return; // or head = tail = null
		// 2. if list has single node
		else if (head == tail)
			head = tail = null;
		// 3. if list has multiple nodes
		else {
			// a. add second node into next of last node
			tail.next = head.next;
			// b. move head on second node
			head = head.next;
		}
	}

	public void deleteLast() {
		// 1. if list is empty
		if (head == null) // if(head == tail)
			return; // or head = tail = null
		// 2. if list has single node
		else if (head == tail)
			head = tail = null;
		// 3. if list has multiple nodes
		else {
			// traverse till second last node
			Node trav = head;
			while (trav.next.next != head)
				trav = trav.next;
			// or
			// while(trav.next != tail)
			// trav = trav.next;

			// a. add first node into next of second last node
			trav.next = head;
			// b. move tail on second last node
			tail = trav;
		}
	}

	public void deletePosition(int pos) {

		if (head == null || pos < 1) {
			return;
		}

		if (pos == 1) {
			tail.next = head.next;
			head = head.next;
		}

		else {
			Node trav = head;
			for (int i = 1; i < pos - 1; i++) {
				trav = trav.next;
				if (trav.next == head) {
					return;
				}
			}
			trav.next = trav.next.next;

		}

	}

	public void display() {
		// 0. if list is empty, return
		if (head == null)
			return;
		System.out.print("List : ");
		// 1. create trav and start at first node
		Node trav = head;
		do {
			// 2. print current node
			System.out.print(" " + trav.data);
			// 3. go on next node
			trav = trav.next;
		} while (trav != head);// 4. repeat for every node
		System.out.println("");
	}

	public void deleteAll() {
		head = tail = null;
	}
}

public class Ass3_Q3 {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.addFirst(50);
		list.addFirst(40);
		list.addFirst(20);
		list.addFirst(10);

		list.addPosition(30, 3);

		list.display();

	}

}
