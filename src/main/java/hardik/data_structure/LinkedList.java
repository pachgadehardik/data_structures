package hardik.data_structure;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class LinkedList {

	Node head;

	public static <T> LinkedList insert(LinkedList list, T data) {
		Node<T> new_Node = new Node<T>(data);
//		new_Node.setNext(null);

		if (list.head == null) {
			list.head = new_Node;
		} else {
			Node<T> last = list.head;
			while (last.getNext() != null) {
				last = last.getNext();
			}
			last.setNext(new_Node);
		}

		return list;
	}

	public static <T> LinkedList addToTop(LinkedList list, T data) {

		Node<T> new_Node = new Node<T>(data);

		if (list.head == null)
			list.head = new_Node;
		else {
			Node tempNode = list.head;
			list.head = new_Node;
			list.head.setNext(tempNode);
		}

		return list;

	}

	public static <T> LinkedList insertAtPosition(LinkedList list, int position) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the data to add at " + position + " position: ");
		int data = sc.nextInt();

		Node tempHead = list.head;
		if (position < 1)
			System.out.println("Invalid Position");
		if (position == 1) {
			Node newNode = new Node(data);
			newNode.setNext(list.head);
			list.head = newNode;
		} else {
			while (position-- != 0) {
				if (position == 1) {
					// adding Node at required position
					Node newNode = new Node(data);
					newNode.setNext(list.head.getNext());
					list.head.setNext(newNode);
					break;
				}
				list.head = list.head.getNext();
			}
			if (position != 1)
				System.out.print("Position out of range");
		}
		return list;
	}

	public <T> LinkedList pop(LinkedList list) {
		Node temp = list.head;
		list.head = temp.getNext();
		return list;
	}

	public static <T> void printList(Node<?> temp) {
		while (temp != null) {
			System.out.print(temp.getKey() + " ");
			temp = temp.getNext();
		}
	}

	public <T> LinkedList popLast(LinkedList list) {
		Node temp = list.head;
		while (temp.getNext().getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(null);

		return list;
	}

	public static <T> Node search(LinkedList list, int data) {

		Node temp = list.head;
		int count = 0;
		while (temp != null && temp.getNext() != null) {
			if (temp.getKey().equals(data)) {
				System.out.println("Data present at " + (count + 1) + " Position");
				return temp;
			}
			temp = temp.getNext();
			count++;
		}
		return null;
	}

	public static <T> boolean insertAfterNode(LinkedList list, int data, int prevNodeData) {
		Node new_Node = new Node<Integer>(data);
		Node tempPrevNode = search(list, prevNodeData);
		if (tempPrevNode == null) {
			return false;
		}

		new_Node.setNext(tempPrevNode.getNext());
		tempPrevNode.setNext(new_Node);

		return true;

	}

	public <T> void deleteGivenNode(LinkedList list, int data2) {
		Node temp = list.head, prev = null;
		// If head node itself holds the key to be deleted
		if (temp != null && temp.getKey().equals(data2)) {
			list.head = temp.getNext(); // Changed head
			return;
		}

		// Search for the key to be deleted, keep track of the
		// previous node as we need to change temp.next
		while (temp != null && (!temp.getKey().equals(data2))) {
			prev = temp;
			temp = temp.getNext();
		}

		// If key was not present in linked list
		if (temp == null)
			return;

		// Unlink the node from linked list
		prev.setNext(temp.getNext());
	}
}
