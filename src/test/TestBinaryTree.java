package test;

import java.util.Random;

import tree.BinarySortTree;
import util.DataUtil;
import util.PrintUtil;

public class TestBinaryTree {
	
	public static void main(String[] args){
		int[] num = DataUtil.CreateTestData(5);
		System.out.print("原数组为的结果:");
		PrintUtil.showArrays(num);
		
		BinarySortTree binaryTree = new BinarySortTree();
		binaryTree.createBinaryTree(num);
		
		//System.out.print("二叉树结构为:");
		System.out.println("\n二叉树的节点个数为");
		System.out.println(binaryTree.getNodeNum(binaryTree.rootNode));
		System.out.print("\n先序遍历的结果:");
		binaryTree.preOrder(binaryTree.rootNode);
		System.out.print("\n非递归先序遍历的结果:");
		binaryTree.stackPreOrder(binaryTree.rootNode);
		System.out.print("\n中序遍历的结果:");
		binaryTree.inOrder(binaryTree.rootNode);
		System.out.print("\n非递归中序遍历的结果:");
		binaryTree.stackInOrder(binaryTree.rootNode);
		System.out.print("\n后序遍历的结果:");
		binaryTree.postOrder(binaryTree.rootNode);
		System.out.print("\n非递归后序遍历的结果:");
		binaryTree.stackPostOrder(binaryTree.rootNode);
		System.out.print("\n层序遍历的结果:");
		binaryTree.levelOrder(binaryTree.rootNode);
		
	}
}
