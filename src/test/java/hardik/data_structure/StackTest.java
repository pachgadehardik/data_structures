package hardik.data_structure;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StackTest {

	Stack<Integer> stack;

	@Before
	public void init() {
		stack = new Stack<Integer>();
		stack.push(56);
		stack.push(30);
		stack.push(70);
	}

	@Test
	public void givenNumbersWhenAddedToStakShouldReturnPeek() throws Exception {
		Assert.assertEquals(70, stack.peekStack().intValue());
	}

	@Test
	public void givenNumbersWhenPoppedShouldMatchWithPoppedValue() throws Exception {
		stack.popFromStack();
		Assert.assertEquals(30, stack.peekStack().intValue());
	}

	@Test(expected = Exception.class)
	public void checkForEmptyStack() throws Exception {
		stack.popFromStack();
		stack.popFromStack();
		stack.popFromStack();
		stack.peekStack();
	}

}
