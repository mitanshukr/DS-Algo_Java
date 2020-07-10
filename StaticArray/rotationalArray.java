package StaticArray;

import java.util.Arrays;

class Round {
	int[] array;

	Round(int[] array) {
		this.array = array;
	}

	int[] rotate(int shift, char direction) {
		int temp;
		int lastindex = array.length - 1;
		for (int i = 0; i < shift; i++) {

			if (direction == 'R' || direction == 'r') {
				temp = array[lastindex];
				for (int j = lastindex; j > 0; j--) {
					array[j] = array[j - 1];
				}
				array[0] = temp;

			} else {
				temp = array[0];
				for (int j = 0; j < array.length - 1; j++) {
					array[j] = array[j + 1];
				}
				array[lastindex] = temp;
			}
		}
		return array;
	}

}

public class rotationalArray {

	public static void main(String[] args) {
		int array[] = new int[] { 32, 21, 67, 32, 41, 40, 32, 21 };

		Round rotarr = new Round(array);
		duplicate dup = new duplicate(array);

		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(rotarr.rotate(7, 'r')));
		
		dup.duplicateElement();
		
		System.out.println(Arrays.toString(array));
	}

}
