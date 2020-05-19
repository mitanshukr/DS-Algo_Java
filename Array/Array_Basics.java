package StaticArray;

import java.util.*;
import java.lang.*;
import java.io.*;

/**
 *
 * @author Mitanshu kumar
 */
 
class arrayObj {
	int[] array;
	int size;
	
	arrayObj(int size){
		this.size = size;
		array = new int[size];
	}
	
	arrayObj(int[] array){
		this.array = array;
	}
	
	/* 
	// insert an element in the array
	void insertOneElement(int position, int element) {
		array[position] = element;
	}
	
	void updateElement(int position, int newElement) {
		array[position]= newElement;
	}
	*/

	void insertElements(int startposition, int ... var) {
		int i=startposition;
		for(int x : var) {
			array[i] = x;
			i++;
		}
	}
	
	int[] getAllElements() {
		return array;
	}

	int getOneElement(int position) {
		return array[position];
	}

	int[] searchElement(int element) {
		int[] pos;
		int count = 0;
		int j = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == element)
				count++;
		}
		if (count == 0)
			return null;
		else {
			pos = new int[count];
			for (int i = 0; i < array.length; i++) {
				if (array[i] == element) {
					pos[j] = i;
					j++;
				}
			}
			return pos;
		}

	}
	
	void sortArray() {
		
	}
	

}

public class BasicArray {

	public static void main(String[] args) {
		arrayObj arr = new arrayObj(10);
		
		//int newarray[] = {1,2,3,4};
		//arrayObj arr1 = new arrayObj(newarray);
		
		
		
		arr.insertElements(0, 23, 34, 32, 84, 32, 3, 67, 78, 32, 2);
		System.out.println("Elements in Array: " + Arrays.toString(arr.getAllElements()));
		
		arr.insertElements(1, 29, 12);
		System.out.println("Updated Array Elements: " + Arrays.toString(arr.getAllElements()));
		
		System.out.println(arr.getOneElement(7));

		System.out.println("Search Element found at position(s): " + Arrays.toString(arr.searchElement(10)));

	}

}
