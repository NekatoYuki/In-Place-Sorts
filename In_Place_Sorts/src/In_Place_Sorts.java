import java.util.Arrays;

public class In_Place_Sorts {
	
	
	public static void main(String args[])
	{
		int [] test1 = {1,4,4,5,2,4,3,17,0};
		double [] test2 = {1.1, 4.1,4.2,5.0,2.0,4.0,3.0,17.0,0.0};
		String [] test3 = {"zebra", "tortilla", "abba", "foo", "bar", "aba"};
		
		long start = System.nanoTime();
		insertionSort(test1);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Test1 took: " + time + "nanoseconds");
		System.out.println(Arrays.toString(test1));
		
		start = System.nanoTime();
		selectionSort(test2);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Test2 took: " + time + "nanoseconds");
		System.out.println(Arrays.toString(test2));
		
		start = System.nanoTime();
		bubbleSort(test3);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Test3 took: " + time + "nanoseconds");
		System.out.println(Arrays.toString(test3));
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


