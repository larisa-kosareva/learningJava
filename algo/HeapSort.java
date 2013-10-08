public class HeapSort {
	public int[] buildheap(int[] a) {
		int n = a.length;
		for (int i = n / 2; i >= 0; i--) {
			heapify(a, i, n);
		}
		return a;
	}

	public void heapify(int[] a, int i, int sizeHeap) {
		int size = sizeHeap ;
		int max_index = i;
		int left_i = 2 * i + 1;
		int right_i = (i + 1) * 2;

		if ((left_i < size) && (a[max_index] <= a[left_i])) {
			max_index = left_i;
		}

		if ((right_i < size) && (a[max_index] <= a[right_i])) {
			max_index = right_i;
		}

		if (max_index != i) {
			swap(a, i, max_index);
			heapify(a, max_index, size);
		}
	}

	public int[] swap(int[] a, int i, int max_index) {
		int b = a[i];
		a[i] = a[max_index];
		a[max_index] = b;
		return a;
	}

	public int[] sortheap(int[] a) {
		buildheap(a);
		int size = a.length;
		while (size > 1) {
			swap(a, 0, size - 1);
			size = size - 1;
			heapify(a, 0, size);
		}
		return a;
	}


}