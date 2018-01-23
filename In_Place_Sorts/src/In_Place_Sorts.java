
public class In_Place_Sorts {
	
	
	public static void main(String args[])
	{
		int[] list1 = { 5,2,8,3,9,4,1,7};
		insertionSort(list1);
		System.out.println("Sorted Result:" + list1);;
	}
	//Insertion
	public static void insertionSort(int[] list1)
	{
		int length = list1.length; // length equals length of list1
        for (int i=1; i<length; i++) //starts at index 1 and checks up to last index of list1
        {
            int k = list1[i]; //value at index i of list1
            int j = i-1; // current index - 1
            while (j>=0 && list1[j]>k) //while the index equal or greater to 1 and index value before is greater than the index value after in list1
            {
                list1[j+1] = j; //moves index position back one
                j = j-1; // (current index - 1) -1
            }
            list1[j+1] = k; //else, leave order alone (list1[j+1] = list1[i] = int k)
        }
	}
	
	
	//Selection
	public static void selectionSort(double[] list1)
	{
		
	}
	
	
	//Bubble
	public static bubbleSort(String[] list1)
	{
		
	}

}


