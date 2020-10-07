package hardik.data_structure;

import java.util.Scanner;

public class Driver {

	public static void displayMenu() {
		System.out.println("\n1-Create and Add in a LinkedList(append way)");
		System.out.println("2-Create and Add in a LinkedList(Add to head way)");
		System.out.println("0-Exit");
		System.out.println("Enter :");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("LinkedList Operations: ");

		boolean flag = true;
		while (flag) {
			displayMenu();
			int op = sc.nextInt();
			switch (op) {
			case 1: // For creating and Adding data at the end
				System.out.println("Adding elements at the end");
				LinkedList list = new LinkedList();
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
			default:
				flag = false;
				break;
			}

		}

	}
}
