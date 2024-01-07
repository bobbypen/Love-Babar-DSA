package matrix;

public class ArraysWavePrintRowWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int m = 4; int n = 4;
	int [][] arr =	{{11, 12, 13, 14},
		{21, 22, 23, 24},
		{31, 32, 33, 34},
		{41, 42, 43, 44}};
	
//	
//	Sample Output
//	11, 12, 13, 14, 24, 23, 22, 21, 31, 32, 33, 34, 44, 43, 42, 41, END
	
	
	int minr = 0;
	int minc = 0;
	int maxr = arr.length-1;
	int maxc = arr[0].length-1;
	int e = m*n;
	int count = 0;
	
	while (count < e) {
		
	
	
	
	for (int i = minc; i <= maxc && count < e; i++) {
		System.out.print(arr[minr][i] + ", ");count++;
	}
	minr++;
	
	
	for (int i = maxc; i>=minc && count < e; i--) {
		System.out.print(arr[minr][i] + ", ");count++;
	}
	minr++;
	
		

	}
	System.out.println("END");
	
	}

}
