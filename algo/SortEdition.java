public class SortEdition {
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

	public int[] swap(int[] a, int j, int i) {
		int b = a[j];
		a[j] = a[i];
		a[i] = b;
		return a;
	}

	public int searhindex(int[] a,int l, int r, int b) {
		
		for (int i = l; i <= r; i++) {
			if (a[i] == b) {
				return i;
			}
		}
		return -1;
	}

	public void sortedition(int[] a, int  l, int r, int i) {
		//int i = searhindex(a, l, r, ai);
		int m = partition(a, l, r);
		if (m == i) {
			return;
		} else {
			if (m < i) {
				sortedition(a, m + 1, r, i);
			} else {
				sortedition(a, l, m - 1, i);
			}
		}
	}
}