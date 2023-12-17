package Arrays;


import java.util.*;

public class Sum_Of_Max_And_Min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	https://www.codingninjas.com/studio/problems/sum-of-max-and-min_1081476?topList=love-babbar-dsa-sheet-problems&utm_source=website&utm_medium=affiliate&utm_campaign=450dsatracker&leftPanelTabValue=PROBLEM&count=25&page=1&search=&sort_entity=order&sort_order=ASC
		int n = 7;
		
		int [] arr = {	1, 2, 4, 5, 6, 6, 6 };
		int sum = sumOfMaxMin(arr,n);
		System.out.println(sum);

	}

	
	//check dairy 		
	
	public static int sumOfMaxMin(int[] arr, int n) {
	      // Write your code here.


	    Arrays.sort(arr);

	    // int [] a = sort(arr,n);




	    // int sum = a[0]+a[arr.length-1];

	    return arr[0]+arr[arr.length-1];


	  }



	  public static int[] sort(int [] arr,int n){

	    for(int i = 1; i<n;i++){

	      int picked = arr[i];

	      int j = i-1;

	    while(j>=0 && arr[j] > picked ){

	        arr[j+1] = arr[j];

	        j--;

	    }

	    arr[j+1] = picked;


	     

	  }

	       return arr;

	  }
	
	
	
}
