package Sort_Searching;

public class Smallest_number_with_atleastn_trailing_zeroes_infactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
	int i = 1;   long fact = 1;
	while(i<=n) {
		
		fact = fact * i;
		
		i++;
		
	}
		System.out.println(fact);
		
		
	}
	
	
}
