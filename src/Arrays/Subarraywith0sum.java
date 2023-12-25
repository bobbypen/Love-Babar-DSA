package Arrays;

import java.util.Arrays;

public class Subarraywith0sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		int[] arr = {4,2,-3,1,6};
		
		for (int i = 0; i < n; i++) {
			
			int prev = 0;
    		for(int j =i;j<arr.length;j++){
			prev = prev + arr[j];
			
			if (prev==0) {
			
				System.out.println(true);
				return;
			}
			
    		}
			
		
		
	
	}
		
		System.out.println("False");

	}

}
