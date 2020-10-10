package hardik.data_structure;

import java.util.Scanner;

public class Driver {

	public static void displayMenu() {
		System.out.println("------------LinkedList Operations--------------------------------");
		System.out.println("\n1-Create and Add in a LinkedList(append way)");
		System.out.println("2-Create and Add in a LinkedList(Add to head way)");
		System.out.println("3-Insert at the given position");
		System.out.println("4-Delete 1st Element in the LinkedList");
		System.out.println("5-Delete Last Element in the LinkedList");
		System.out.println("6-Search for a key in LinkedList");
		System.out.println("7-Insert after given Node");
		System.out.println("8-Delete the given Node");
		System.out.println("9-Insert in Ordered LinkedList");
		System.out.println("-------------Stack Using LinkedList-------------------------------------");
		System.out.println("10-Push n Elemnts in the Stack");
		System.out.println("11-Peek and Pop Elements from the Stack");
		System.out.println("------------Queue-----------------");
		System.out.println("12-Enque Elements in the Queue: ");
		System.out.println("13-Deque Elements in the Queue: ");
		System.out.println("0-Exit");
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("LinkedList Operations: ");
		LinkedList<Integer> list = new LinkedList<>();
		Stack<Integer> stack = new Stack<>();
		Queue<Integer> queue = new Queue<>();

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
				list.printList(list.head);
				break;
			case 2:
				LinkedList<Integer> list1 = new LinkedList<>();
				System.out.println("Adding n elements from head");
				int n1 = sc.nextInt();
				for (int i = 0; i < n1; i++) {
					list1 = list1.addToTop(list1, sc.nextInt()); // 50, 30, 76
				}
				list1.printList(list1.head);
				break;
			case 3:
				list.printList(list.head);
				System.out.println("Enter the position");
				int position = sc.nextInt();
				list.insertAtPosition(list, position);
				list.printList(list.head);
				break;
			case 4:
				System.out.println("Before Deleting: \n");
				list.printList(list.head);
				list.pop(list);
				System.out.println("\nAfter Deleting: \n");
				list.printList(list.head);
				break;
			case 5:
				System.out.println("Before Deleting Last: \n");
				list.printList(list.head);
				list.popLast(list);
				System.out.println("\nAfter Deleting Last: \n");
				list.printList(list.head);
				break;
			case 6:
				list.printList(list.head);
				System.out.println("Enter the key to serach in given List");
				int data = sc.nextInt();
				list.search(list, data);
				break;
			case 7:
				list.printList(list.head);
				System.out.println("Enter the prev Node and new data: ");
				int prevData = sc.nextInt();
				int data1 = sc.nextInt();
				list.insertAfterNode(list, data1, prevData);
				list.printList(list.head);
				break;
			case 8:
				list.printList(list.head);
				System.out.println("Enter the given Node: ");
				int data2 = sc.nextInt();
				list.deleteGivenNode(list, data2);
				list.printList(list.head);
				break;
			case 9:
				System.out.println("Adding n elements orderly at the end");
				int size = sc.nextInt();
				for (int i = 0; i < size; i++) {
					list.insertOrderly(list, sc.nextInt()); // 50, 30, 76
				}
				list.printList(list.head);
				break;
			case 10:
				System.out.println("Pushing n Elements in the Stack");
				int n2 = sc.nextInt();
				for (int i = 0; i < n2; i++) {
					stack.push(sc.nextInt());// 56, 30, 70
				}
				stack.printStack();
				break;
			case 11:
				System.out.println("Popping Elements from the Stack");
				System.out.println("Peek Element is");
				System.out.println(stack.peekStack());
				try {
					stack.popFromStack();
					stack.printStack();
					break;
				} catch (Exception e) {
					System.out.println("Stack Underflowing");
				}
			case 12:
				System.out.println("Enque n Elements in the Queue: ");
				int n3 = sc.nextInt();
				for (int i = 0; i < n3; i++) {
					queue.enQueue(sc.nextInt());
				}
				queue.printQueue();
				break;
			case 13:
				try {
					System.out.println("Dequeue Elements in the Queue: ");
					queue.deQueue();
					queue.printQueue();
					break;
				} catch (Exception e) {
					System.out.println("Queue is Empty");
				}
			default:
				flag = false;
				break;
			}

		}

	}
}
