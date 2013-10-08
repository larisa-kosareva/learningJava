public class QueueLL {
	private LinkedList head = null;
	private LinkedList end = null;
	private int f = 0;

	public void push(int n) {
		LinkedList nn = new LinkedList(n);
		if (isEmpty()) {
			head = nn;
			end = nn;
	    } else {
		    end.setNext(nn);
		    nn.setPrevious(end);
		    end = nn;
		}
		f++;
	}

	public int pop() {
		if (isEmpty()) {
			throw new QueueException("queue is empty");
		}

		int a = head.getVal();
		if (head == end) {
			end = null;
			head = null;
		} else {
			head = head.getNext();
			head.setPrevious(null);
		}
		f--;
		return a;
	}

	public boolean isEmpty() {
		return head == null && end == null;
	}

	public int size() {
		return f;
	}



}