package matrix;

public class Searchanelementinamatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int [][]	matrix = {{1,3,5,7},
						{10,11,16,20},
						{23,30,34,60}};
			int target = 13;
	
			boolean ans = SEARCH(matrix,target);
			System.out.println(ans);
	}
	
	public static boolean SEARCH(int [] [] matrix,int target ) {
		int minr = 0;
		int maxc = matrix[0].length-1;
		
		while (minr<matrix.length && maxc>=0 ) {
			
			if (matrix[minr][maxc] == target ) {
				return true;
			} else if (matrix[minr][maxc] < target) {
				minr++;
			}else {
				maxc--;
			}
			
			
		}
		
		return false;
		
	}

}
