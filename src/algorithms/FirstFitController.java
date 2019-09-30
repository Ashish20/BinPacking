package algorithms;

import java.util.concurrent.ThreadLocalRandom;

public class FirstFitController {
	
	public static void main(String args[]) {

		int elementsToBeRead[] = { 500, 1000, 5000, 10000, 20000, 40000, 70000, 100000 };
		double finalWaste[] = new double[elementsToBeRead.length];

		int noOfRuns = 5;

		for (int j = 0; j < elementsToBeRead.length; j++) {

			double totalWaste = 0.0;
			for (int run = 0; run < noOfRuns; run++) {

				int noOfElements = elementsToBeRead[j];

				double input[] = new double[noOfElements];
				
				double sum = 0.0;

				for (int k = 0; k < noOfElements; k++) {
					
					input[k] = ThreadLocalRandom.current().nextDouble(0.0, 0.81);
					sum+=input[k];
				}
				

				FirstFit obj = new FirstFit();

				int noOfBins = obj.firstFit(input);
//
//				System.out.print(noOfBins);
				
				
				double waste = noOfBins - sum;
				totalWaste +=waste;
							
			}
			finalWaste[j] = totalWaste/noOfRuns;
			
			System.out.print(finalWaste[j] + ",");
		}

	}


}
