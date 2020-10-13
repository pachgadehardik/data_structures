package com.capg.hardik.data_structure;

import com.capg.hardik.data_structure.Node.INode;

/**
 * @author hardi
 *Implementing Queue using LinkedList Functions
 */
public class Queue<T extends Comparable<T>> {

	LinkedList<T> queue;
	
	public Queue() {
		queue = new LinkedList<>();
	}
	
	/**
	 * @param data
	 * Adding Element in the Queue using LinkedList Functions
	 */
	public void enQueue(T data) {
		queue.insert(queue, data);		
	}
	
	/**
	 * @throws Exception
	 * Removing First Added Elements
	 */
	public void deQueue() throws Exception {
		if(queue.head!=null)
			queue.pop(queue);
		else
			throw new Exception();
	}
	
	/**
	 * Displaying Queue Elements
	 */
	public void printQueue() {
		INode<T> headNode = queue.head;
		System.out.println("Queue Elements are-");
		while (headNode != null) {
			System.out.print(headNode.getKey() + " \n");
			headNode = headNode.getNext();
		}
	}
}
