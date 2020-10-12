package hardik.data_structure;

public class MyHashTable<K extends Comparable<K>, V extends Comparable<V>> extends LinkedList<K> {

	LinkedList<K> hashTable;
	
	public MyHashTable() {
		this.hashTable = new LinkedList<>();
	}
	
	public V get(K key) {
		MapNode<K, V> mapNode = (MapNode<K, V>) hashTable.search(hashTable, key);
		return (mapNode == null) ? null: mapNode.getValue();
	}

	public void add(K key, V value) {
		MapNode<K, V> mapNode = (MapNode<K, V>) hashTable.search(hashTable, key);
		if(mapNode == null) {
			mapNode = new MapNode<>(key, value);
			hashTable.appendNode(hashTable, mapNode);
		}
		else {
			mapNode.setValue(value);
		}
	}

	@Override
	public String toString() {
		return "MyHashTable [hashTable=" + hashTable + "]";
	}
	
	
	
}
