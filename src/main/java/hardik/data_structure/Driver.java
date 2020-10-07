package hardik.data_structure;

public class Driver {
	
	
	public static void main( String[] args )
    {
        System.out.println( "Created LinkedList: " );

    	LinkedList list = new LinkedList();
    	
    	list = list.insert(list,56);
    	list = list.insert(list,30);
    	list = list.insert(list,70);
    	
    	Node temp = list.head;
    	LinkedList.printList(temp);
    	
    	
    }
}
