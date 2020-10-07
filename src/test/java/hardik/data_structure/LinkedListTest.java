package hardik.data_structure;

import org.junit.jupiter.api.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

import org.junit.*;

public class LinkedListTest {
	
//	@Before
//	public void init() {
//		LinkedList linkedList = new LinkedList();
//        
//	}
//	
	@Test
	public void getSearchElementShouldReturnTrue() {
		LinkedList list = new LinkedList();
    
    	list = LinkedList.insert(list,56);
    	list = LinkedList.insert(list,30);
    	list = LinkedList.insert(list,70);
    	Assert.assertTrue(LinkedList.search(list, 30));
	}
	
}
