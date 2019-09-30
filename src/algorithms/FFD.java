package algorithms;

import java.util.Arrays;

public class FFD {
	
	public void reverse(double input[]) {
		
		int i = 0, j = input.length - 1;
		
		while(i < j) {
			double temp = input[i];
			input[i] = input [j];
			input[j] = temp;
			++i;
			--j;
		}
	}
	
	public int firstFitDec(double input[]) {
		
		Arrays.sort(input);
		
		reverse(input);
		
//		for(int i =0; i<input.length; i++)
//			System.out.print(input[i] + " ");
		
		FirstFit obj = new FirstFit();
		
		return obj.firstFit(input);
		
	
	}

}
