public class QuickSortTest {
	public static void main(String[] args) {
		QuickSort quick = new QuickSort();
		int[] testA = {2, 3, 4, 7, 5, 6, 1, 8, 12, 9};
		quick.quicksort(testA, 0, 9);
		printArray(testA);
	
		
   	}

   	public static void printArray(int[] a) {
   		int k = a.length;
   		for (int i = 0; i < k; i++) {
   			System.out.print(a[i] + " ");
   		}
   		System.out.println();

   	}

   	public assertArrayEqual(int[] a, int[] b){
   		int k = a.length;
   		int l = b.length;
   		
   	}
	
}