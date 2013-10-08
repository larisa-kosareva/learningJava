public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList(4);
		LinkedList l2 = new LinkedList(3);
		l1.setNext(l2);
		l2.setPrevious(l1);
		LinkedList l3 = new LinkedList(2);
		l2.setNext(l3);
		l3.setPrevious(l2);
		LinkedList l4 = new LinkedList(1);
		l3.setNext(l4);
		l4.setPrevious(l3);

		printLListN(l1);
		System.out.println(" ");
		printLListP(l4);
	}

	public static void printLListN(LinkedList n) {
		System.out.println(n.getVal());
		if (n.getNext() != null) {
			printLListN(n.getNext());
		}
	}

	public static void printLListP(LinkedList n) {
		System.out.println(n.getVal());
		if (n.getPrevious() != null) {
			printLListP(n.getPrevious());
		}
	}


}