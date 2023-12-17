package Arrays;

public class majority_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {3};
		int size = a.length;
		
		int count = 1; // kuki hum mann re h ki ek lement to majority me h 
		int MajorityEle = a[0];
		
		// loop to find actual majority number 
		for (int i = 0; i < a.length; i++) {
			
			if (a[i] == MajorityEle) {      // agr koi eleme majority me hua i index pr toh count++
				count++;
			} else {
				count--;					// warna ye confirm ki ki vo number majority me ni h -- krdo
			}
			
			
			if (count == 0 ) {   // agr number major nhi hua toh tohnext ko lekr dekhnge 
				count = 1;
				MajorityEle = a[i];		
			}
			
		}
		
		// to check >n/2
		
		int c = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == MajorityEle) {
				c++;
			}
		}
		
		if (c>size/2) {
			System.out.println(MajorityEle);
		} else {
			System.out.println(-1);
		}
		
	
	
	
	
	}
}
