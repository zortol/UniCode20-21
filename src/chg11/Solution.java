package chg11;

public class Solution {
	public static int getCheckDigit(String input) {
		if (input.length() == 13 && input.charAt(1) == '-' && input.charAt(4) == '-' && input.charAt(11) == '-') { // format
																													// checker
			int[] list = new int[9];
			int counter = 0;
			for (int i = 0; i < input.length(); i++) {
				if (i == 1 || i == 4 || i == 11) {
					continue;

				} else {
					if (input.charAt(i) == 'x') {
						continue;
					} else {
						list[counter] = Integer.parseInt(Character.toString(input.charAt(i)));
						counter++;
					}
				}
			}
			int numberToBeModded = 0;
			
			for (int i = 0; i < list.length; i++) {
				numberToBeModded = (list[i] * (i+1)) + numberToBeModded;
			}

			return numberToBeModded % 11;
		} else {
			return -1;
		}
	}

	public static void main(String[] args) {
		System.out.println(Solution.getCheckDigit("0-19-852663-x"));
		System.out.println(Character.isLetter('-'));
	}

}