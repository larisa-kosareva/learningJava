public class StackNode{
	private StackNode next;
	private int val;

	public StackNode(int v) {
		val = v;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int e) {
		val = e;
	}

	public  StackNode getNext() {
		return next;
	}

	public void setNext(StackNode n) {
		next = n;
	}

}