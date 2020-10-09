package hardik.data_structure;

public class Node<T extends Comparable<T>> {
	private Node<T> next;
	private T key;

	public Node(T key) {
		this.key = key;
		this.next = null;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public T getKey() {
		return key;
	}

	public void setKey(T key) {
		this.key = key;
	}

	
}
