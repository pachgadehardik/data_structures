package com.capg.hardik.data_structure;

import com.capg.hardik.data_structure.Node.MyBinaryNode;

public class MyBinaryTree<K extends Comparable<K>> {

	private MyBinaryNode<K> root;

	public MyBinaryTree(MyBinaryNode<K> root) {
		this.root = root;
	}

	public MyBinaryTree() {
	}

	public void addInBinaryTree(K key) {
		if (this.root == null)
			this.root = this.addRecursively(root, key);
		this.addRecursively(root, key);
	}

	private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key) {
		if (current == null)
			return new MyBinaryNode<K>(key);

		int compareResult = key.compareTo(current.key);
		if (compareResult == 0)
			return current;
		if (compareResult < 0)
			current.left = addRecursively(current.left, key);
		else
			current.right = addRecursively(current.right, key);
		return current;
	}

	public int getSize() {
		return this.getSizeRecursive(root);
	}

	private int getSizeRecursive(MyBinaryNode<K> current) {
		return current == null ? 0 : 1 + this.getSizeRecursive(current.left) + this.getSizeRecursive(current.right);
	}

	private boolean searchElementInBinaryTree(MyBinaryNode<K> current, K key) {
		boolean flag = false;
		if (current == null) {
			System.out.println("No Element");
		} else {
			if (current.key == key) {
				flag = true;
				System.out.println("Element Found!!");
			}
			else if (current.key.compareTo(key) > 0) {
				flag = searchElementInBinaryTree(current.left, key);
				
			}
			else if (current.key.compareTo(key) < 0) {
				flag = searchElementInBinaryTree(current.right, key);
			}
		}
		return flag;
	}

	public boolean searchElementInBinaryTree(K key) {
		return searchElementInBinaryTree(root, key);
	}
}
