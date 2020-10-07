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
}
