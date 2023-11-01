package linklist;

import java.util.Scanner;

//list of items linked 
public class Linklist {
//node created	
	private Node head;

	static class Node {
		public int data;
		public Node next;

//		public Node() {
//			data = 0;
//			next = null;
//		}

		public Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public Linklist() {
		head = null;
	}

	public void addFirst(int data) {
		Node n1 = new Node(data);
		if (head == null)
			head = n1;
		else {
			n1.next = head;
			head = n1;
		}
	}

	public void addLast(int data) {
		Node NewNode = new Node(data);
		Node trav = head;
		if (head == null) {
			head = NewNode;
		} else {
			while (trav.next != null) {
				trav = trav.next;
			}
			trav.next = NewNode;
		}
	}

	public void display() {
		Node trav = head;
		if (trav == null) {
			System.out.println("List is empty");
		} else {
			while (trav != null) {
				System.out.print(trav.data + " ");
				trav = trav.next;
			}
		}
	}

	public void addAtPosition(int pos, int data) {
		Node n1 = new Node(data);
		if (head == null) {
			head = n1;
		} else {
			Node trav = head;
			int count = 1;
			while ((pos - 1) != count) {
				trav = trav.next;
				count++;
			}
			n1.next = trav.next;
			trav.next = n1;
		}
	}

	public int deleteFirst() {
		int ele = head.data;
		head = head.next;
		return ele;
	}

	public void deleteAt(int pos) {
		Node trav = head;
		Node trav1 = head.next;
		int count = 2;
		while ((pos) != count) {
			trav = trav.next;
			trav1 = trav1.next;

			count++;
		}
		trav.next = trav1.next;
	}
	public void deleteAtLast() {
		Node trav=head;
		 Node trav1=head.next;
		while(trav1.next!=null) {
		trav=trav.next;
		trav1=trav1.next;
		}
		trav.next=null;
	}

	public static void main(String[] args) {

		boolean exit = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter choice");
		Linklist l1 = new Linklist();

		while (exit) {

			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter element");
				int element = sc.nextInt();
				l1.addFirst(element);
				System.out.println("Added successfully");
				break;
			case 2:
				System.out.println("Enter element");
				int element1 = sc.nextInt();
				l1.addLast(element1);
				System.out.println("Added successfully");
				break;
			case 3:
				l1.display();
				break;
			case 4:
				System.out.println("Enter at specified position");
				int position = sc.nextInt();
				int data = sc.nextInt();
				l1.addAtPosition(position, data);
				System.out.println("element Added at" + " " + position);
				break;
			case 5:
				System.out.println("Delete first Node");
				int ele = l1.deleteFirst();
				System.out.println("First ele " + " " + ele + "  " + "is deleted");
				break;
			case 6://System.out.println("DElete AT last");
			l1.deleteAtLast();
			System.out.println("Last ele is Deleted");
			    break;
			case 7:
				
				int pos = sc.nextInt();
				l1.deleteAt(pos);
				System.out.println("Element is Deleted at"+" "+pos);
				break;
			}
		}
	}

}
