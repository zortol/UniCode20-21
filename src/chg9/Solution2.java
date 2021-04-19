package chg9;

public class Solution2 {
	public static int calculateCapacity(int[] input) {
		StringBuilder build = new StringBuilder();
		int length = input.length; // indexes
		int resin = 0;

		// retrive max value
		System.out.println("Length: " + length);
		int maxValue = 0;
		int maxSoFar = 0;
		for (int i = 0; i < length; i++) {
			maxSoFar = input[i];
			if (maxSoFar > maxValue)
				maxValue = maxSoFar;
		}

		int secondMax = maxValue;
		System.out.println("maxValue: " + maxValue);

		for (int i = 0; i < secondMax; i++) {
			int prevhit = 0; // previous hit
			boolean hitbefore = false; // new row new stuff
			boolean outside = false;
			for (int j = 0; j < length; j++) {
				if (input[j] >= maxValue) {
					build.append("#"); // don't delete this
					if (hitbefore == true && outside == true) {
						resin = resin + (j - prevhit);
					}
					prevhit = j + 1;
					hitbefore = true;
					outside = false;

				} else {
					build.append("-"); // don't delete this
					if (hitbefore == true) {

						outside = true;
					}
				}

			}
			maxValue--;
			System.out.println(build.toString() + " Resins: " + resin);
			// clearing the stringbuilder
			build.setLength(0);
		}

		return resin;
	}

	public static void main(String[] args) {
		System.out.println(Solution2.calculateCapacity(new int[] { 4, 9, 8, 2, 10, 7, 1, 5, 3, 6

		}));
	}

}
