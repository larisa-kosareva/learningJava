public class WindowTest {
	public static void main(String[] args) {
		int[] a = {3, 5, 8, 4, 2, 6};
		int[] expected = {8, 8, 8, 6};
		Tester test = new Tester();
		Window w = new Window();

		test.assertArraysEqual(expected, w.maxInWindow(3, a));
	}
}