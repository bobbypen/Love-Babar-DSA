package matrix;

public class rotatedby90deg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 3;
		int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int arr[] = new int[n * n];

		int maxc = n - 1;
		int minr = 0;
		int minc = 0;
		int maxr = n - 1;

		int e = n * n;
		int count = 0;

		int j = 0;
		int k = 0;
		while (count < e) {

			for (int i = minr; i <= maxr && count < e; i++) {
				arr[j] = matrix[i][maxc];
				count++;
				j++;
			}
			maxc--;

		}

		for (int i = 0; i < n; i++) {
			for (int o = 0; o < n; o++) {
				matrix[i][o] = arr[k];
				k++;
			}
		}

	}

}
