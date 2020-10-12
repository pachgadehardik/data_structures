package hardik.data_structure;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

public class MyBinaryTreeTest {

	MyBinaryTree<Integer> myBinaryTree;
	Scanner scanInput = new Scanner(System.in);

	@Before
	public void init() {
		myBinaryTree = new MyBinaryTree<Integer>();
	}
	
	@Test
	public void givenNumbersWhenAddedToBinaryTreeShouldReturnSize() {
		myBinaryTree.addInBinaryTree(56);
		myBinaryTree.addInBinaryTree(30);
		myBinaryTree.addInBinaryTree(70);
		int size = myBinaryTree.getSize();
		
		assertEquals(3, size);
	}
	
	@Test
	public void givenAllNumbersWhenAddedShouldReturnProperSize() {
		for(int i=0;i<13;i++) {
			myBinaryTree.addInBinaryTree(scanInput.nextInt());
		}
		int size = myBinaryTree.getSize();
		assertEquals(13, size);
	}
	
	@Test
	public void givenElementWhenSearchedShouldReturnTrue() {
		MyBinaryNode<Integer> root = new MyBinaryNode<>(56);
		myBinaryTree = new MyBinaryTree<Integer>(root);
		myBinaryTree.addInBinaryTree(30);
		myBinaryTree.addInBinaryTree(70);
		assertEquals(true, myBinaryTree.searchElementInBinaryTree(30));
	}
	
}
