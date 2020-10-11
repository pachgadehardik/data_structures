package hardik.data_structure;

public class MapNode<K,V> implements INode<K> {

	private K key;
	private V value;
	private INode<K> next;
	
	public MapNode(K key, V value) {
		this.key = key;
		this.value = value;
		this.next = null;
	}
	
	@Override
	public K getKey() {
		return key;
	}

	@Override
	public INode<K> getNext() {
		// TODO Auto-generated method stub
		return next;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	@Override
	public void setKey(K key) {
		this.key = key;		
	}

	@Override
	public void setNext(INode<K> next) {
		this.next = next;
	}
	
	@Override
	public String toString() {
		StringBuilder mapNodeString = new StringBuilder();
		mapNodeString.append("(").append(key).append(",").append(value).append(")");
		if (next != null)
			mapNodeString.append("->").append(next);
		return mapNodeString.toString();
	}
	
	
}
