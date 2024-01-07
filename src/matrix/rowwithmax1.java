package matrix;

public class rowwithmax1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N = 4, M = 4;
		int arr[][] = { { 1, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };

		System.out.println(find(arr, N, M));
	}

	public static int find(int arr[][], int n, int m) {
		int max = 0, row = 0;

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr[0].length; j++) {

				if (arr[i][j] == 1) {
					count++;
				}

			}

			if (count > max) {
				max = Math.max(count, max);
				row = i;
			}

		}
			
		if(max>0) {
		return row;
		}
		
		
		return -1;

	}

}
