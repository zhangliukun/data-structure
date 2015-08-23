package test;

import java.util.Random;

import tree.BinaryTree;
import util.DataUtil;
import util.PrintUtil;

public class TestBinaryTree {
	
	public static void main(String[] args){
		int[] num = DataUtil.CreateTestData(6);
		System.out.print("ԭ����Ϊ�Ľ��:");
		PrintUtil.showArrays(num);
		
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.createBinaryTree(num);
		
		//System.out.print("�������ṹΪ:");
		System.out.print("��������Ľ��:");
		binaryTree.preOrder(binaryTree.rootNode);
		System.out.print("\n��������Ľ��:");
		binaryTree.inOrder(binaryTree.rootNode);
		System.out.print("\n��������Ľ��:");
		binaryTree.postOrder(binaryTree.rootNode);
		
		System.out.print("\n�ǵݹ���������Ľ��:");
		binaryTree.stackPreOrder(binaryTree.rootNode);
		System.out.print("\n��������Ľ��:");
		binaryTree.levelOrder(binaryTree.rootNode);
		
	}
}
