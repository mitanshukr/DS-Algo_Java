package StaticArray;

import java.util.Arrays;

class Sorting {
	int[] array;

	Sorting(int[] array) {
		this.array = array;
	}

	int[] sortmethod() {
		int max = 0;
		int min = 100;
		int[] output;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max)
				max = array[i];
			if (array[i] < min)
				min = array[i];
		}
		output = new int[] { min, max };
		return output;
	}

}

public class min_max_value {

	public static void main(String[] args) {

		int[] arr = { 23, 34, 16, 64, 35, 89, 12, 56, 43, 4, 19, 98, 45, 37 };

		Sorting sort = new Sorting(arr);

		int[] result = sort.sortmethod();
		System.out.println(result[1]);

		System.out.println("[MIN, MAX] element in the array: " + Arrays.toString(sort.sortmethod()));

	}

}
