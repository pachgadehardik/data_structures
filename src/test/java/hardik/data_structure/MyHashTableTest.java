package hardik.data_structure;

import org.junit.Assert;
import org.junit.Test;

import com.capg.hardik.data_structure.MyHashTable;

public class MyHashTableTest {

	@Test
	public void givenSentenceWhenWordsAreAddedToListShouldReturnFrequency() {
		String sentence = "To be or not to be";
		MyHashTable<String, Integer> myHashTable = new MyHashTable<String, Integer>();
		String words[] = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = myHashTable.get(word);
			if (value == null)
				value = 1;
			else
				value = value + 1;
			myHashTable.add(word, value);
		}

		int frequency = myHashTable.get("to");
		System.out.println(myHashTable);
		Assert.assertEquals(2, frequency);
	}

}
