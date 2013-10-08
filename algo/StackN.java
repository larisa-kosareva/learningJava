public class StackN {
	private StackNode head = null;

	public void push(int n) {
		StackNode nn = new StackNode(n);
		//nn.setVal(n);
		nn.setNext(head);
		head = nn;
	}

	public int pop() {
		if (isEmpty()) {
			throw new StackException("stack is empty");
		}

		int a = head.getVal();
		head = head.getNext();
		return a;
		
	}

	public boolean isEmpty() {
		return head == null;
	}
}