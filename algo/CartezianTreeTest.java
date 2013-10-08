public class CartezianTreeTest {
	public static void main(String[] args) {
		CartezianTreeTest n = new CartezianTreeTest();
		n.mergeAndSplitTest();
		n.treeTest();
		n.treeRemoveTest();
		n.treeIsEmptyTest();
		n.treeMinTest();
		n.treeMaxTest();

	}
	public void treeMinTest() {
		System.out.println("start treeMinTest");
		CartezianTree derevo = new CartezianTree();
		Tester test = new Tester();
		try {
			derevo.min();
		} catch (TreeException ex) {
			System.out.println("phaaa !!!!");
		}
		derevo.add(9);
		test.assertEquals(9, derevo.min());
		derevo.add(8);
		test.assertEquals(8, derevo.min());
		derevo.add(7);
		test.assertEquals(7, derevo.min());
		derevo.add(6);
		test.assertEquals(6, derevo.min());
		derevo.add(5);
		test.assertEquals(5, derevo.min());
		System.out.println("end treeMinTest");


	}

	public void treeMaxTest() {
		System.out.println("start treeMaxTest");
		CartezianTree derevo = new CartezianTree();
		Tester test = new Tester();
		try {
			derevo.max();
		} catch (TreeException ex) {
			System.out.println("upsss !!!!");
		}
		derevo.add(5);
		test.assertEquals(5, derevo.max());
		derevo.add(6);
		test.assertEquals(6, derevo.max());
		derevo.add(7);
		test.assertEquals(7, derevo.max());
		derevo.add(8);
		test.assertEquals(8, derevo.max());
		derevo.add(9);
		test.assertEquals(9, derevo.max());
		System.out.println("end treeMaxTest");
		

	}

	public void treeIsEmptyTest() {
		System.out.println("start treeIsEmptyTest");
		CartezianTree derevo = new CartezianTree();
		Tester test = new Tester();
		test.assertTrue(derevo.isEmpty());
		derevo.add(2);
		test.assertFalse(derevo.isEmpty());
		derevo.remove(2);
		test.assertTrue(derevo.isEmpty());
		System.out.println("end treeIsEmptyTest");
	}

	public void treeRemoveTest() {
		System.out.println("start treeRemoveTest");
		CartezianTree derevo = new CartezianTree();
		Tester test = new Tester();
		derevo.add(5);
		derevo.add(6);
		derevo.add(7);
		derevo.add(8);
		derevo.add(9);

		test.assertTrue(derevo.contains(5));
		test.assertTrue(derevo.contains(6));
		test.assertTrue(derevo.contains(7));
		test.assertTrue(derevo.contains(8));
		test.assertTrue(derevo.contains(9));

		derevo.remove(7);
		test.assertFalse(derevo.contains(7));
		test.assertTrue(derevo.contains(5));
		test.assertTrue(derevo.contains(6));
		test.assertTrue(derevo.contains(8));
		test.assertTrue(derevo.contains(9));

		System.out.println("end treeRemoveTest");
				
	}

	public void treeTest(){
		System.out.println("start treeTest");
		CartezianTree derevo = new CartezianTree();
		Tester test = new Tester();
		derevo.add(5);
		derevo.add(3);
		derevo.add(7);

		test.assertTrue(derevo.contains(3));
		test.assertTrue(derevo.contains(5));
		test.assertTrue(derevo.contains(7));

	}

	public void mergeAndSplitTest() {
		System.out.println("start mergeAndSplitTest");
		TreeNode root = new TreeNode();
		root.setVal(2);
		root.setY(20);
		TreeNode ltree = new TreeNode();
		ltree.setVal(1);
		root.setLeftChild(ltree);
		ltree.setY(18);
		TreeNode rtree = new TreeNode();
		rtree.setVal(200);
		root.setRightChild(rtree);
		rtree.setY(19);
		TreeNode l50 = new TreeNode();
		l50.setVal(50);
		rtree.setLeftChild(l50);
		l50.setY(16);
		TreeNode r210 = new TreeNode();
		rtree.setRightChild(r210);
		r210.setVal(210);
		r210.setY(17);
		TreeNode r120 = new TreeNode();
		l50.setRightChild(r120);
		r120.setVal(120);
		r120.setY(15);
		TreeNode l70 = new TreeNode();
		r120.setLeftChild(l70);
		l70.setVal(70);
		l70.setY(13);
		TreeNode r150 = new TreeNode();
		r120.setRightChild(r150);
		r150.setVal(150);
		r150.setY(14);
		TreeNode r110 = new TreeNode();
		l70.setRightChild(r110);
		r110.setVal(110);
		r110.setY(12);
		TreeNode r115 = new TreeNode();
		r110.setRightChild(r115);
		r115.setVal(115);
		r115.setY(11);
		TreeNode l80 = new TreeNode();
		r110.setLeftChild(l80);
		l80.setVal(80);
		l80.setY(10);
		TreeNode l75 = new TreeNode();
		l80.setLeftChild(l75);
		l75.setVal(75);
		l75.setY(9);

		CartezianTree dec = new CartezianTree();
		SplitResults newTrees = dec.split(root, 100);

		Tester test = new Tester();
		TreeNode left = newTrees.getLeftTree();
		TreeNode right = newTrees.getRightTree();
		test.assertEquals(2, left.getVal());
		test.assertEquals(50, left.getRightChild().getVal());
		test.assertEquals(75, left.getRightChild().getRightChild().getRightChild().
			getLeftChild().getVal());
		test.assertEquals(200, right.getVal());
		test.assertEquals(115, right.getLeftChild().getLeftChild().getRightChild().
			getVal());

		TreeNode drewno = dec.merge(left, right);

		test.assertEquals(2, drewno.getVal());
		test.assertEquals(200, drewno.getRightChild().getVal());
		test.assertEquals(75, drewno.getRightChild().getLeftChild().getRightChild().
			getLeftChild().getRightChild().getLeftChild().getLeftChild().getVal());



	}

}