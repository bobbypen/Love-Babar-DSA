package Arrays;

public class FindMissingAndRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2;
				int arr[] = {2, 2};
				
				  int ans[] = new int[n + 2];
			        int miss = 0 , repeat = 0;
			        
			        for(int i = 0 ; i<n ; i++){
			           ans[arr[i]]++;
			        }
			        
			        for (int i = 0; i < n; i++) {
						System.out.println(ans[i]);
					}
	}

}
