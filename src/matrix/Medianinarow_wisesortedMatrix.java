package matrix;
import java.util.*;
public class Medianinarow_wisesortedMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int R = 3, C = 1;
//			int[][]	matrix = {{1, 3, 5}, 
//				     {2, 6, 9}, 
//				     {3, 6, 9}};
		int[][]	matrix = {{1}, 
			     {2}, 
			     {3}};
			
			
			
			
			
			System.out.println(median(matrix,R,C));
//			median(matrix,R,C);

	}
	
	public static int median(int[][]matrix,int row,int col) {
		
		//go through mean median (formula), mode
		
		int[] arr = new int[row*col];
		int n = arr.length;
		
		int c = 0;
		
		int median = 0;
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[c] = matrix[i][j];
				c++;
			}
			
		}
		
		Arrays.sort(arr);
//		{1,2,3,3,5,6,6,9,9}.
		
		if (n%2==0) {
			
			int first = n/2;
			int second = (n/2)+1;
			
			
			median = (arr[first] +arr[second])/2;
			
			return arr[median-1]; //-1 for indexing
			
			
		}else {
			return arr[((n+1)/2) - 1]; // -1 for indexing
		}
		
		
		  
	}

}
