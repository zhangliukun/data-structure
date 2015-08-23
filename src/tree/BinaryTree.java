package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

import tree.BinaryTree.TreeNode;

public class BinaryTree {

	private int size;
	public TreeNode rootNode;

	public class TreeNode {
		public int data;
		public TreeNode leftTree;
		public TreeNode rightTree;

		public TreeNode(int data) {
			this.data = data;
		}
	}

	/**
	 * �����µĽڵ�
	 * 
	 * @param node
	 * @param data
	 */
	public void addNewNode(TreeNode node, int data) {

		if (isEmpty()) {
			rootNode = new TreeNode(data);
		} else {
			if (node.data < data) {
				if (node.rightTree != null) {
					addNewNode(node.rightTree, data);
				} else {
					node.rightTree = new TreeNode(data);
				}
			} else {
				if (node.leftTree != null) {
					addNewNode(node.leftTree, data);
				} else {
					node.leftTree = new TreeNode(data);
				}
			}
		}
	}

	/**
	 * ͨ�����鴴��������
	 * 
	 * @param num
	 */
	public void createBinaryTree(int[] num) {

		for (int i = 0; i < num.length; i++) {
			addNewNode(rootNode, num[i]);
		}
	}

	/**
	 * ����������ݹ飩
	 * 
	 * @param node
	 */
	public void preOrder(TreeNode node) {

		if (node == null) {
			return;
		}
		System.out.print(node.data + " ");
		preOrder(node.leftTree);
		preOrder(node.rightTree);
	}

	/**
	 * ����������ݹ飩
	 * 
	 * @param node
	 */
	public void inOrder(TreeNode node) {
		if (node == null) {
			return;
		}
		inOrder(node.leftTree);
		System.out.print(node.data + " ");
		inOrder(node.rightTree);
	}

	/**
	 * ����������ݹ飩
	 * 
	 * @param node
	 */
	public void postOrder(TreeNode node) {
		if (node == null) {
			return;
		}
		postOrder(node.leftTree);
		postOrder(node.rightTree);
		System.out.print(node.data + " ");
	}

	/**
	 * ����������ǵݹ飩
	 * 
	 * @param node
	 */
//	public void stackPreOrder(TreeNode node) {
//		Stack<TreeNode> stack = new Stack<TreeNode>();
//		stack.push(node);
//		while (stack.size() != 0) {
//			TreeNode subNode = stack.pop();
//			System.out.print(subNode.data + " ");
//			if (subNode.rightTree != null) {
//				stack.push(subNode.rightTree);
//			}
//			if (subNode.leftTree != null) {
//				stack.push(subNode.leftTree);
//			}
//		}
//	}

//���벻ͨ�÷���	
//	public void stackInOrder(TreeNode node){
//		Stack<TreeNode> stack = new Stack<TreeNode>();
//		stack.push(node);
//		while(stack.size()!=0){
//			TreeNode subNode = stack.pop();
//			if (subNode.rightTree!=null) {
//				stack.push(subNode.rightTree);
//			}
//			if (subNode.leftTree!=null) {
//				stack.push(subNode.leftTree);
//			}
//		}
//	}
	
	public void stackPreOrder(TreeNode node){
		Stack<TreeNode> stack = new Stack<TreeNode>();
		while(node!=null||!stack.isEmpty()){
			while(node!=null){
				System.out.print(node.data+" ");
				stack.push(node);
				node = node.leftTree;
			}
			node = stack.pop();
			node = node.rightTree;
			
		}
	}
	

	/**
	 * ������������У�
	 * 
	 * @param node
	 */
	public void levelOrder(TreeNode node) {

		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(node);

		while (queue.size() != 0) {
			TreeNode subNode = queue.poll();
			System.out.print(subNode.data + " ");
			if (subNode.leftTree != null) {
				queue.add(subNode.leftTree);
			}
			if (subNode.rightTree != null) {
				queue.add(subNode.rightTree);
			}
		}
	}

	/**
	 * �õ������������
	 * 
	 * @param node
	 * @return
	 */
	public int getDepth(TreeNode node) {
		if (node == null) {
			return 0;
		}
		int leftDepth = getDepth(rootNode.leftTree);
		int rightDepth = getDepth(rootNode.rightTree);
		return leftDepth > rightDepth ? (leftDepth + 1) : (rightDepth + 1);
	}

	/**
	 * �ж��Ƿ�Ϊ��
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		if (rootNode == null) {
			return true;
		} else {
			return false;
		}
	}

}
