package Arrays;

import java.util.Arrays;

public class Missingnumberinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Array [] = {5,4,7,9,6,3,2,1,10};
		Arrays.sort(Array);
		 int n =  Array.length;
		 
		 int mis = 1;
		 
		 for (int i = 0; i < Array.length; i++) {
			
			 if (mis == n) {
				System.out.println(mis);
				return;
			}
			 
			 
			 
			 if (mis == Array[i]) {
				mis++;
			} else {
				break;
			}
			 
			 
			 
		}
		 
		 
		 System.out.println(mis);
		 
		 
		 
						
	}

}
