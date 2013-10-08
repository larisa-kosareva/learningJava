public class MergeSort {
	public int[][] split(int a[]) {
		int k = a.length;
		int l = k / 2;
		int[] la = new int[l];
		int[] ra = new int[k - l];

		for (int i = 0; i < l ; i++) {
			la[i] = a[i];
		}
		for (int i = l; i < k; i++) {
			ra[i - l] = a[i];
		}
		int[][] na = new int[2][];
		na[0] = la;
		na[1] = ra;

		return na;

	}
	public int[] merge(int la[], int ra[]) {
		int m = la.length;
		int n = ra.length;
		int k = m + n;
		int i = 0;
		int il = 0;
		int ir = 0;
		int[] a = new int[k];
		while ((il < m) && (ir < n)) {
			if (la[il] < ra[ir]) {
				a[i] = la[il];
				il++;
			} else {
				a[i] = ra[ir];
				ir++;
			}
			i++;
		}
		while (il < m) {
			a[i] = la[il];
			il++;
			i++;
		}

		while (ir < n) {
			a[i] = ra[ir];
			ir++;
			i++;
		}
		return a;
	}

	public int[] sort(int[] a) {
		int k = a.length;
		if (k <= 1) {
			return a;
		} else {
			int[][] result = split(a);
			int[] l = sort(result[0]);
			int[] r = sort(result[1]);
			int[] na = merge(l, r);
			return na;
		}
	}

}