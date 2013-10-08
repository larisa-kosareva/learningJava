public class SuperArray {
	private int[] a = new int[10];
	private int f = 0;
	
	public void set(int index, int el){
		a[index] = el;
	}
	public int get(int index){
		return a[index];
	}

	public int size(){
		return f;
	}

	public void add(int el) {
		int k = a.length;
		if (f >= k) {
			increase();
		}
		a[f] = el;
		f++;
	}

	private void increase() {
		int k = a.length;
		int s = k * 3 / 2;
		int[] temp = new int[s];
		for (int i = 0; i < k; i++) {
			temp[i] = a[i];
			
		}
		a = temp;
		
		
	} 


}