package hardik.data_structure;

/**
 * Hello world!
 *
 */
public class LinkedList
{
	
	Node head;
	
	public static <T> LinkedList insert(LinkedList list,T data) {
		Node<T> new_Node = new Node<T>(data);
//		new_Node.setNext(null);
		
		if(list.head == null) {
			list.head =new_Node;
		}
		else {
			Node<T> last = list.head; 
            while (last.getNext() != null) { 
                last = last.getNext(); 
            }
            last.setNext(new_Node); 
		}
		
		return list;
	}

	public static <T>void  printList(Node temp){
	while(temp!=null) {
		System.out.print(temp.getKey()+" ");
		temp = temp.getNext();
	}
	}
}
