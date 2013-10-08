public class Stack {
	private int n;
	private int[] a;
	private int f = 0;

	public Stack(int stackSize) {
		n = stackSize;
		a = new int[n];
		//System.out.println("stackSize =" + n);
	}

	public void push(int el) {
		if (f >= n) {
			throw new StackException("stack is full");
		}
	 
		a[f] = el;
		f++;
		System.out.print("a[f] = " + el + " ");
		System.out.println("f = " + f);
	}

	public int pop() {
		if (f == 0) {
			throw new StackException("stack is empty");
		}
		f--;
		int k = a[f];
		a[f] = 0;
		System.out.println("f = " + f);
		return k;
	}

	public boolean isEmpty() {
		if (f == 0) {
			System.out.println("true");
			return true;
		} else {
			System.out.println("false");
			return false;
		}

	}

	public int size() {
		System.out.println("now size stack" + f);
		return f;
	}
}