package BinaryTree;

class arrayTree {
	int[] array;
	int size; // total number of nodes in a tree.

	arrayTree(int height) {
		size = (int) Math.pow(2, height) - 1;
		// total no. of nodes in a tree = (2^height - 1)
		array = new int[size];
	}

	void insert(int data, int node, char position) {
		/**
		 * int data >> Data value to be inserted in the tree. int node >> Node position
		 * in the array where the data has to be inserted. char position >> to be
		 * inserted at the given node position as a Right Child (R) or Left Child (L).
		 **/
		int insert_index;
		if (array[node] == 0) {
			// Node value=0 is considered as null in the program.
			System.out.println("Invalid Node Input!");
			return;
		}
		if (position == 'L') {
			insert_index = 2 * node + 1;
			// Left child of particular node = (2*node + 1); if root is at index =0.
			array[insert_index] = data;

		} else if (position == 'R') {
			insert_index = 2 * node + 2;
			// Right child of particular node = (2*node + 1); if root is at index =0.
			array[insert_index] = data;
		} else {
			System.out.println("Please specify Position (L or R)");
		}
	}

	void insert(int data) {
		array[0] = data;
		// Root position is considered at index 0 in the array.
		// Overloading insert() method to insert root value.
	}

	void print_tree() {
		for (int i : array) {
			if (i == 0)
				System.out.print("_ ");
			else
				System.out.print(i + " ");
		}
		System.out.println();
	}

}

public class BinaryTree_Array {

	public static void main(String[] args) {
		arrayTree tree = new arrayTree(4);
		tree.insert(50); // Root Value Insertion
		tree.insert(95, 0, 'L');
		tree.insert(67, 0, 'R');
		tree.insert(74, 2, 'L');
		tree.insert(41, 2, 'R');
		tree.print_tree();
	}

}
