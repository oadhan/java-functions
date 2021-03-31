//Write a method that takes an int array and returns the second largest value in the array. 
//If the array has less than two elements, your method should return -1.

import java.util.*;

public class arrays {
	public static void main (String[] args) {
		//Just a way to test the method
		int[] arr = {1, 2, 5, 8, 9, 3};
		int ans = secondLargest(arr);
		System.out.println(ans);
	}

	//The assingment method!
	public static int secondLargest(int[] arr){
		Arrays.sort(arr);
		int len = arr.length;

		if (len < 2){
			return -1;
		}

		int index = len - 2;
		int secondLargestVal = arr[index];
		return secondLargestVal;
	}
}