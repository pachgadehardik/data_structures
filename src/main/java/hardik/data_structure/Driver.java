package hardik.data_structure;

import java.util.Scanner;

public class Driver {

	public static void displayMenu() {
		System.out.println("\n1-Create and Add in a LinkedList(append way)");
		System.out.println("2-Create and Add in a LinkedList(Add to head way)");
		System.out.println("3-Insert at the given position");
		System.out.println("4-Delete 1st Element in the LinkedList");
		System.out.println("5-Delete Last Element in the LinkedList");
		System.out.println("0-Exit");
		System.out.println("Enter :");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("LinkedList Operations: ");
		LinkedList list = new LinkedList();
		boolean flag = true;
		while (flag) {
			displayMenu();
			int op = sc.nextInt();
			switch (op) {
			case 1: // For creating and Adding data at the end
				System.out.println("Adding elements at the end");

				for (int i = 0; i < 3; i++) {
					list = list.insert(list, sc.nextInt()); // 50, 30, 76
				}
				LinkedList.printList(list.head);
				break;
			case 2:
				LinkedList list1 = new LinkedList();
				System.out.println("Adding elements from head");
				for (int i = 0; i < 3; i++) {
					list1 = list1.addToTop(list1, sc.nextInt()); // 50, 30, 76
				}
				LinkedList.printList(list1.head);
				break;
			case 3:
				LinkedList.printList(list.head);
				System.out.println("Enter the position");
				int position = sc.nextInt();
				list.insertAtPosition(list, position);
				LinkedList.printList(list.head);
				break;
			case 4:
				System.out.println("Before Deleting: \n");
				LinkedList.printList(list.head);
				list.pop(list);
				System.out.println("\nAfter Deleting: \n");
				LinkedList.printList(list.head);
				break;
			case 5:
				System.out.println("Before Deleting Last: \n");
				LinkedList.printList(list.head);
				list.popLast(list);
				System.out.println("\nAfter Deleting Last: \n");
				LinkedList.printList(list.head);
			default:
				flag = false;
				break;
			}

		}

	}
}
