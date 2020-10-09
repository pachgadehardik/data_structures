package hardik.data_structure;

import org.junit.*;

public class LinkedListTest {

	LinkedList list;

	@Before
	public void init() {
		list = new LinkedList();
		list = list.insert(list, 56);
		list = list.insert(list, 30);
		list = list.insert(list, 70);
	}

	@Test
	public void getSearchElementShouldReturnTrue() {

		Assert.assertEquals(30, list.search(list, 30).getKey());

	}

	@Test
	public void getProperListInsertingAfterGivenElement() {
		Assert.assertTrue(list.insertAfterNode(list, 50, 56));
	}
	
	@Test
	public void checkWhetherGivenNodeGetsDeleted() {
		list.deleteGivenNode(list, 30);
		Assert.assertEquals(null, list.search(list, 30));
	}

}
