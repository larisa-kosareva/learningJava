public class QueueTest {
	public static void main(String[] args) {
		Tester t = new Tester();
		Queue nq = new Queue(4);
		nq.push(34);
		t.assertEquals(34, nq.pop());
		t.assertEquals(0, nq.size());
		t.assertTrue(nq.isEmpty());
		nq.push(35);
		t.assertEquals(1, nq.size());
		t.assertFalse(nq.isEmpty());

		Queue nq1 = new Queue(4);
		nq1.push(0);
		nq1.push(1);
		nq1.push(2);
		t.assertEquals(nq1.pop(), 0);
		nq1.push(3);
		t.assertEquals(nq1.pop(), 1);
		nq1.push(4);
		t.assertEquals(nq1.pop(), 2);
		t.assertEquals(nq1.pop(), 3);
		t.assertEquals(nq1.pop(), 4);

		Queue nq2 = new Queue(4);
		nq2.push(0);
		nq2.push(1);
		nq2.push(2);
		nq2.push(3);
		try {
			nq2.push(4);
		} catch(QueueException ex) {
			System.out.println(" yahoo !!!!!11111");
		}
		t.assertEquals(4, nq2.size());	
		t.assertEquals(nq2.pop(), 0);
		t.assertEquals(nq2.pop(), 1);
		t.assertEquals(nq2.pop(), 2);
		t.assertEquals(nq2.pop(), 3);
		try {
			nq2.pop();
		} catch(QueueException ex) {
			System.out.println("fuck!!!");
		}		
	}
}