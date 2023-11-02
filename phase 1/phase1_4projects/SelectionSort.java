package phase1_4projects;
import java.util.Arrays;
public class SelectionSort {
	public static void main(String[] args) {
		

		 int[] arr = {29,27,50,53,25,21};
		 
		 System.out.println("GIVEN ARRAY : " + Arrays.toString(arr));
		 
		 selectionSort(arr);
		 
		 System.out.println("SORTED ARRAY : " + Arrays.toString(arr));	 

	}

	public static void selectionSort(int[] array) {

		for (int i = 0; i < array.length; i++) {
			int minIndex = i;

			for (int j = i + 1; j < array.length; j++) {

				if (array[j] < array[minIndex]) {
					minIndex = j;
				}

			}
			
			// swap if i and minIndex are at different positions
			if (i != minIndex) {
				int temp = array[i];
				array[i] = array[minIndex];
				array[minIndex] = temp;
			}

		}

	}
}
