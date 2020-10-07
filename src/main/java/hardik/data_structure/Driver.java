package hardik.data_structure;

import java.util.Scanner;

public class Driver {

	public static void displayMenu() {
		System.out.println("\n1-Create and Add in a LinkedList(append way)");
		System.out.println("2-Create and Add in a LinkedList(Add to head way)");
		System.out.println("3-Insert at the given position");
		System.out.println("4-Delete 1st Element in the LinkedList");
		System.out.println("5-Delete Last Element in the LinkedList");
		System.out.println("6-Search for a key in LinkedList");
		System.out.println("7-Insert after given Node");
		System.out.println("8-Delete the given Node");
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
				System.out.println("Adding n elements at the end");
				int n = sc.nextInt();
				for (int i = 0; i < n; i++) {
					list = list.insert(list, sc.nextInt()); // 50, 30, 76
				}
				LinkedList.printList(list.head);
				break;
			case 2:
				LinkedList list1 = new LinkedList();
				System.out.println("Adding elements from head");
				int n1 = sc.nextInt();
				for (int i = 0; i < n1; i++) {
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
				break;
			case 6:
				LinkedList.printList(list.head);
				System.out.println("Enter the key to serach in given List");
				int data = sc.nextInt();
				LinkedList.search(list, data);
				break;
			case 7:
				LinkedList.printList(list.head);
				System.out.println("Enter the prev Node and new data: ");
				int prevData = sc.nextInt();
				int data1 = sc.nextInt();
				LinkedList.insertAfterNode(list, data1, prevData);
				LinkedList.printList(list.head);
				break;
			case 8:
				LinkedList.printList(list.head);
				System.out.println("Enter the given Node: ");
				int data2 = sc.nextInt();
				list.deleteGivenNode(list,data2);
				list.printList(list.head);
				break;
			default:
				flag = false;
				break;
			}

		}

	}
}
