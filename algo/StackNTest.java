public class StackNTest {
	public static void main(String[] args) {
		StackN sn = new StackN();
		Tester test = new Tester();
		test.assertTrue(sn.isEmpty());
		sn.push(1);
		sn.push(2);
		sn.push(3);
		test.assertFalse(sn.isEmpty());
		test.assertEquals(3, sn.pop());
		test.assertEquals(2, sn.pop());
		test.assertEquals(1, sn.pop());
		test.assertTrue(sn.isEmpty());
		sn.pop();

	}
}