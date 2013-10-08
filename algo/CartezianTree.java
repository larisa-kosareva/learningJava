import java.util.Random;

public class CartezianTree {
	private TreeNode root;
	private Random rnd = new Random();
	private int size = 0;

	public void add(int el) {
		if (!contains(el)) {
			//System.out.println(" add " + el);
			TreeNode a = new TreeNode();
			a.setVal(el);
			a.setY(rnd.nextInt());
			//System.out.println("a =" + a);

			if (root == null) {
				root = a;
			} else {
			//	System.out.println("root = " + root);
				SplitResults res = split(root, el);
			//	System.out.println("res =" + res);
				TreeNode m = merge(res.getLeftTree(), a);
			//	System.out.println("first merge m =" + m);
				root = merge(m, res.getRightTree());
			//	System.out.println("second merge root =" + root); 
			}
			size++;
		}
	}

	public boolean contains(int el) {
		TreeNode t = root;
		while (t != null) {
			if (el == t.getVal()) {
				return true;
			} else if (el < t.getVal()) {
				t = t.getLeftChild();
			} else {
				t = t.getRightChild();
			}
		}
		return false;
	}

	public void remove(int el) {
		if (contains(el)) {
			SplitResults r1 = split(root, el);
			SplitResults r2 = split(r1.getRightTree(), el + 1);
			root = merge(r1.getLeftTree(), r2.getRightTree());
			size--;
		}


	}

	public boolean isEmpty() {
		return root == null;
	}

	public int size() {
		return size;
	}

	public int min() {
		if (isEmpty()) {
			throw new TreeException("tree is empty");
		}
		TreeNode mostLeft = root;
		while (mostLeft.getLeftChild() != null) {
			mostLeft = mostLeft.getLeftChild();
		}
		return mostLeft.getVal();
	}

	public int max() {
		if (isEmpty()) {
			throw new TreeException("tree is empty");
		}
		TreeNode mostRight = root;
		while (mostRight.getRightChild() != null) {
			mostRight = mostRight.getRightChild();
		}
		return mostRight.getVal();
	}



	SplitResults split(TreeNode tree, int x) {
		//System.out.println("root split, val = " + tree.getVal());
		if (tree.getVal() < x) {
			//left tree
			if (tree.getRightChild() != null) {
				SplitResults twoTrees = split(tree.getRightChild(), x);
				tree.setRightChild(twoTrees.getLeftTree());
				return new SplitResults(tree, twoTrees.getRightTree());
			} else {
				return new SplitResults(tree, null);
			}
		} else {
			// right tree and x
			if (tree.getLeftChild() != null) {
				SplitResults twoTrees = split(tree.getLeftChild(), x);
				tree.setLeftChild(twoTrees.getRightTree());
				return new SplitResults(twoTrees.getLeftTree(), tree);
			} else {
				return new SplitResults(null, tree);
			}
		}
	}

	TreeNode merge(TreeNode left, TreeNode right) {
		if ((left != null) && (right == null)) {
			return left;
		}

		if ((left == null) && (right != null)) {
			return right;
		}

		if ((left == null) && (right == null)) {
			return null;
		}

		if (left.getY() > right.getY()) {
			if (left.getRightChild() == null) {
				left.setRightChild(right);
			} else {
				TreeNode oldRight = left.getRightChild();
				if (oldRight.getY() < right.getY()) {
					left.setRightChild(right);
				} 
				merge(oldRight, right);
			}
			return left;
		} else {
			if (right.getLeftChild() == null) {
				right.setLeftChild(left);
			} else {
				TreeNode oldLeft = right.getLeftChild();
				if (oldLeft.getY() < left.getY()) {
					right.setLeftChild(left);
				} 
				merge(left, oldLeft);
			}
			return right;
		}
	}




}

class SplitResults {
	private TreeNode leftTree;
	private TreeNode rightTree;

	public SplitResults(TreeNode leftTree, TreeNode rightTree) {
		this.leftTree = leftTree;
		this.rightTree = rightTree;
	}

	public TreeNode getLeftTree() {
		return leftTree;
	}

	public TreeNode getRightTree() {
		return rightTree;
	}

	@Override
	public String toString() {
		return "SplitResults [ leftTree =" + leftTree + ", rightTree = " +
			 rightTree + "]";  
	}
}