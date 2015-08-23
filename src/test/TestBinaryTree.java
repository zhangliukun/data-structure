package test;

import java.util.Random;

import tree.BinaryTree;
import util.DataUtil;
import util.PrintUtil;

public class TestBinaryTree {
	
	public static void main(String[] args){
		int[] num = DataUtil.CreateTestData(10);
		PrintUtil.showArrays(num);
		
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.createBinaryTree(num);
		System.out.println("先序遍历的结果");
		binaryTree.preOrder(binaryTree.rootNode);
		System.out.println("\n中序遍历的结果");
		binaryTree.inOrder(binaryTree.rootNode);
		System.out.println("\n后序遍历的结果");
		binaryTree.postOrder(binaryTree.rootNode);
	}
}
