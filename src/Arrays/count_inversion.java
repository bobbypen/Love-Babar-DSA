package Arrays;

public class count_inversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {2, 4, 1, 3, 5};
		int count = 0;

		for (int i = 1; i < arr.length; i++) {

			int picked = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > picked) {
				arr[j + 1] = arr[j];
				j--;
				count++;
			}
			arr[j + 1] = picked;
			

		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println(count);

	}

}
