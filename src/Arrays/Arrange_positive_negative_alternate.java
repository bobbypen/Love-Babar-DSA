package Arrays;

import java.util.ArrayList;

public class Arrange_positive_negative_alternate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = { 2,5,-5,-5,1,-8,-7,-5};
		int n = arr.length;
		Arrange(arr, n);

	}

	public static void Arrange(int[] arr, int n) {

		ArrayList<Integer> pos = new ArrayList<>();
		ArrayList<Integer> neg = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 0) {
				pos.add(arr[i]);
			} else {
				neg.add(arr[i]);

			}
		}

		int i = 0, j = 0, index = 0, check = 0;

		while (i < pos.size() && j < neg.size()) {
			if (check == 0 || check % 2 == 0) {
				arr[index] = pos.get(i);
				i++;
				index++;
			} else {
				arr[index] = neg.get(j);
				j++;
				index++;
			}
			check++;
		}
		
		while (i<pos.size()) {
			arr[index] = pos.get(i);
			i++;
			index++;
		}
		
		
		while (j<neg.size()) {
			arr[index] = neg.get(j);
			j++;
			index++;
		}
		
		
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
		

	}

}
