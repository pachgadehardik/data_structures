package hardik.data_structure;

public class Node<K> {
	private Node<K> next;
	private K key;

	public Node(K key) {
		this.key = key;
		this.next = null;
	}

	public Node<K> getNext() {
		return next;
	}

	public void setNext(Node<K> next) {
		this.next = next;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

}
