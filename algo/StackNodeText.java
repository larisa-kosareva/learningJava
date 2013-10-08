public class StackNodeText {
	public static void main(String[] args) {
		StackNode n1 = new StackNode(4);
		StackNode n2 = new StackNode(3);
		n2.setNext(n1);
		StackNode n3 = new StackNode(2);
		n3.setNext(n2);
		StackNode n4 = new StackNode(1);
		n4.setNext(n3);


		printNode(n4);
		printNode2(n4);

	}

	public static void printNode(StackNode n) {
		System.out.println(n.getVal());
		if (n.getNext() != null) {
			printNode(n.getNext());
		}
	}

	public static void printNode2(StackNode n) {
		StackNode cur = n;
		while (cur != null) {
			System.out.println(cur.getVal());
			cur = cur.getNext();
		}
	}
}