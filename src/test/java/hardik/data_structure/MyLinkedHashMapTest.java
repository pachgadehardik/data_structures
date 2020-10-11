package hardik.data_structure;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyLinkedHashMapTest {

	MyLinkedHashMap<String, Integer> myLinkedHashMap;

	@Before
	public void init() {
		myLinkedHashMap = new MyLinkedHashMap<String, Integer>();
	}

	@Test
	public void givenSentenceWhenWordsAreAddedToListShouldReturnParanoidFrequency() {

		String sentence = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";

		String words[] = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = myLinkedHashMap.get(word);
			if (value == null)
				value = 1;
			else
				value = value + 1;
			myLinkedHashMap.add(word, value);
		}

		System.out.println(myLinkedHashMap);
		int frequency = myLinkedHashMap.get("paranoid");
		Assert.assertEquals(3, frequency);
	}
}
