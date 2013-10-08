public class SortEditionTest {
	
	public static void main(String[] args) {
		SortEdition edi = new SortEdition();
		int[] testA = {7, 8, 3, 5, 11, 4, 2, 9, 10};
		edi.sortedition(testA, 0, 8, 6);
		printArray(testA);
	
		
   	}

   	public static void printArray(int[] a) {
   		int k = a.length;
   		for (int i = 0; i < k; i++) {
   			System.out.print(a[i] + " ");
   		}
   		System.out.println();

   	}
}