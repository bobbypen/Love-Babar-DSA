package Arrays;

public class Trapping_RainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 6;
		int arr[] = {3,0,0,2,0,4};
		
		int left[] = new int[n];
		int right[] = new int[n];
		
		left[0] = arr[0];
		for (int i = 1; i < n; i++) {
			left[i] = Math.max(left[i-1], arr[i]);
		}
		
		
		
		right[n-1] = arr[n-1];
		for (int i = n-2; i >=0; i--) {
			right[i] = Math.max(right[i+1], arr[i]);
		}
		
		
		int ans = 0;
		for (int i = 0; i < n; i++) {
			ans = ans + Math.min(left[i], right[i]) - arr[i];
		}
		
		System.out.println(ans);
		
	}

}
