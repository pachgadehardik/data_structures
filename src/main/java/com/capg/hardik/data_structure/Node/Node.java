package com.capg.hardik.data_structure.Node;

import com.capg.hardik.data_structure.Node.Node.INode;

public class Node<T extends Comparable<T>> implements INode<T> {
	private INode<T> next;
	private T key;

	public Node(T key) {
		this.key = key;
		this.next = null;
	}

	public INode<T> getNext() {
		return next;
	}

	public void setNext(INode<T> head) {
		this.next = head;
	}

	public T getKey() {
		return key;
	}

	public void setKey(T key) {
		this.key = key;
	}

	
}
