package algorithms;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NextFit {
	
	private int binSize = 1;
	
	public int nextFit(double input[]) {
	
		int inputLength = input.length;
		int binIndex = 0;
		
//		List<Double> bins = new ArrayList<Double>(Collections.nCopies(inputLength, 0.0));
		double bins[] = new double[inputLength];
		
		for(int i =0; i<inputLength; i++) {
			
//			BigDecimal difference = new BigDecimal(binSize).subtract(new BigDecimal(bins.get(binIndex)));
			if(binSize - bins[binIndex] >=input[i]) {
//			if(difference.doubleValue() >=input[i]) {
				
//				BigDecimal sum = new BigDecimal(input[i]).add(new BigDecimal(bins.get(binIndex)));
//				bins.add(binIndex, sum.doubleValue());
				bins[binIndex] =  input[i] + bins[binIndex];
				
			}else {
				++binIndex;
				bins[binIndex] = input[i];
			}
		}
		
//		System.out.print(bins);
		
		return binIndex+1;
	}

}
