package hardik.data_structure;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class LinkedList <T extends Comparable<T>> {

	Node<T> head;
	
	public void insertOrderly(LinkedList<T> list, T data) {
		Node<T> newNode = new Node<>(data);
	    Node<T> currentNode = list.head;
	    Node<T> previousNode = null;
	    while(currentNode != null && data.compareTo(currentNode.getKey()) > 0 ){
	      previousNode = currentNode;
	      currentNode = currentNode.getNext();
	    }
	    // insertion at beginning of the list
	    if(previousNode == null){
	      list.head = newNode;
	    }else{
	      previousNode.setNext(newNode);
	    }
	    newNode.setNext(currentNode);
	}
	
	public LinkedList<T> insert(LinkedList<T> list, T data) {
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

	public LinkedList<T> addToTop(LinkedList<T> list, T data) {

		Node<T> new_Node = new Node<T>(data);

		if (list.head == null)
			list.head = new_Node;
		else {
			Node<T> tempNode = list.head;
			list.head = new_Node;
			list.head.setNext(tempNode);
		}

		return list;

	}
	
	public LinkedList<T> insertAtPosition(LinkedList<T> list, int position) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the data to add at " + position + " position: ");
		int data = sc.nextInt();
		Node<T> tempHead = list.head;
		Node<T> newNode = new Node(data);
		
		if (position < 1)
			System.out.println("Invalid Position");
		if (position == 1) {
			newNode.setNext(list.head);
			list.head = newNode;
		} else {
			while (position-- != 0) {
				if (position == 1) {
					// adding Node at required position
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

	public LinkedList<T> pop(LinkedList<T> list) {
		Node<T> temp = list.head;
		list.head = temp.getNext();
		return list;
	}

	public void printList(Node<T> temp) {
		while (temp != null) {
			System.out.print(temp.getKey() + " ");
			temp = temp.getNext();
		}
	}

	public LinkedList<T> popLast(LinkedList<T> list) {
				Node<T> temp = list.head;
		while (temp.getNext().getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(null);

		return list;
	}

	public Node<T> search(LinkedList<T> list, int data) {

		Node<T> temp = list.head;
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

	public boolean insertAfterNode(LinkedList<T> list, int data, int prevNodeData) {
		Node<T> new_Node = new Node(data);
		Node<T> tempPrevNode = search(list, prevNodeData);
		if (tempPrevNode == null) {
			return false;
		}

		new_Node.setNext(tempPrevNode.getNext());
		tempPrevNode.setNext(new_Node);

		return true;

	}

	public void deleteGivenNode(LinkedList<T> list, int data2) {
		Node<T> temp = list.head, prev = null;
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
