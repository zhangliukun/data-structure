package tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

import org.omg.CORBA.PUBLIC_MEMBER;

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
	 * 增加新的节点
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
	 * 通过数组创建二叉树
	 * 
	 * @param num
	 */
	public void createBinaryTree(int[] num) {

		for (int i = 0; i < num.length; i++) {
			addNewNode(rootNode, num[i]);
		}
	}

	/**
	 * 先序遍历（递归）
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
	 * 先序遍历（非递归）
	 * 
	 * @param node
	 */
	public void stackPreOrder(TreeNode node) {
		if (node == null) {
			return;
		}
		Stack<TreeNode> stack = new Stack<TreeNode>();
		while (node != null || !stack.isEmpty()) {
			while (node != null) {
				System.out.print(node.data + " ");
				stack.push(node);
				node = node.leftTree;
			}
			node = stack.pop();
			node = node.rightTree;

		}
	}

	/**
	 * 中序遍历（递归）
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
	 * 中序遍历（非递归）
	 * 
	 * @param node
	 */
	public void stackInOrder(TreeNode node) {
		if (node == null) {
			return;
		}
		Stack<TreeNode> stack = new Stack<TreeNode>();
		while (node != null || !stack.isEmpty()) {
			while (node != null) {
				stack.push(node);
				node = node.leftTree;
			}
			TreeNode subNode = stack.pop();
			System.out.print(subNode.data + " ");
			if (subNode.rightTree != null) {
				node = subNode.rightTree;
			}

		}
	}

	/**
	 * 后序遍历（递归）
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
	 * 后序遍历（非递归）
	 * 
	 * @param node
	 */
	public void stackPostOrder(TreeNode node) {
		if (node == null) {
			return;
		}
		
		Map<TreeNode, Boolean> isVisited = new HashMap<TreeNode,Boolean>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(node);
		while (!stack.isEmpty()) {
			TreeNode subNode = stack.peek();
			while (subNode != null) {
				if (!isVisited.containsKey(subNode.leftTree)&&subNode.leftTree != null) {
					stack.push(subNode.leftTree);
					subNode = subNode.leftTree;
				}else {
					break;
				}
			}
			if (!isVisited.containsKey(subNode.rightTree)&&subNode.rightTree != null) {
				stack.push(subNode.rightTree);
				subNode = subNode.rightTree;
				continue;
			}
			
			subNode = stack.pop();
			isVisited.put(subNode, true);
			System.out.print(subNode.data +" ");
			
			
			

		}
	}

	/**
	 * 层序遍历（队列）
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
	 * 得到二叉树的深度
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
	 * 判断是否为空
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
