package Test2;

public class arrayClass {
	
	int holder;
	int[] sortedArr;
	int mid;
	double median;
	int largest;
	
	public arrayClass(int[] arr) {
		int length = arr.length;
		
		for (int x = 0; x < length; x++) {
			for(int y = 1; y < length-x; y++) {
				if (arr[y] < arr[y-1]) {
					holder = arr[y-1];
					arr[y-1] = arr[y];
					arr[y] = holder;
				}
			}
		}
		
		sortedArr = arr;
		mid = length/2;
		if(length % 2 == 0) {
			median = ((double)arr[mid]+(double)arr[mid+1])/2;
		}
		else {
			median = (double)arr[mid];
		}
		
		largest = arr[length-1];
	}

}
