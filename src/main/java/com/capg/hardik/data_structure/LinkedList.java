package com.capg.hardik.data_structure;

import java.util.Scanner;

import com.capg.hardik.data_structure.Node.Node;
import com.capg.hardik.data_structure.Node.Node.INode;

/**
 * Hello world!
 *
 */
public class LinkedList <T extends Comparable<T>> {

	INode<T> head;
	
	public void insertOrderly(LinkedList<T> list, T data) {
		INode<T> newNode = (INode<T>) new Node(data);
	    INode<T> currentNode = list.head;
	    INode<T> previousNode = null;
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
		INode<T> new_Node = new Node<T>(data);

		if (list.head == null) {
			list.head = new_Node;
		} else {
			INode<T> last = list.head;
			while (last.getNext() != null) {
				last = last.getNext();
			}
			last.setNext(new_Node);
		}

		return list;
	}

	public LinkedList<T> addToTop(LinkedList<T> list, T data) {

		INode<T> new_Node = (INode<T>) new Node<T>(data);

		if (list.head == null)
			list.head = new_Node;
		else {
			INode<T> tempNode = list.head;
			list.head = new_Node;
			list.head.setNext(tempNode);
		}

		return list;

	}
	
	public LinkedList<T> insertAtPosition(LinkedList<T> list, int position) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the data to add at " + position + " position: ");
		int data = sc.nextInt();
		INode<T> tempHead = list.head;
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
		INode<T> temp = list.head;
		list.head = temp.getNext();
		return list;
	}

	public void printList(INode<T> temp) {
		while (temp != null) {
			System.out.print(temp.getKey() + " ");
			temp = temp.getNext();
		}
	}

	public LinkedList<T> popLast(LinkedList<T> list) {
				INode<T> temp = list.head;
		while (temp.getNext().getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(null);

		return list;
	}

	public INode<T> search(LinkedList<T> list, T data) {

		INode<T> temp = list.head;
		int count = 0;
		while (temp != null) {
			if (temp.getKey().equals(data)) {
				return temp;
			}
			temp = temp.getNext();
			count++;
		}
		return null;
	}

	public boolean insertAfterNode(LinkedList<T> list, int data, T prevNodeData) {
		Node<T> new_Node = new Node(data);
		INode<T> tempPrevNode = search(list, prevNodeData);
		if (tempPrevNode == null) {
			return false;
		}

		new_Node.setNext(tempPrevNode.getNext());
		tempPrevNode.setNext(new_Node);

		return true;

	}

	public void deleteGivenNode(LinkedList<T> list, int data2) {
		INode<T> temp = list.head;
		INode<T> prev = null;
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

	//Inserting Node in the LinkedList HashMap
	public LinkedList<T> appendNode(LinkedList<T> list, INode<T> data) {
		if (list.head == null) {
			list.head = data;
		} else {
			INode<T> last = list.head;
			while (last.getNext() != null) {
				last = last.getNext();
			}
			last.setNext(data);
		}

		return list;
	}
	
	public void deleteGivenMapNode(LinkedList<T> list, T data2) {
		INode<T> temp = list.head;
		INode<T> prev = null;
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
		if (temp == null) {
			System.out.println("Given Key does not Exist");
			return;

		}
		// Unlink the node from linked list
		prev.setNext(temp.getNext());
	}
	@Override
	public String toString() {
		return "LinkedList [head=" + head + "]";
	}
	
	
}
