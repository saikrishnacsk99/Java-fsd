package phase1_4projects;
public class LinearSearch{
public static void main(String[] args) {
	int arr[] =  {10,20,30,23, 40,50, 77};
	
	int key=77;
	
	int indexOfKey = linearSearch(arr, key);
	
	if(indexOfKey != -1)
	System.out.println(key + " was found in index position "+ indexOfKey);
	else
		System.out.println(key + " was not found");
}

private static int linearSearch(int[] arr, int key) {
	
	for (int i=0; i<arr.length; i++) {
		
		if(arr[i] == key) 
			return i;
	}
	
	return -1;
}

}