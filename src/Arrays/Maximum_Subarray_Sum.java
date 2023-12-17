package Arrays;


import java.util.Arrays;

public class Maximum_Subarray_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		
		int Arr[] = {-10,-2,-4,-9};
		Arrays.sort(Arr);
		
		long ans = name(Arr);
		
		
		System.out.println(ans);
	}
	
	public static long name(int [] Arr) {
		
		
long ans = Integer.MIN_VALUE;

//long ans = Integer.MIN_VALUE;
long prev = 0;
for(int i = 0; i<Arr.length; i++){
    
    
    prev = prev + Arr[i];
    ans = Math.max(prev,ans);
    if(prev<0){
        prev = 0;
    }
    
}







		
//TL		
//for (int i = 0; i < Arr.length; i++) {
//			int prev = 0;
//			for (int j = 0; j < Arr.length; j++) {
//				
//				prev = prev + Arr[j];
//				
//				 ans = Math.max(ans, prev);
//				
//				 if (prev<0) {
//					prev=0;
//				}
//				 
//				 
//			}
			
//		}
		return ans;
	}

}
