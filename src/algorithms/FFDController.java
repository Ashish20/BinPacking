package algorithms;

import java.util.concurrent.ThreadLocalRandom;

public class FFDController {
	
	public static void main(String args[]) {

		int elementsToBeRead[] = { 500, 1000, 5000, 10000, 20000, 40000, 70000, 100000 };
//		int elementsToBeRead[] = { 10};
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
				

				FFD obj = new FFD();

				int noOfBins = obj.firstFitDec(input);
//
//				System.out.println("Bins used - " + noOfBins);
//				System.out.println("Sum - " + sum);
				
				
				double waste = noOfBins - sum;
				totalWaste +=waste;
							
			}
			finalWaste[j] = totalWaste/noOfRuns;
			
			System.out.print(finalWaste[j] + ",");
		}

	}


}
