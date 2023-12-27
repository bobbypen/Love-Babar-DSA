package Arrays;

import java.util.ArrayList;

public class CommonElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1 = 6;
		int[] A = { 1, 5, 10, 20, 40, 80 };
		int n2 = 5;
		int[] B = { 6, 7, 20, 80, 100 };
		int n3 = 8;
		int[] C = { 3, 4, 15, 20, 30, 70, 80, 120 };
		
		ArrayList<Integer> ll = new ArrayList<>();

		ll = CommonEle(A, B, C);
		System.out.println(ll);

	}

	public static ArrayList<Integer> CommonEle(int[] A, int[] B, int[] C) {

		ArrayList<Integer> ll = new ArrayList<>();

		int i = 0, j = 0, k = 0;
		int prev = 0;

		while (i < A.length && j < B.length && k < C.length) {

			if (A[i] == B[j] && B[j] == C[k]) {
				if (A[i] != prev) {
					ll.add(A[i]);
					prev = A[i];
				}
				i++;
				j++;
				k++;
			} else if (A[i] <= B[j] && A[i] <= C[k]) {
				i++;
			} else if (B[j] <= A[i] && B[j] <= C[k]) {
				j++;
			} else {
				k++;
			}

		}

		return ll;

	}

}
