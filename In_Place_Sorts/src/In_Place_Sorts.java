import java.util.Arrays;


//Kenneth Kim Period 2


public class In_Place_Sorts {
	
	
	public static void main(String args[])
	{
		int [] test1 = {1, 4, 4, 5, 2, 4, 3, 17, 0};
		double [] test2 = {1.1, 4.1, 4.2, 5.0, 2.0, 4.0, 3.0, 17.0, 0.0};
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
	/*	
		start = System.nanoTime();
		bubbleSort(test3);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Test3 took: " + time + "nanoseconds");
		System.out.println(Arrays.toString(test3)); */
	}
	//Insertion
	public static void insertionSort(int[] test1)
	{
		int length1 = test1.length; // length1 equals length of test1
        for (int i=1; i<length1; i++) //starts at index 1 and checks up to last index of test1
        {
            int k = test1[i]; //value at index i of test1
            int j = i-1; // current index - 1
            while (j>=0 && test1[j]>k) //while the index equal or greater to 1 and index value before is greater than the index value after in test1
            {
                test1[j+1] = test1[j]; //moves index position back one
                j = j-1; // (current index - 1) -1
                //index position is moved backed until value at index is less than the value of index after
            }
            test1[j+1] = k; //else, leave order alone (test1[j+1] = test1[i] = integer k)
        }
	}
	//reference to https://www.geeksforgeeks.org/insertion-sort/
	
	//Selection
	public static void selectionSort(double[] test2)
	{
		int length2 = test2.length; // length equals length of test2
		for (int i=0; i<length2-1; i++) //for loop from the first index to the last index of the test2
		{
			int small = i; //small = previous index
			for (int large = i+1; large<length2; large++) //for loop for later index checking upward until it reaches test2.length
			{
				if (test2[large]<test2[small]) // condition: if later index is smaller than previous index
				{
					small = large; //set small to equal large
				}
			}
			double value = test2[small]; //set double value to equal the value at index small
			test2[small] = test2[i]; //set index small to equal index i
			test2[i] = value; //set value at test2[i] to equal double value which equals value from test2[small]
			
		}
	}
	//reference to https://www.geeksforgeeks.org/selection-sort/
	
	//Bubble
	public static bubbleSort(String[] test3)
	{
		int length3 = test3.length;
		int swap_counter = 0;
		while (swap_counter !=0)
		{
			int first = i;
			for (int first=0; first<length3-1; first++)
			{
				if (test3[i+1]<test3[i])
				{
				
				}
			}	
		}

	}
}

