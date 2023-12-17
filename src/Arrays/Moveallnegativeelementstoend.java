package Arrays;

import java.util.ArrayList;

public class Moveallnegativeelementstoend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, -1, 3, 2, -7, -5, 11, 6};
		int n  = arr.length;
		
		Arr(arr,n);
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	
	public static void Arr(int []arr, int n) {
		
		ArrayList<Integer> pos = new ArrayList<>();
		ArrayList<Integer> neg = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]<0) {
				neg.add(arr[i]);
			} else {
				pos.add(arr[i]);
			}
		}
		
		
		int i = 0;
		while (i<pos.size()) {
			arr[i] =pos.get(i);
			i++;
		}
		
		int j = 0;
		while (j<neg.size()) {
			arr[i] =neg.get(j);
			i++;
			j++;
		}
		
	}

}
