package Arrays;

import java.util.*;

public class Merge_Without_Extra_Space {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 3, 5, 7 };
		int[] arr1 = { 0, 2, 6, 8, 9 };

		arr(arr,arr1);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}

	}
	
	
	public static void swap(int [] arr, int []arr1, int i , int j) {
		
		
		int temp = arr[j];
		arr[j] = arr1[i];
		arr1[i] = temp;
		
	}
	
	
	public static void arr(int[] arr,int [] arr1) {
		
		int j = arr.length-1;		
		int i = 0;

		while (j>=0 && i<arr1.length) {
			
			
			if (arr[j]>arr1[i]) {
				swap(arr,arr1,i,j);		
			}
			
			
			i++;
			j--;
		
		}
		Arrays.sort(arr);
		Arrays.sort(arr1);
		
	}
	
	
	
	
	

}
