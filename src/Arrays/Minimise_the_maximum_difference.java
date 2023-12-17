package Arrays;

import java.util.*;

public class Minimise_the_maximum_difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Arr[] = {7,7,3,5	};
		
		int n = Arr.length;
		int k = 1;
		
		  int [] sum = new int[n];
	        
	        
	        for(int i = 0; i<n;i++){
	        	int aa = (Arr[i]-k);
	        	if(aa<=0) {
	        		sum[i] = Arr[i] + k;
	        	}else {
	        	
	        		sum[i] = Arr[i] - k;
	        	
	        	}
	            
	            
	        }
	        Arrays.sort(sum);
	        
	        for (int i = 0; i < sum.length; i++) {
				System.out.print(sum[i] + " ");
			}
		       
	        
	        
	        
	       int d = sum[n-1] - sum[0];
	       System.out.println(d);
	        
		
		
		
	}

}
