package hardik.data_structure;

import org.junit.Before;
import org.junit.Test;

import com.capg.hardik.data_structure.Queue;

public class QueueTest {
	
	Queue<Integer> queue;
	@Before
	public void init() {
		queue = new Queue<>();
		queue.enQueue(56);
		queue.enQueue(30);
		queue.enQueue(70);
	}
	

	@Test(expected = Exception.class)
	public void checkForEmptyStack() throws Exception {
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();//dequeuing empty Queue
	}
	
	
}
