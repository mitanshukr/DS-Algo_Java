package StaticArray;

public class duplicate {
	int[] arr;
	int[] duplicate;

	duplicate(int[] arr) {
		this.arr = arr;
		duplicate = new int[arr.length];
	}

	void duplicateElement() {
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j] && arr[j] >= 0) {
					count++;
					arr[j] = -arr[j];
				}
			}
			duplicate[i] = count;
			count = 0;
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 0) {
				System.out.println("No. of Duplicate Element(s) of {" + arr[i] + "} is/are: " + duplicate[i]);
			} else {
				arr[i] = -arr[i];
				// This will change all the negative elements back to positive, i.e. Going back
				// to original array.
				/*
				 * As we have referred the array object in the constructor, any change to the
				 * array elements- in this class will also change the array elements in the main
				 * class.
				 */
			}
		}
	}
}
