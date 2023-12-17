package Arrays;

public class Union_and_Intersection_of_two_sorted_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr1 = {1, 3, 4, 5, 7};
		int n = arr1.length;
		
       int arr2[] = {1, 2, 3};
       int m = arr2.length;
       
     int a =  union(arr1,arr2,n,m);
     System.out.println(a);
       
		
	}
	
	
	public static int union(int [] arr1, int []arr2, int n , int m) {
		
		
		int i = 0;
		int j = 0;
		
		int count = 0;
		
		
		while (i < n && j < m) {

			if (arr1[i] < arr2[j]) {
				System.out.print(arr1[i] + " ");
				count++;
				i++;
			} else if (arr2[j] < arr1[i]) {
				System.out.print(arr2[j] + " ");
				j++;
				
				count++;
			} else {
				System.out.print(arr2[j] + " ");
				j++;
				i++;
				count++;
			}

		}

		while (i < n) {
			System.out.print(arr1[i] + " ");
			i++;
			count++;
		}

		while (j < m) {
			System.out.print(arr2[j] + " ");
			j++;
			count++;
		}

		return count;

	}

}
