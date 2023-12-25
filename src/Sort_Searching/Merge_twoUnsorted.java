package Sort_Searching;

import java.util.Arrays;

public class Merge_twoUnsorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int	N = 3, M = 3;	
		long []res = new long[N+M];
		long []resi = new long[N+M];
		

			long	A[] = {10, 5, 15};
			long	B[] = {20, 3, 2};
		
		  int j = 0;
	        
	        
	        for(int i = 0; i<N;i++){
	            res[j] = A[i];
	            j++;
	        }
	    
	    for(int i = 0; i<M;i++){
	            res[j] = B[i];
	            j++;
	        }
	        
	        Arrays.sort(res);
	        
	        
	        for (int i = 0; i < res.length; i++) {
		       resi[i] = res[i]; 

			}
	        
	        for (int i = 0; i < resi.length; i++) {
				System.out.println(resi[i]);
			}
	        
	        

	}

}
