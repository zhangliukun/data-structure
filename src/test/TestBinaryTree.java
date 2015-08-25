package test;

import java.util.Random;

import tree.BinarySortTree;
import util.DataUtil;
import util.PrintUtil;

public class TestBinaryTree {
	
	public static void main(String[] args){
		int[] num = DataUtil.CreateTestData(5);
		System.out.print("ԭ����Ϊ�Ľ��:");
		PrintUtil.showArrays(num);
		
		BinarySortTree binaryTree = new BinarySortTree();
		binaryTree.createBinaryTree(num);
		
		//System.out.print("�������ṹΪ:");
		System.out.println("\n�������Ľڵ����Ϊ");
		System.out.println(binaryTree.getNodeNum(binaryTree.rootNode));
		System.out.print("\n��������Ľ��:");
		binaryTree.preOrder(binaryTree.rootNode);
		System.out.print("\n�ǵݹ���������Ľ��:");
		binaryTree.stackPreOrder(binaryTree.rootNode);
		System.out.print("\n��������Ľ��:");
		binaryTree.inOrder(binaryTree.rootNode);
		System.out.print("\n�ǵݹ���������Ľ��:");
		binaryTree.stackInOrder(binaryTree.rootNode);
		System.out.print("\n��������Ľ��:");
		binaryTree.postOrder(binaryTree.rootNode);
		System.out.print("\n�ǵݹ��������Ľ��:");
		binaryTree.stackPostOrder(binaryTree.rootNode);
		System.out.print("\n��������Ľ��:");
		binaryTree.levelOrder(binaryTree.rootNode);
		
	}
}
