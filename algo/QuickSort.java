public class QuickSort {
	public int[] swap(int[] a, int j, int i) {
		int b = a[j];
		a[j] = a[i];
		a[i] = b;
		return a;
	}

	public int partition(int[] a, int l, int r) {
		int i = l - 1;
		int j = l - 1;

		for (j = l; j <= r; j++) {
			if (a[j] <= a[r]) {
				swap(a, j, i + 1);
				i = i + 1;
			}
		}
		return i;
	}

	public void quicksort(int[] a, int l, int r) {
		if (l >= r) {
			return ;
		} else {
			int m = partition(a, l, r);
			quicksort(a, l, m - 1);
			quicksort(a, m + 1, r);
		}
	}
}