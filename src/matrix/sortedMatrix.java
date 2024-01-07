package matrix;

import java.util.*;

public class sortedMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N = 4;
		int[][] matrix = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };

		sort(N, matrix);

	}

	public static void sort(int N, int Mat[][]) {

		int arr[] = new int[N * N];

		int[][] ar = new int[N][N];

		int k = 0;
		for (int i = 0; i < Mat.length; i++) {
			for (int j = 0; j < Mat.length; j++) {
				arr[k] = Mat[i][j];
				k++;
			}
		}

		Arrays.sort(arr);

		int l = 0;
		for (int i = 0; i < Mat.length; i++) {
			for (int j = 0; j < Mat.length; j++) {
				Mat[i][j] = arr[l];
				l++;
			}
		}

		for (int i = 0; i < Mat.length; i++) {
			for (int j = 0; j < Mat.length; j++) {
				System.out.print(Mat[i][j] + " ");
			}
		}

	}

}
