public class Tester {
	public void assertTrue(boolean b) {
		if (b!= true) {
			throw new AssertionError("expected true got false");
		}
	}

	public void assertFalse(boolean b) {
		if (b != false) {
			throw new AssertionError("expected false got true"); 
		}
	}

	public void assertEquals(int a, int b) {
		if (a != b) {
			throw new AssertionError(a + " != " + b);
		}
	}

	public void assertArraysEqual(int[] a, int[] b) {
		if (a.length != b.length) {
			throw new AssertionError("lengths are different");
		} 

		for (int i = 0; i < a.length; i++) {
			assertEquals(a[i], b[i]);
		}
	}
}