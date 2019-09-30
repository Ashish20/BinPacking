package algorithms;

import java.util.Arrays;

public class BFD {
	
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
	
public int bestFitDec(double input[]) {
		
		Arrays.sort(input);
		
		reverse(input);
		
//		System.out.print(input);
		
		BestFit obj = new BestFit();
		
		return obj.bestFit(input);
		
	
	}


}
