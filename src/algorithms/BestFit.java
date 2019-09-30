package algorithms;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BestFit {
	
	private double binSize = 1.0;

	public int bestFit(double input[]) {

		int inputLength = input.length;
		int binIndex = 0, bestIndex = 0;

//		List<Double> bins = new ArrayList<Double>(Collections.nCopies(inputLength, 0.0));
		double bins[] = new double[inputLength];

		for (int i = 0; i < inputLength; i++) {
			
			double minSpace = binSize+1;

			for (int j = 0; j <= binIndex; j++) {

				
//				BigDecimal difference = new BigDecimal(binSize).subtract(new BigDecimal(bins.get(j)));
				
//				double diff = difference.doubleValue();
				double diff = binSize - bins[j];
				if (diff <= minSpace && diff >= input[i]) {

					bestIndex = j;
					minSpace = diff;
				}
			}
			
			
			if (minSpace == binSize+1) {

				++binIndex;
				bins[binIndex] =  input[i];

			}else {
				
//				BigDecimal sum = new BigDecimal(input[i]).add(new BigDecimal(bins.get(bestIndex)));
				bins[bestIndex] =  input[i] + bins[bestIndex];
//				bins.add(bestIndex, sum.doubleValue());
//				BigDecimal newDifference = new BigDecimal(minSpace).subtract(new BigDecimal(input[i]));
				
//				minSpace = newDifference.doubleValue();
				minSpace = minSpace - input[i];
			}

		}
		
//		System.out.print(bins);

		return binIndex + 1;
	}
}
