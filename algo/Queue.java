public class Queue{
	private int b = 0;
	private int e = 0;
	private int n;
	private int[] a;

	public Queue(int queueSize) {
		n = queueSize;
		a = new int[n];
		System.out.println("queueSize =" + n);
	}

	public void push(int el) {
		if (size() == n) {
			throw new QueueException("queue is full");
		}
		a[e % n] = el;
		e++;
	}

	public int pop() {
		if (isEmpty()) {
			throw new QueueException("queue is empty");
		}
		int k = a[b % n];
		b++;
		return k;
	} 

	public int size() {
		return e - b;
	}

	public boolean isEmpty() {
		if (e == b) {
			return true;
		} else {
			return false;
		}
	}

	
}