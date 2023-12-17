package Arrays;

public class Cyclic_Aray_by_one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int [] arr = {1, 2, 3, 4, 5,6,7};
		int n = arr.length;
		
		rotate(arr,n);
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");		}
		
	}
	
	
	public static void rotate(int arr[], int n)
    {
        
        
        
        
        
        
        
        
        
        
        
        reverse(arr,n);
        
        // int last_Num = arr[n-1];
        
        
        // for(int i = n-2 ; i >= 0; i--){
            
        //     arr[i+1] = arr[i];
            
        // }
        
        
        
        // arr[0] = last_Num;
        
        
        // for(int i = 0; i < n; i++){
            
        //   System.out.print(arr[i] + " ");
            
        // }
        
        
        
    }
    
    public static void reverse(int []arr, int n){
        
        
        
        
        
        reverseAlgo(arr,0,n-2);
        
        reverseAlgo(arr,0,n-1);
        
        
    }
    
    public static void reverseAlgo(int []arr, int i,int j){
        
        
        while(i<j){
            
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
            
        }
        
        
        
    }

}
