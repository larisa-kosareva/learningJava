public class PriorityQueue {
	private int f = 0;
	private int[] a;
	private int n;

	public PriorityQueue(int queueSize) {
		n = queueSize;
		a = new int[n];
		//System.out.println("queueSize =" + n);
	}

	private void swap(int i, int j) {
		int b = a[i];
		a[i] = a[j];
		a[j] = b;
	}

	public void push(int el) {
		if (f >= n) {
			throw new QueueException("queue is full");
		}
		a[f] = el;
		bubbleUp(f);
		f++;
	}

	private void bubbleUp(int i) {
		if (i == 0) {
			return;
		} 

		// calculating parent's index
		int pIndex = (i - 1) / 2;
		if (a[pIndex] < a[i]) {
			swap(pIndex, i);
			bubbleUp(pIndex);
		}
	}

	public int pop() {
		if (isEmpty()) {
			throw new QueueException("queue is empty");
		}
		int b = a[0];
		a[0] = a[f - 1];
		bubbleDown(0);
		f--;
		return b;
	}

	public void bubbleDown(int i) {
		int maxIndex = i;
		int left = 2 * i + 1;
		int right = (i + 1) * 2;

		if ((left < f) && (a[maxIndex] <= a[left])) {
			maxIndex = left;
		}

		if ((right < f) && (a[maxIndex] <= a[right])) {
			maxIndex = right;
		}

		if (maxIndex != i) {
			swap(i, maxIndex);
			bubbleDown(maxIndex);
		}
	}

	public boolean isEmpty() {
		return f == 0;
	}

	public int size() {
		return f;
	}

}