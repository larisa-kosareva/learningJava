public class TreeNode {
	private TreeNode parent;
	private TreeNode leftChild;
	private TreeNode rightChild;
	private int val;
	private int y;

	public void setParent(TreeNode p) {
		parent = p;
	}

	public TreeNode getParent() {
		return parent;
	}

	public void setLeftChild(TreeNode l) {
		leftChild = l;
	}

	public TreeNode getLeftChild() {
		return leftChild;
	}

	public void setRightChild(TreeNode r) {
		rightChild = r;
	}

	public TreeNode getRightChild() {
		return rightChild;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public int getVal() {
		return val;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getY() {
		return y;
	}

	@Override
	public String toString() {
		return "TreeNode [val = " + val + ", y = " + y + ", leftChild = " + leftChild + 
			", rightChild = " + rightChild + " ]";

	}


}