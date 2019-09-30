package algorithms;

public class FirstFit {

	private double binSize = 1.0;

	public int firstFit(double input[]) {

		int inputLength = input.length;
		int binIndex = 0;

//		List<Double> bins = new ArrayList<Double>(Collections.nCopies(inputLength, 0.0));
		double bins[] = new double[inputLength];
		

		for (int i = 0; i < inputLength; i++) {
			
//			System.out.print("Input " + input[i] + " ");

			boolean flag = false;
			for (int j = 0; j <= binIndex; j++) {

				
				double diff = binSize - bins[j] ;
				if (diff >= input[i]) {

					flag = true;
					bins[j] =  input[i] + bins[j];
					break;
				}
			}
			if (flag == false) {

				++binIndex;
				bins[binIndex] =  input[i];

			}

		}
		
//		System.out.print("\nBins " + Arrays.toString(bins));
//		System.out.print("\nBin Size " + (binIndex + 1));

		return binIndex + 1;
	}

}
