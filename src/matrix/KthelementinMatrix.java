package matrix;

import java.util.*;

public class KthelementinMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N = 4;
				int mat[][] =     {{16, 28, 60, 64},
				                   {22, 41, 63, 91},
				                   {27, 50, 87, 93},
				                   {36, 78, 87, 94 }};
			int K = 3;
			
			kthSmallest(mat,N,K);

	}
	
	
	public static void kthSmallest(int[][]mat,int n,int k) {
		
		int arr[] = new int[n*n];
		
		
		int l = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[l] = mat[i][j];
				l++;
			}
		}
		
		Arrays.sort(arr);
		
		System.out.println(arr[k-1]);
	}
	

}
