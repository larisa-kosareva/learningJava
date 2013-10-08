public class HeapSortTest{
	public static void main(String[] args) {
		HeapSort heapes = new HeapSort();
		int[] testA = {2, 3, 4, 7, 5, 6, 1, 8, 12, 9};
		int[] result = heapes.buildheap(testA);
		printArray(result);
	
		int[] testc = {2, 3, 4};
		int[] resultc = heapes.swap(testc, 1, 2);
		printArray(resultc);

		int[] testS = {2, 3, 4, 7, 5, 6, 1, 8, 12, 9};
		int[] resultS = heapes.sortheap(testS);
		printArray(resultS);
	
		
   	}

   	public static void printArray(int[] a) {
   		int k = a.length;
   		for (int i = 0; i < k; i++) {
   			System.out.print(a[i] + " ");
   		}
   		System.out.println();

   	}
} 