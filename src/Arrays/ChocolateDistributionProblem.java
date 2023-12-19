package Arrays;

import java.util.*;

public class ChocolateDistributionProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N = 7, M = 3;
		
//		ArrayList<Integer> gf = new ArrayList<Integer>();
		
		ArrayList<Integer> ar = new ArrayList<Integer>() {
            {
                add(7);
                add(3);
                add(2);
                add(4);
                add(9);
                add(12);
                add(56);
            }
        };
        
        Collections.sort(ar);
        
        
        int i = 0;
		int j = M - 1;
		int mini = Integer.MAX_VALUE; // we take Integer.MAX_VALUE; so its store next min value

		while (j < N) {
			
			int diff = ar.get(j) - ar.get(i);

			mini = Math.min(mini, diff);

			i++;
			j++;

		}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

//		int arr[] = { 7, 3, 2, 4, 9, 12, 56 };
//		Arrays.sort(arr);
//
//		int i = 0;
//		int j = M - 1;
//		int mini = Integer.MAX_VALUE; // we take Integer.MAX_VALUE; so its store next min value
//
//		while (j < N) {
//			
//			int diff = arr[j] - arr[i];
//
//			mini = Math.min(mini, diff);
//
//			i++;
//			j++;
//
//		}

		System.out.println(mini);

	}

}
