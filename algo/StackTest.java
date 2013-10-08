public class StackTest {
	public static void main(String[] args) {
		Stack ns = new Stack(7);
		ns.push(2);
		ns.push(7);
		ns.push(4);
		int s = ns.size();
		Tester test = new Tester();
		test.assertEquals(s, 3);
		test.assertFalse(ns.isEmpty());
		test.assertEquals(ns.pop(), 4);
		test.assertFalse(ns.isEmpty());
		test.assertEquals(ns.pop(), 7);
		test.assertEquals(ns.pop(), 2);
		test.assertTrue(ns.isEmpty());
		test.assertEquals(ns.size(), 0);
		try { 
			ns.pop();
		} catch(StackException ex) {
			System.out.println("yahooo!!!!111");
		}
		ns.push(2);
		ns.push(7);
		ns.push(4);
		ns.push(2);
		ns.push(7);
		ns.push(4);
		ns.push(2);
		ns.push(7);
		ns.push(4);


	}
}

