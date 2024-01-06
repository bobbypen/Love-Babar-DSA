package matrix;

import java.util.*;

public class spirallyMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r = 2, c = 3;
//			int	matrix[][] = {{1, 2, 3, 4},
//							 {5, 6, 7, 8},
//				             {9, 10, 11, 12},
//				             {13, 14, 15,16}};

		int matrix[][] = { { 5, 11, 30 }, { 5, 19, 19 } };

		System.out.println(sprial(matrix, r, c));
	}

	public static ArrayList<Integer> sprial(int[][] matrix, int r, int c) {

		int minr = 0;
		int minc = 0;
		int maxr = matrix.length - 1;

		int maxc = matrix[0].length - 1;

		ArrayList<Integer> ll = new ArrayList<>();

		int e = r * c;
		int count = 0;
		while (count < e) {

			for (int i = minc; i <= maxc && count < e; i++) {
//			System.out.print(matrix[minr][i] + " ");
				ll.add(matrix[minr][i]);
				count++;
			}
			minr++;
			

			for (int i = minr; i <= maxr && count < e; i++) {
//			System.out.print(matrix[i][maxc] + " ");
				ll.add(matrix[i][maxc]);
				count++;
			}

			maxc--;
			

			for (int i = maxc; i >= minc && count < e; i--) {
//			System.out.print(matrix[maxr][i] + " ");
				ll.add(matrix[maxr][i]);
				count++;
			}
			maxr--;
			
			for (int i = maxr; i >= minr && count < e; i--) {
//			System.out.print(matrix[i][minc] + " ");
				ll.add(matrix[i][minc]);
				count++;
			}
			minc++;
			

		}

		return ll;

	}

}
