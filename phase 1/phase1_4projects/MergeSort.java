package phase1_4projects;
import java.util.Arrays;
public class MergeSort {
	public static void main(String[] args) {

		int[] originalArray = {  9, 6, 3, 1, 2, 4, 5 };

		int[] sortedArray = mergeSort(originalArray);

		System.out.println("\nOriginal Array: " + Arrays.toString(originalArray));
		System.out.println("\nSorted Array: " + Arrays.toString(sortedArray));

	}

	public static int[] merge(int[] array1, int[] array2) {
		int[] combined = new int[array1.length + array2.length];
		int index = 0;
		int i = 0;
		int j = 0;

		while (i < array1.length && j < array2.length) {
			if (array1[i] < array2[j])
				combined[index++] = array1[i++];
			else
				combined[index++] = array2[j++];
		}
		
		while (i < array1.length) 
			combined[index++] = array1[i++];
		
		while (j < array2.length) 
			combined[index++] = array2[j++];
		
		return combined;
	}
public static int[] mergeSort(int[] array) {
		// base case
		if (array.length == 1)
			return array;

		int midIndex = array.length / 2;
		int[] left = mergeSort(Arrays.copyOfRange(array, 0, midIndex));
		int[] right = mergeSort(Arrays.copyOfRange(array, midIndex, array.length));

		return merge(left, right);
	}
}
