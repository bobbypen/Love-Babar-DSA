package Arrays;

public class MedianofTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int []nums1 = {1,2}, nums2 = {3,4};
		System.out.println(findMedianSortedArrays(nums1,nums2));
	}

	
	 public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
	        int n = nums1.length;
	        int m = nums2.length;

	        int[]arr = new int[n+m];


	    int i =0,j=0,index=0;

	    while(i < n && j < m){
	        if(nums1[i]<nums2[j]){
	            arr[index] = nums1[i];
	            i++;
	            index++;
	        }else{
	            arr[index] = nums2[j];
	            j++;
	            index++;
	        }
	    }


	    while(i<n){
	        arr[index] = nums1[i];
	        i++;
	        index++;
	    }

	    while(j<m){
	        arr[index] = nums2[j];
	        j++;
	        index++;
	    }
	    
	    
	    if(arr.length%2 != 0) {
	    	double median = arr[arr.length/2];
	    	return median;
	    }
	    
	  
	    
	   int num = arr.length/2;
	    
	    double median = (arr[num-1] + arr[num])/2.0;
//	    median = median * 1.0;
	    return median;




	    }
	}

