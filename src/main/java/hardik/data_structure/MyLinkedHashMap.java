package hardik.data_structure;

import java.util.ArrayList;

public class MyLinkedHashMap<K extends Comparable<K>,V extends Comparable<V>> {
	
	private final int numberOfBuckets;
	ArrayList<LinkedList<K>> myBucketArray;
	
	
	public MyLinkedHashMap() {
		this.numberOfBuckets = 10;
		this.myBucketArray = new ArrayList<>(numberOfBuckets);
		for (int i = 0; i < numberOfBuckets; i++) {
			this.myBucketArray.add(null);
		}
	}
	
	public V get(K key) {
		int index = this.getBucketIndex(key);
		LinkedList<K> myLinkedList = this.myBucketArray.get(index);
		if(myLinkedList == null) return null;
		MapNode<K, V> myMapNode = (MapNode<K, V>) myLinkedList.search(myLinkedList, key);
		return (myMapNode == null) ? null : myMapNode.getValue();
	}

	private int getBucketIndex(K key) {
		int hashcode = Math.abs(key.hashCode());
		int index = hashcode % numberOfBuckets;
		System.out.println("Key: "+key+" hashCode: "+hashcode+" index: "+index);
		return index;
	}

	public void add(K key, V value) {
		int index = this.getBucketIndex(key);
		LinkedList<K> myLinkedList = this.myBucketArray.get(index);
		if(myLinkedList == null) {
			myLinkedList = new LinkedList<>();
			this.myBucketArray.set(index, myLinkedList);
		}
		MapNode<K, V> myMapNode = (MapNode<K, V>) myLinkedList.search(myLinkedList, key);
		if(myMapNode == null) {
			myMapNode = new MapNode<>(key, value);
			myLinkedList.appendNode(myLinkedList, myMapNode);
		}
		else {
			myMapNode.setValue(value);
		}
	}

	@Override
	public String toString() {
		return "MyLinkedHashMap [myBucketArray=" + myBucketArray + "]";
	}

	public void remove(K key) {
		int index = this.getBucketIndex(key);
		
		LinkedList<K> myLinkedList = this.myBucketArray.get(index);
		if(myLinkedList == null) System.out.println("Given List does not Exist!!");
		myLinkedList.deleteGivenMapNode(myLinkedList, key);
		System.out.println();
		
	}
	
	
}
