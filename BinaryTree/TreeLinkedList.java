package BinaryTree;

import LinkedList.*;

class treeNode {
	int data;
	treeNode lchild;
	treeNode rchild;
}

class ListTree {

	treeNode create(Node preorder, Node inorder, int num) {
		Node preorderHead = preorder;
		Node inorderHead = inorder;
		treeNode node = new treeNode();
		Node temp;
		int i, j;

		if (num == 0)
			return null;
		node.data = preorderHead.data;
		node.lchild = null;
		node.rchild = null;
		if (num == 1)
			return node;
		temp = inorderHead;
		for (i = 0; temp.data != preorderHead.data; i++) {
			temp = temp.next;
		}
		node.lchild = create(preorderHead.next, inorderHead, i);
		for (j = 1; j <= j + 1; j++) {
			preorderHead = preorderHead.next;
		}
		node.rchild = create(preorderHead, temp.next, num - i - 1);

		return node;
	}
}

public class TreeLinkedList {

	public static void main(String[] args) {
		// int[] in = {2, 4, 5, 24, 53, 32, 43};
		// int[] pre = {32, 5, 53, 43, 2, 24, 4};
		LinkedList pre = new LinkedList();
		LinkedList in = new LinkedList();
		pre.insert(32);
		pre.insert(5);
		pre.insert(53);
		pre.insert(43);
		pre.insert(2);
		pre.insert(24);
		pre.insert(4);

		in.insert(2);
		in.insert(4);
		in.insert(5);
		in.insert(24);
		in.insert(53);
		in.insert(32);
		in.insert(43);

		ListTree tree = new ListTree();
		tree.create(pre.head, in.head, 7);
	}

}
