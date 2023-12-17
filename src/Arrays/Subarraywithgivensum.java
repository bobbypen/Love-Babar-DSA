package Arrays;

import java.util.ArrayList;

public class Subarraywithgivensum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				int arr[] = {1,2,3,4};
				int	n = arr.length, s = 0;
		ArrayList<Integer> ss = new ArrayList<>();
		ss = subsum(arr,n,s);
		System.out.println(ss);		
	}
	public static ArrayList<Integer> subsum(int []arr,int n,int s) {
		int sum = 0;
		int start = 0;
		
		ArrayList<Integer> ll = new ArrayList<>();

		
		for (int i = 0; i < n; i++) {
			
			sum = sum + arr[i];
			
			
			
			while (sum>s && start < i) {
				sum = sum - arr[start];
				start++;
			}
			
			if (sum == s) {
				
				ll.add(start+1);
				ll.add(i+1);
				return ll;
				
			}
			
		}
		
		
		ll.add(-1);
		return ll;
		

		
	}
}
