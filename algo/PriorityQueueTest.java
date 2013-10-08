public class PriorityQueueTest {
	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue(7);
		Tester test = new Tester();
		pq.push(7);
		pq.push(2);
		pq.push(3);
		pq.push(4);
		pq.push(6);
		pq.push(5);
		pq.push(1);

		test.assertFalse(pq.isEmpty());
		test.assertEquals(7, pq.size());
		test.assertEquals(7, pq.pop());
		test.assertEquals(6, pq.pop());
		test.assertEquals(5, pq.pop());
		test.assertEquals(4, pq.pop());
		test.assertEquals(3, pq.pop());
		test.assertEquals(2, pq.pop());
		test.assertEquals(1, pq.pop());
		test.assertTrue(pq.isEmpty());
		try { 
			pq.pop();
		} catch(QueueException ex) {
			System.out.println(" yps !!!!1111");
		}

		pq.push(7);
		pq.push(2);
		pq.push(3);
		pq.push(4);
		pq.push(6);
		pq.push(5);
		pq.push(1);
		pq.push(7);
	


	}
}