package Test2;

import java.util.Arrays;

public class mainClass {

	public static void main(String[] args) {
		
		int[] arr = {1, 9, 7, 10, 3};
		arrayClass sorter = new arrayClass(arr);
		
		System.out.println("Sorted Array:" + Arrays.toString(sorter.sortedArr));
		System.out.println("Median: " + sorter.median);
		System.out.println("Largest: " + sorter.largest);

	}

}
