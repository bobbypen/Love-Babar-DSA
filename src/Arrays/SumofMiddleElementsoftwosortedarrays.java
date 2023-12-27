package Arrays;
import java.util.*;
public class SumofMiddleElementsoftwosortedarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int	N = 5;
				int Ar1[] = {1, 12, 15, 26, 38};
				int Ar2[] = {2, 13, 17, 30, 45};
				int []arr = new int[N+N];
				int index = 0;
				for (int i = 0; i < N; i++) {
					arr[index] = Ar1[i];
					index++;
					arr[index] = Ar2[i];
					index++;
				}
			Arrays.sort(arr);
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println(arr[N-1] + arr[N]);
	}

}
