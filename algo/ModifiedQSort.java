import java.util.Random;

public class ModifiedQSort {

	private Random rnd = new Random();

	public int[] swap(int[] a, int j, int i) {
		int b = a[j];
		a[j] = a[i];
		a[i] = b;
		return a;
	}

	public void partition(int[] a, int start,int end){
		int k = a.length;
		int l = start;
		int r = end;

		int m = l + rnd.nextInt(r -l);
		while (l < r) {
			while ((a[l] <= a[m]) && (l < m)) {
				l++;
			}
			while ((a[m] <= a[r]) && (r > m)) {
				r--;
			}
			if (l < r) {
				swap(a, l, r);
				if (l == m) {
					m = r;
				} else {
					if (r == m) {
						m = l;
					}
				}
			}
		}
	}

	public 