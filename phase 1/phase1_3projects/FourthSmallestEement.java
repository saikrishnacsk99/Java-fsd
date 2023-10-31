package phase1_3projects;
public class FourthSmallestEement {

	// method for sorting the array arr
	public void sortArr(int arr[])
	{
	int size = arr.length;
	for(int i = 0; i < size; i++)
	{
	int temp = i;
	for(int j = i + 1; j < size; j++)
	{
	if(arr[temp] > arr[j])
	{
	temp = j;
	}
	}
	if(temp != i)
	{
	int t = arr[i];
	arr[i] = arr[temp];
	arr[temp] = t;
	}
	}
	}	
	// find the Fourth smallest element of the array
	public int findFourthSmallest(int arr[], int k)
	{
//	sortArr(arr);
	// as an array is always a zero indexing
	// therefore, the Fourth smallest element lies
	// at the k - 1 index
	return arr[k - 1];
	}

	// main method
	public static void main(String argvs[])
	{
	// creating an object of the class KthSmallestEle

	FourthSmallestEement obj = new FourthSmallestEement();

	int arr1[] = {77, 27, 57, 7, 37, 47, 67, 80, 82, 79};
	int size = arr1.length;
	int k = 4;
	System.out.println(" For the array: ");
	for(int i = 0; i < size; i++)
	{
	System.out.print(arr1[i] +" ");
	}
	int ele = obj.findFourthSmallest(arr1, k);
	System.out.println();
	System.out.println(" The " + k + " th smallest element of the array	is:" + ele);
	}

	}