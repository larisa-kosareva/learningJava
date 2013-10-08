public class Window {
	public int[] maxInWindow(int size, int[] a) {
		int n = a.length;
		int resultSize = n - size + 1;
		int[] result = new int[resultSize];
		CartezianTree tree = new CartezianTree();
		for (int i = 0; i < size; i++){
			tree.add(a[i]);
		}
		for (int i = 0; i < resultSize; i++) {
			result[i] = tree.max();
			tree.remove(a[i]);
			if (size + i < n) { 
				tree.add(a[size + i]);
			}
		}

		return result;
 	}
}