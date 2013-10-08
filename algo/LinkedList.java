public class LinkedList {
	private LinkedList next;
	private LinkedList previous;
	private int val;

	public LinkedList(int v) {
		val = v;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int e) {
		val = e;
	}

	public  LinkedList getNext() {
		return next;
	}

	public void setNext(LinkedList n) {
		next = n;
	}

	public  LinkedList getPrevious() {
		return previous;
	}

	public void setPrevious(LinkedList p) {
		previous = p;
	}

} 
