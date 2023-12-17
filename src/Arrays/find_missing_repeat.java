package Arrays;

public class find_missing_repeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {13,33,43,16,25,19,23,31,29,35,10,2,32,11,47,15,34,46,30,26,41,18,5,17,37,39,6,4,20,27,9,3,8,40,24,44,14,36,7,38,12,1,42,12,28,22,45};
		
		int[] ans = findTwoElement(arr);
		
		System.out.println(ans[0] + " " + ans[1]);
//		System.out.println();
	}

	
public static int[] findTwoElement(int arr[]) {
        
		int n = arr.length;
	
        int ans[] = new int[n + 2];
        int miss = 0 , repeat = 0;
        int j = 0;
        for(int i = 0 ; i<n ; i++){
           ans[arr[i]]++;
        }
        
//        for(int i = 0 ; i<n+2 ; i++){
//           System.out.print(ans[i] + " ");
//         }
        
        
        
        for(int i = 1 ; i <=n ; i++){
            if(ans[i] == 2){
                repeat = i;
            }
            else if(ans[i] == 0){
                miss = i;
            }
        }
        return new int[]{repeat , miss};
    }
	
}
