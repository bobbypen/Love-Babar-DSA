package Arrays;

import java.util.Arrays;

public class ArraySubsetofanotherarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long a1[] = {11 ,1 ,13 ,21 ,3 ,7}; long n = a1.length;
		long a2[] = {11, 3, 7, 1}; long m = a2.length;
		
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		System.out.println(isSubset(a1,a2,n,m));
		
	}
	public static String isSubset( long a1[], long a2[], long n, long m) {
		  for(int i=0;i<m;i++)
		    {
		        int flag=0;   
		        
		        for(int j=0;j<n;j++)
		        {
		            if(a2[i]==a1[j])
		            {
		                a1[j]=0;
		                flag=1;
		                break;
		            }
		        }
		        
		        if(flag==0)
		        {
		          return "No";
		        }
		        
		    }
		    
		    
		      return "Yes";
		      
		    
		    
		    }
		    
		}