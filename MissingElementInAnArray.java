package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {
	
	public static void main(String[] args) {
		// Here is the input
		int[] arr = {1,2,3,4,7,6,8};

		// Sort the array	
		Arrays.sort(arr);
		int missednumber = 0;
		for(int i=0;i<arr.length;i++) {
			int index=i+1;
			if(arr[i]!=index) {
				missednumber=index;
				
				System.out.println(missednumber);break;
			}
			
		}
				// loop through the array (start i from arr[0] till the length of the array)

					// check if the iterator variable is not equal to the array values respectively
					
						// print the number
						
						// once printed break the iteration
						
						

	}

}
