package tree;

public class BinaryTree {
	
	private int size;
	public  TreeNode rootNode;
	
	 class TreeNode{
		public int data;
		public TreeNode leftTree;
		public TreeNode rightTree;
		public TreeNode(int data){
			this.data = data;
		}
	}
	
	 //增加新的节点
	public void addNewNode(TreeNode node,int data){
		
		if (isEmpty()) {
			rootNode = new TreeNode(data);
		}else {
			if (node.data < data) {
				if (node.rightTree != null) {
					addNewNode(node.rightTree, data);
				}else {
					node.rightTree = new TreeNode(data);
				}
			}else{
				if (node.leftTree!=null ) {
					addNewNode(node.leftTree, data);
				}else {
					node.leftTree = new TreeNode(data);
				}
			}
		}
	}
	
	public void createBinaryTree(int[] num){
		
		for(int i=0;i<num.length;i++){
			addNewNode(rootNode, num[i]);
		}
	}
	
	/**
	 * 先序遍历
	 * @param node
	 */
	public void preOrder(TreeNode node){

		if (node == null) {
			return;
		}
		System.out.print(node.data+" ");
		preOrder(node.leftTree);
		preOrder(node.rightTree);
	}
	
	/**
	 * 中序遍历
	 * @param node
	 */
	public void inOrder(TreeNode node){
		if (node == null) {
			return;
		}
		inOrder(node.leftTree);
		System.out.print(node.data+" ");
		inOrder(node.rightTree);
	}
	
	
	/**
	 * 后序遍历
	 * @param node
	 */
	public void postOrder(TreeNode node){
		if (node == null) {
			return;
		}
		postOrder(node.leftTree);
		postOrder(node.rightTree);
		System.out.print(node.data+" ");
		
	}
	
	
	public boolean isEmpty(){
		if (rootNode == null) {
			return true;
		}else {
			return false;
		}
	}
	
	
}
