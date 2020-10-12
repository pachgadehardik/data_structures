package com.capg.hardik.data_structure;

import com.capg.hardik.data_structure.Node.Node.INode;

/**
 * @author hardik
 *
 * Implementing Stack Using LinkedList
 */
public class Stack<T extends Comparable<T>>{
	LinkedList<T> stack;
	
	public Stack() {
		 stack = new LinkedList<T>();
	}

	/**
	 * Pushing Element in Stack
	 */
	public void push(T data){
		stack.addToTop(stack, data);
	}
	
	/**
	 * removing Top Element from the STACK
	 * @throws Exception 
	 */
	public void popFromStack() throws Exception {
		if(stack.head != null)
			stack.pop(stack);
		else
			throw new Exception();
	}
	
	/**
	 * Showing Top element in stack
	 */
	public T peekStack() throws Exception {
		INode<T> tempNode = stack.head;
		if (tempNode != null)
			return stack.head.getKey();
		else {
			System.out.println("Stack empty");
			throw new Exception();
		}
	}
	
	/**
	 * Display Stack Elements
	 */
	public void printStack() {
		INode<T> headNode = stack.head;
		System.out.println(headNode);
		while (headNode != null) {
			System.out.print(headNode.getKey() + " \n");
			headNode = headNode.getNext();
		}
	}
}
