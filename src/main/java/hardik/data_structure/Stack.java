package hardik.data_structure;

public class Stack<T extends Comparable<T>>{
	LinkedList<T> stack;
	public Stack() {
		 stack = new LinkedList<T>();
	}

	public void push(T data){
		stack.addToTop(stack, data);
	}
	
	
	public T peekStack() {
		return stack.head.getKey();
	}
}
