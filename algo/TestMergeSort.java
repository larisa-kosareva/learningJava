public class TestMergeSort{
	public static void main(String[] args) {
		MergeSort merges = new MergeSort();
		int[] testA = {2, 3, 4, 7, 5, 6, 5};
		int[][] result = merges.split(testA);
		printArray(result[0]);
		printArray(result[1]);
		int[] testB1 = {1, 5, 7};
		int[] testB2 = {3, 6, 8};
		int[] resultB = merges.merge(testB1, testB2);
		printArray(resultB);
		int[] testC1 = {2, 3};
		int[] testC2 = {5, 6, 7};
		int[] resultC = merges.merge(testC1, testC2);
		printArray(resultC);
		int[] resultSort = merges.sort(testA);
		printArray(resultSort);
		
   	}

   	public static void printArray(int[] a) {
   		int k = a.length;
   		for (int i = 0; i < k; i++) {
   			System.out.print(a[i] + " ");
   		}
   		System.out.println();

   	}
} 