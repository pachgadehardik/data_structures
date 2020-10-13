package com.capg.hardik.data_structure.Node;

public class MyBinaryNode<K extends Comparable<K>> {

	public K key;
	public MyBinaryNode<K> left;
	public MyBinaryNode<K> right;

	public MyBinaryNode(K key) {
		this.key = key;
		this.left = null;
		this.right = null;
	}
}
